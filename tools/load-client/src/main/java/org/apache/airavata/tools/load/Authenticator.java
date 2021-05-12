package org.apache.airavata.tools.load;

import com.google.protobuf.Value;
import org.apache.airavata.model.security.AuthzToken;
import org.apache.custos.clients.CustosClientProvider;
import org.apache.custos.identity.management.client.IdentityManagementClient;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.keycloak.authorization.client.AuthzClient;
import org.keycloak.authorization.client.Configuration;
import org.keycloak.representations.AccessTokenResponse;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class Authenticator {

    public static AuthzToken getAuthzToken(String userName, String password, String gateway, String keycloakUrl,
                                           String keycloakClientId, String keycloakClientSecret)
            throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {

        Map<String, Object> clientCredentials = new HashMap<>();
        clientCredentials.put("secret", keycloakClientSecret);
        SSLContextBuilder builder = new SSLContextBuilder();
        builder.loadTrustMaterial(null, new TrustSelfSignedStrategy());
        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(builder.build());
        CloseableHttpClient httpclient = HttpClients.custom().setSSLSocketFactory(sslsf).build();

        Configuration configuration = new Configuration(keycloakUrl,
                gateway, keycloakClientId, clientCredentials, httpclient);
        AuthzClient keycloakClient = AuthzClient.create(configuration);
        AccessTokenResponse accessToken = keycloakClient.obtainAccessToken(userName, password);


        AuthzToken authzToken = new AuthzToken();
        Map<String, String> claims = new HashMap<>();
        claims.put("gatewayID", gateway);
        claims.put("userName", userName);
        authzToken.setAccessToken(accessToken.getToken());
        authzToken.setClaimsMap(claims);
        return authzToken;
    }

    public static AuthzToken getAuthzTokenFromCustos(String userName, String password, String gateway, String custosId,
                                                     String custosSec, String custosHost, int custosPort)
            throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException, IOException {
        CustosClientProvider custosClientProvider = new CustosClientProvider.Builder()
                .setServerHost(custosHost)
                .setServerPort(custosPort)
                .setClientId(custosId)
                .setClientSec(custosSec).build();
        IdentityManagementClient identityManagementClient = custosClientProvider.getIdentityManagementClient();

        com.google.protobuf.Struct token = identityManagementClient.
                getToken(null, null, userName, password, null, "password");
        Value accessToken = token.getFieldsMap().get("access_token");

        AuthzToken authzToken = new AuthzToken();
        Map<String, String> claims = new HashMap<>();
        claims.put("gatewayID", gateway);
        claims.put("custosId",custosId);
        claims.put("userName", userName);
        authzToken.setAccessToken(accessToken.getStringValue());
        authzToken.setClaimsMap(claims);
        return authzToken;
    }
}
