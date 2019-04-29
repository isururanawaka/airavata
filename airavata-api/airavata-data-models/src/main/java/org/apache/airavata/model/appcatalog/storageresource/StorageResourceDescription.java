/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.appcatalog.storageresource;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * Storage Resource Description
 * 
 * storageResourceId: Airavata Internal Unique Identifier to distinguish Compute Resource.
 * 
 * hostName:
 *   Fully Qualified Host Name.
 * 
 * storageResourceDescription:
 *  A user friendly description of the resource.
 * 
 * 
 * DataMovementProtocol:
 *  Option to specify a prefered data movement mechanism of the available options.
 * 
 * 
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)")
public class StorageResourceDescription implements org.apache.thrift.TBase<StorageResourceDescription, StorageResourceDescription._Fields>, java.io.Serializable, Cloneable, Comparable<StorageResourceDescription> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StorageResourceDescription");

  private static final org.apache.thrift.protocol.TField STORAGE_RESOURCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("storageResourceId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField HOST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("hostName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField STORAGE_RESOURCE_DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("storageResourceDescription", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ENABLED_FIELD_DESC = new org.apache.thrift.protocol.TField("enabled", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField DATA_MOVEMENT_INTERFACES_FIELD_DESC = new org.apache.thrift.protocol.TField("dataMovementInterfaces", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new StorageResourceDescriptionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new StorageResourceDescriptionTupleSchemeFactory();

  private java.lang.String storageResourceId; // required
  private java.lang.String hostName; // required
  private java.lang.String storageResourceDescription; // optional
  private boolean enabled; // optional
  private java.util.List<org.apache.airavata.model.data.movement.DataMovementInterface> dataMovementInterfaces; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STORAGE_RESOURCE_ID((short)1, "storageResourceId"),
    HOST_NAME((short)2, "hostName"),
    STORAGE_RESOURCE_DESCRIPTION((short)3, "storageResourceDescription"),
    ENABLED((short)4, "enabled"),
    DATA_MOVEMENT_INTERFACES((short)5, "dataMovementInterfaces");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STORAGE_RESOURCE_ID
          return STORAGE_RESOURCE_ID;
        case 2: // HOST_NAME
          return HOST_NAME;
        case 3: // STORAGE_RESOURCE_DESCRIPTION
          return STORAGE_RESOURCE_DESCRIPTION;
        case 4: // ENABLED
          return ENABLED;
        case 5: // DATA_MOVEMENT_INTERFACES
          return DATA_MOVEMENT_INTERFACES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ENABLED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.STORAGE_RESOURCE_DESCRIPTION,_Fields.ENABLED,_Fields.DATA_MOVEMENT_INTERFACES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STORAGE_RESOURCE_ID, new org.apache.thrift.meta_data.FieldMetaData("storageResourceId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HOST_NAME, new org.apache.thrift.meta_data.FieldMetaData("hostName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STORAGE_RESOURCE_DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("storageResourceDescription", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ENABLED, new org.apache.thrift.meta_data.FieldMetaData("enabled", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DATA_MOVEMENT_INTERFACES, new org.apache.thrift.meta_data.FieldMetaData("dataMovementInterfaces", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.airavata.model.data.movement.DataMovementInterface.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StorageResourceDescription.class, metaDataMap);
  }

  public StorageResourceDescription() {
    this.storageResourceId = "DO_NOT_SET_AT_CLIENTS";

  }

  public StorageResourceDescription(
    java.lang.String storageResourceId,
    java.lang.String hostName)
  {
    this();
    this.storageResourceId = storageResourceId;
    this.hostName = hostName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StorageResourceDescription(StorageResourceDescription other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStorageResourceId()) {
      this.storageResourceId = other.storageResourceId;
    }
    if (other.isSetHostName()) {
      this.hostName = other.hostName;
    }
    if (other.isSetStorageResourceDescription()) {
      this.storageResourceDescription = other.storageResourceDescription;
    }
    this.enabled = other.enabled;
    if (other.isSetDataMovementInterfaces()) {
      java.util.List<org.apache.airavata.model.data.movement.DataMovementInterface> __this__dataMovementInterfaces = new java.util.ArrayList<org.apache.airavata.model.data.movement.DataMovementInterface>(other.dataMovementInterfaces.size());
      for (org.apache.airavata.model.data.movement.DataMovementInterface other_element : other.dataMovementInterfaces) {
        __this__dataMovementInterfaces.add(new org.apache.airavata.model.data.movement.DataMovementInterface(other_element));
      }
      this.dataMovementInterfaces = __this__dataMovementInterfaces;
    }
  }

  public StorageResourceDescription deepCopy() {
    return new StorageResourceDescription(this);
  }

  @Override
  public void clear() {
    this.storageResourceId = "DO_NOT_SET_AT_CLIENTS";

    this.hostName = null;
    this.storageResourceDescription = null;
    setEnabledIsSet(false);
    this.enabled = false;
    this.dataMovementInterfaces = null;
  }

  public java.lang.String getStorageResourceId() {
    return this.storageResourceId;
  }

  public void setStorageResourceId(java.lang.String storageResourceId) {
    this.storageResourceId = storageResourceId;
  }

  public void unsetStorageResourceId() {
    this.storageResourceId = null;
  }

  /** Returns true if field storageResourceId is set (has been assigned a value) and false otherwise */
  public boolean isSetStorageResourceId() {
    return this.storageResourceId != null;
  }

  public void setStorageResourceIdIsSet(boolean value) {
    if (!value) {
      this.storageResourceId = null;
    }
  }

  public java.lang.String getHostName() {
    return this.hostName;
  }

  public void setHostName(java.lang.String hostName) {
    this.hostName = hostName;
  }

  public void unsetHostName() {
    this.hostName = null;
  }

  /** Returns true if field hostName is set (has been assigned a value) and false otherwise */
  public boolean isSetHostName() {
    return this.hostName != null;
  }

  public void setHostNameIsSet(boolean value) {
    if (!value) {
      this.hostName = null;
    }
  }

  public java.lang.String getStorageResourceDescription() {
    return this.storageResourceDescription;
  }

  public void setStorageResourceDescription(java.lang.String storageResourceDescription) {
    this.storageResourceDescription = storageResourceDescription;
  }

  public void unsetStorageResourceDescription() {
    this.storageResourceDescription = null;
  }

  /** Returns true if field storageResourceDescription is set (has been assigned a value) and false otherwise */
  public boolean isSetStorageResourceDescription() {
    return this.storageResourceDescription != null;
  }

  public void setStorageResourceDescriptionIsSet(boolean value) {
    if (!value) {
      this.storageResourceDescription = null;
    }
  }

  public boolean isEnabled() {
    return this.enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
    setEnabledIsSet(true);
  }

  public void unsetEnabled() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ENABLED_ISSET_ID);
  }

  /** Returns true if field enabled is set (has been assigned a value) and false otherwise */
  public boolean isSetEnabled() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ENABLED_ISSET_ID);
  }

  public void setEnabledIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ENABLED_ISSET_ID, value);
  }

  public int getDataMovementInterfacesSize() {
    return (this.dataMovementInterfaces == null) ? 0 : this.dataMovementInterfaces.size();
  }

  public java.util.Iterator<org.apache.airavata.model.data.movement.DataMovementInterface> getDataMovementInterfacesIterator() {
    return (this.dataMovementInterfaces == null) ? null : this.dataMovementInterfaces.iterator();
  }

  public void addToDataMovementInterfaces(org.apache.airavata.model.data.movement.DataMovementInterface elem) {
    if (this.dataMovementInterfaces == null) {
      this.dataMovementInterfaces = new java.util.ArrayList<org.apache.airavata.model.data.movement.DataMovementInterface>();
    }
    this.dataMovementInterfaces.add(elem);
  }

  public java.util.List<org.apache.airavata.model.data.movement.DataMovementInterface> getDataMovementInterfaces() {
    return this.dataMovementInterfaces;
  }

  public void setDataMovementInterfaces(java.util.List<org.apache.airavata.model.data.movement.DataMovementInterface> dataMovementInterfaces) {
    this.dataMovementInterfaces = dataMovementInterfaces;
  }

  public void unsetDataMovementInterfaces() {
    this.dataMovementInterfaces = null;
  }

  /** Returns true if field dataMovementInterfaces is set (has been assigned a value) and false otherwise */
  public boolean isSetDataMovementInterfaces() {
    return this.dataMovementInterfaces != null;
  }

  public void setDataMovementInterfacesIsSet(boolean value) {
    if (!value) {
      this.dataMovementInterfaces = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case STORAGE_RESOURCE_ID:
      if (value == null) {
        unsetStorageResourceId();
      } else {
        setStorageResourceId((java.lang.String)value);
      }
      break;

    case HOST_NAME:
      if (value == null) {
        unsetHostName();
      } else {
        setHostName((java.lang.String)value);
      }
      break;

    case STORAGE_RESOURCE_DESCRIPTION:
      if (value == null) {
        unsetStorageResourceDescription();
      } else {
        setStorageResourceDescription((java.lang.String)value);
      }
      break;

    case ENABLED:
      if (value == null) {
        unsetEnabled();
      } else {
        setEnabled((java.lang.Boolean)value);
      }
      break;

    case DATA_MOVEMENT_INTERFACES:
      if (value == null) {
        unsetDataMovementInterfaces();
      } else {
        setDataMovementInterfaces((java.util.List<org.apache.airavata.model.data.movement.DataMovementInterface>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STORAGE_RESOURCE_ID:
      return getStorageResourceId();

    case HOST_NAME:
      return getHostName();

    case STORAGE_RESOURCE_DESCRIPTION:
      return getStorageResourceDescription();

    case ENABLED:
      return isEnabled();

    case DATA_MOVEMENT_INTERFACES:
      return getDataMovementInterfaces();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STORAGE_RESOURCE_ID:
      return isSetStorageResourceId();
    case HOST_NAME:
      return isSetHostName();
    case STORAGE_RESOURCE_DESCRIPTION:
      return isSetStorageResourceDescription();
    case ENABLED:
      return isSetEnabled();
    case DATA_MOVEMENT_INTERFACES:
      return isSetDataMovementInterfaces();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof StorageResourceDescription)
      return this.equals((StorageResourceDescription)that);
    return false;
  }

  public boolean equals(StorageResourceDescription that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_storageResourceId = true && this.isSetStorageResourceId();
    boolean that_present_storageResourceId = true && that.isSetStorageResourceId();
    if (this_present_storageResourceId || that_present_storageResourceId) {
      if (!(this_present_storageResourceId && that_present_storageResourceId))
        return false;
      if (!this.storageResourceId.equals(that.storageResourceId))
        return false;
    }

    boolean this_present_hostName = true && this.isSetHostName();
    boolean that_present_hostName = true && that.isSetHostName();
    if (this_present_hostName || that_present_hostName) {
      if (!(this_present_hostName && that_present_hostName))
        return false;
      if (!this.hostName.equals(that.hostName))
        return false;
    }

    boolean this_present_storageResourceDescription = true && this.isSetStorageResourceDescription();
    boolean that_present_storageResourceDescription = true && that.isSetStorageResourceDescription();
    if (this_present_storageResourceDescription || that_present_storageResourceDescription) {
      if (!(this_present_storageResourceDescription && that_present_storageResourceDescription))
        return false;
      if (!this.storageResourceDescription.equals(that.storageResourceDescription))
        return false;
    }

    boolean this_present_enabled = true && this.isSetEnabled();
    boolean that_present_enabled = true && that.isSetEnabled();
    if (this_present_enabled || that_present_enabled) {
      if (!(this_present_enabled && that_present_enabled))
        return false;
      if (this.enabled != that.enabled)
        return false;
    }

    boolean this_present_dataMovementInterfaces = true && this.isSetDataMovementInterfaces();
    boolean that_present_dataMovementInterfaces = true && that.isSetDataMovementInterfaces();
    if (this_present_dataMovementInterfaces || that_present_dataMovementInterfaces) {
      if (!(this_present_dataMovementInterfaces && that_present_dataMovementInterfaces))
        return false;
      if (!this.dataMovementInterfaces.equals(that.dataMovementInterfaces))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStorageResourceId()) ? 131071 : 524287);
    if (isSetStorageResourceId())
      hashCode = hashCode * 8191 + storageResourceId.hashCode();

    hashCode = hashCode * 8191 + ((isSetHostName()) ? 131071 : 524287);
    if (isSetHostName())
      hashCode = hashCode * 8191 + hostName.hashCode();

    hashCode = hashCode * 8191 + ((isSetStorageResourceDescription()) ? 131071 : 524287);
    if (isSetStorageResourceDescription())
      hashCode = hashCode * 8191 + storageResourceDescription.hashCode();

    hashCode = hashCode * 8191 + ((isSetEnabled()) ? 131071 : 524287);
    if (isSetEnabled())
      hashCode = hashCode * 8191 + ((enabled) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetDataMovementInterfaces()) ? 131071 : 524287);
    if (isSetDataMovementInterfaces())
      hashCode = hashCode * 8191 + dataMovementInterfaces.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(StorageResourceDescription other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStorageResourceId()).compareTo(other.isSetStorageResourceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStorageResourceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.storageResourceId, other.storageResourceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetHostName()).compareTo(other.isSetHostName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHostName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hostName, other.hostName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStorageResourceDescription()).compareTo(other.isSetStorageResourceDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStorageResourceDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.storageResourceDescription, other.storageResourceDescription);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEnabled()).compareTo(other.isSetEnabled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnabled()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.enabled, other.enabled);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDataMovementInterfaces()).compareTo(other.isSetDataMovementInterfaces());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataMovementInterfaces()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataMovementInterfaces, other.dataMovementInterfaces);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("StorageResourceDescription(");
    boolean first = true;

    sb.append("storageResourceId:");
    if (this.storageResourceId == null) {
      sb.append("null");
    } else {
      sb.append(this.storageResourceId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hostName:");
    if (this.hostName == null) {
      sb.append("null");
    } else {
      sb.append(this.hostName);
    }
    first = false;
    if (isSetStorageResourceDescription()) {
      if (!first) sb.append(", ");
      sb.append("storageResourceDescription:");
      if (this.storageResourceDescription == null) {
        sb.append("null");
      } else {
        sb.append(this.storageResourceDescription);
      }
      first = false;
    }
    if (isSetEnabled()) {
      if (!first) sb.append(", ");
      sb.append("enabled:");
      sb.append(this.enabled);
      first = false;
    }
    if (isSetDataMovementInterfaces()) {
      if (!first) sb.append(", ");
      sb.append("dataMovementInterfaces:");
      if (this.dataMovementInterfaces == null) {
        sb.append("null");
      } else {
        sb.append(this.dataMovementInterfaces);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetStorageResourceId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'storageResourceId' is unset! Struct:" + toString());
    }

    if (!isSetHostName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'hostName' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StorageResourceDescriptionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StorageResourceDescriptionStandardScheme getScheme() {
      return new StorageResourceDescriptionStandardScheme();
    }
  }

  private static class StorageResourceDescriptionStandardScheme extends org.apache.thrift.scheme.StandardScheme<StorageResourceDescription> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StorageResourceDescription struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STORAGE_RESOURCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.storageResourceId = iprot.readString();
              struct.setStorageResourceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HOST_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hostName = iprot.readString();
              struct.setHostNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STORAGE_RESOURCE_DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.storageResourceDescription = iprot.readString();
              struct.setStorageResourceDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ENABLED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.enabled = iprot.readBool();
              struct.setEnabledIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DATA_MOVEMENT_INTERFACES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.dataMovementInterfaces = new java.util.ArrayList<org.apache.airavata.model.data.movement.DataMovementInterface>(_list0.size);
                org.apache.airavata.model.data.movement.DataMovementInterface _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new org.apache.airavata.model.data.movement.DataMovementInterface();
                  _elem1.read(iprot);
                  struct.dataMovementInterfaces.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setDataMovementInterfacesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, StorageResourceDescription struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.storageResourceId != null) {
        oprot.writeFieldBegin(STORAGE_RESOURCE_ID_FIELD_DESC);
        oprot.writeString(struct.storageResourceId);
        oprot.writeFieldEnd();
      }
      if (struct.hostName != null) {
        oprot.writeFieldBegin(HOST_NAME_FIELD_DESC);
        oprot.writeString(struct.hostName);
        oprot.writeFieldEnd();
      }
      if (struct.storageResourceDescription != null) {
        if (struct.isSetStorageResourceDescription()) {
          oprot.writeFieldBegin(STORAGE_RESOURCE_DESCRIPTION_FIELD_DESC);
          oprot.writeString(struct.storageResourceDescription);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetEnabled()) {
        oprot.writeFieldBegin(ENABLED_FIELD_DESC);
        oprot.writeBool(struct.enabled);
        oprot.writeFieldEnd();
      }
      if (struct.dataMovementInterfaces != null) {
        if (struct.isSetDataMovementInterfaces()) {
          oprot.writeFieldBegin(DATA_MOVEMENT_INTERFACES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.dataMovementInterfaces.size()));
            for (org.apache.airavata.model.data.movement.DataMovementInterface _iter3 : struct.dataMovementInterfaces)
            {
              _iter3.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StorageResourceDescriptionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StorageResourceDescriptionTupleScheme getScheme() {
      return new StorageResourceDescriptionTupleScheme();
    }
  }

  private static class StorageResourceDescriptionTupleScheme extends org.apache.thrift.scheme.TupleScheme<StorageResourceDescription> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StorageResourceDescription struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.storageResourceId);
      oprot.writeString(struct.hostName);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStorageResourceDescription()) {
        optionals.set(0);
      }
      if (struct.isSetEnabled()) {
        optionals.set(1);
      }
      if (struct.isSetDataMovementInterfaces()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStorageResourceDescription()) {
        oprot.writeString(struct.storageResourceDescription);
      }
      if (struct.isSetEnabled()) {
        oprot.writeBool(struct.enabled);
      }
      if (struct.isSetDataMovementInterfaces()) {
        {
          oprot.writeI32(struct.dataMovementInterfaces.size());
          for (org.apache.airavata.model.data.movement.DataMovementInterface _iter4 : struct.dataMovementInterfaces)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StorageResourceDescription struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.storageResourceId = iprot.readString();
      struct.setStorageResourceIdIsSet(true);
      struct.hostName = iprot.readString();
      struct.setHostNameIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.storageResourceDescription = iprot.readString();
        struct.setStorageResourceDescriptionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.enabled = iprot.readBool();
        struct.setEnabledIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.dataMovementInterfaces = new java.util.ArrayList<org.apache.airavata.model.data.movement.DataMovementInterface>(_list5.size);
          org.apache.airavata.model.data.movement.DataMovementInterface _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new org.apache.airavata.model.data.movement.DataMovementInterface();
            _elem6.read(iprot);
            struct.dataMovementInterfaces.add(_elem6);
          }
        }
        struct.setDataMovementInterfacesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

