package org.apache.airavata.monitor;

import org.apache.airavata.common.exception.ApplicationSettingsException;
import org.apache.airavata.common.utils.ServerSettings;
import org.apache.airavata.common.utils.ThriftClientPool;
import org.apache.airavata.model.job.JobModel;
import org.apache.airavata.monitor.kafka.MessageProducer;
import org.apache.airavata.registry.api.RegistryService;
import org.apache.commons.pool.impl.GenericObjectPool;
import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class AbstractMonitor {

    private static final Logger log = LoggerFactory.getLogger(AbstractMonitor.class);

    private MessageProducer messageProducer;
    private CuratorFramework curatorClient;
    private ThriftClientPool<RegistryService.Client> registryClientPool;

    public AbstractMonitor() throws ApplicationSettingsException {
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
        this.curatorClient = CuratorFrameworkFactory.newClient(ServerSettings.getZookeeperConnection(), retryPolicy);
        this.curatorClient.start();
        this.initRegistryClientPool();
        messageProducer = new MessageProducer();
    }

    private void initRegistryClientPool() throws ApplicationSettingsException {

        GenericObjectPool.Config poolConfig = new GenericObjectPool.Config();
        poolConfig.maxActive = 100;
        poolConfig.minIdle = 5;
        poolConfig.whenExhaustedAction = GenericObjectPool.WHEN_EXHAUSTED_BLOCK;
        poolConfig.testOnBorrow = true;
        poolConfig.testWhileIdle = true;
        poolConfig.numTestsPerEvictionRun = 10;
        poolConfig.maxWait = 3000;

        this.registryClientPool = new ThriftClientPool<>(
                RegistryService.Client::new, poolConfig, ServerSettings.getRegistryServerHost(),
                Integer.parseInt(ServerSettings.getRegistryServerPort()));
    }

    private boolean validateJobStatus(JobStatusResult jobStatusResult) {
        RegistryService.Client registryClient = getRegistryClientPool().getResource();
        boolean validated = true;
        try {
            List<JobModel> jobs = registryClient.getJobs("jobId", jobStatusResult.getJobId());

            if (jobs.size() != 1) {
                log.error("More than one job for job id " + jobStatusResult.getJobId() + " in the registry. Count " + jobs.size());
                validated = false;

            } else  {
                JobModel jobModel = jobs.get(0);

                String processId = jobModel.getProcessId();
                String experimentId = registryClient.getProcess(processId).getExperimentId();

                if (experimentId != null && processId != null) {
                    log.info("Job id " + jobStatusResult.getJobId() + " is owned by process " + processId + " of experiment " + experimentId);
                    validated = true;
                } else {
                    log.error("Experiment or process is null for job " + jobStatusResult.getJobId());
                    validated = false;
                }
            }
            getRegistryClientPool().returnResource(registryClient);
            return validated;

        } catch (Exception e) {
            log.error("Error at validating job status " + jobStatusResult.getJobId(), e);
            getRegistryClientPool().returnBrokenResource(registryClient);
            return false;
        }

    }

    public void submitJobStatus(JobStatusResult jobStatusResult) throws MonitoringException {
        try {
            if (validateJobStatus(jobStatusResult)) {
                messageProducer.submitMessageToQueue(jobStatusResult);
            } else {
                throw new MonitoringException("Failed to validate job status for job id " + jobStatusResult.getJobId());
            }
        } catch (Exception e) {
            throw new MonitoringException("Failed to submit job status for job id " + jobStatusResult.getJobId() + " to status queue", e);
        }
    }

    public ThriftClientPool<RegistryService.Client> getRegistryClientPool() {
        return registryClientPool;
    }
}
