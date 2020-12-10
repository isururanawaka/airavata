/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.sharing.registry.models;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * <p>Domain is the entity that enables multi-tenency in this componenet. Every tenant will be
 * operating separately it's own silo which is identified by the domain id. In the current implementation domain id
 * will be same as the domain name</p>
 * <li>domainId : Will be generated by the server based on the domain name</li>
 * <li><b>name</b> : A single word name that identifies the domain e.g seagrid, ultrascan</li>
 * <li>description : A short description for the domain</li>
 * <li>createdTime : Will be set by the system</li>
 * <li>updatedTime : Will be set by the system</li>
 * <li>initialUserGroupId : New users will automatically be added to this group</li>
 * 
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)")
public class Domain implements org.apache.thrift.TBase<Domain, Domain._Fields>, java.io.Serializable, Cloneable, Comparable<Domain> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Domain");

  private static final org.apache.thrift.protocol.TField DOMAIN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("domainId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CREATED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createdTime", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField UPDATED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("updatedTime", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField INITIAL_USER_GROUP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("initialUserGroupId", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DomainStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DomainTupleSchemeFactory();

  public java.lang.String domainId; // optional
  public java.lang.String name; // optional
  public java.lang.String description; // optional
  public long createdTime; // optional
  public long updatedTime; // optional
  public java.lang.String initialUserGroupId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DOMAIN_ID((short)1, "domainId"),
    NAME((short)2, "name"),
    DESCRIPTION((short)3, "description"),
    CREATED_TIME((short)4, "createdTime"),
    UPDATED_TIME((short)5, "updatedTime"),
    INITIAL_USER_GROUP_ID((short)6, "initialUserGroupId");

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
        case 1: // DOMAIN_ID
          return DOMAIN_ID;
        case 2: // NAME
          return NAME;
        case 3: // DESCRIPTION
          return DESCRIPTION;
        case 4: // CREATED_TIME
          return CREATED_TIME;
        case 5: // UPDATED_TIME
          return UPDATED_TIME;
        case 6: // INITIAL_USER_GROUP_ID
          return INITIAL_USER_GROUP_ID;
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
  private static final int __CREATEDTIME_ISSET_ID = 0;
  private static final int __UPDATEDTIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.DOMAIN_ID,_Fields.NAME,_Fields.DESCRIPTION,_Fields.CREATED_TIME,_Fields.UPDATED_TIME,_Fields.INITIAL_USER_GROUP_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DOMAIN_ID, new org.apache.thrift.meta_data.FieldMetaData("domainId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("description", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATED_TIME, new org.apache.thrift.meta_data.FieldMetaData("createdTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.UPDATED_TIME, new org.apache.thrift.meta_data.FieldMetaData("updatedTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.INITIAL_USER_GROUP_ID, new org.apache.thrift.meta_data.FieldMetaData("initialUserGroupId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Domain.class, metaDataMap);
  }

  public Domain() {
    this.domainId = "DO_NOT_SET_AT_CLIENTS_ID";

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Domain(Domain other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetDomainId()) {
      this.domainId = other.domainId;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetDescription()) {
      this.description = other.description;
    }
    this.createdTime = other.createdTime;
    this.updatedTime = other.updatedTime;
    if (other.isSetInitialUserGroupId()) {
      this.initialUserGroupId = other.initialUserGroupId;
    }
  }

  public Domain deepCopy() {
    return new Domain(this);
  }

  @Override
  public void clear() {
    this.domainId = "DO_NOT_SET_AT_CLIENTS_ID";

    this.name = null;
    this.description = null;
    setCreatedTimeIsSet(false);
    this.createdTime = 0;
    setUpdatedTimeIsSet(false);
    this.updatedTime = 0;
    this.initialUserGroupId = null;
  }

  public java.lang.String getDomainId() {
    return this.domainId;
  }

  public Domain setDomainId(java.lang.String domainId) {
    this.domainId = domainId;
    return this;
  }

  public void unsetDomainId() {
    this.domainId = null;
  }

  /** Returns true if field domainId is set (has been assigned a value) and false otherwise */
  public boolean isSetDomainId() {
    return this.domainId != null;
  }

  public void setDomainIdIsSet(boolean value) {
    if (!value) {
      this.domainId = null;
    }
  }

  public java.lang.String getName() {
    return this.name;
  }

  public Domain setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public java.lang.String getDescription() {
    return this.description;
  }

  public Domain setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  public void unsetDescription() {
    this.description = null;
  }

  /** Returns true if field description is set (has been assigned a value) and false otherwise */
  public boolean isSetDescription() {
    return this.description != null;
  }

  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.description = null;
    }
  }

  public long getCreatedTime() {
    return this.createdTime;
  }

  public Domain setCreatedTime(long createdTime) {
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    return this;
  }

  public void unsetCreatedTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CREATEDTIME_ISSET_ID);
  }

  /** Returns true if field createdTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CREATEDTIME_ISSET_ID);
  }

  public void setCreatedTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CREATEDTIME_ISSET_ID, value);
  }

  public long getUpdatedTime() {
    return this.updatedTime;
  }

  public Domain setUpdatedTime(long updatedTime) {
    this.updatedTime = updatedTime;
    setUpdatedTimeIsSet(true);
    return this;
  }

  public void unsetUpdatedTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __UPDATEDTIME_ISSET_ID);
  }

  /** Returns true if field updatedTime is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdatedTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __UPDATEDTIME_ISSET_ID);
  }

  public void setUpdatedTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __UPDATEDTIME_ISSET_ID, value);
  }

  public java.lang.String getInitialUserGroupId() {
    return this.initialUserGroupId;
  }

  public Domain setInitialUserGroupId(java.lang.String initialUserGroupId) {
    this.initialUserGroupId = initialUserGroupId;
    return this;
  }

  public void unsetInitialUserGroupId() {
    this.initialUserGroupId = null;
  }

  /** Returns true if field initialUserGroupId is set (has been assigned a value) and false otherwise */
  public boolean isSetInitialUserGroupId() {
    return this.initialUserGroupId != null;
  }

  public void setInitialUserGroupIdIsSet(boolean value) {
    if (!value) {
      this.initialUserGroupId = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case DOMAIN_ID:
      if (value == null) {
        unsetDomainId();
      } else {
        setDomainId((java.lang.String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case DESCRIPTION:
      if (value == null) {
        unsetDescription();
      } else {
        setDescription((java.lang.String)value);
      }
      break;

    case CREATED_TIME:
      if (value == null) {
        unsetCreatedTime();
      } else {
        setCreatedTime((java.lang.Long)value);
      }
      break;

    case UPDATED_TIME:
      if (value == null) {
        unsetUpdatedTime();
      } else {
        setUpdatedTime((java.lang.Long)value);
      }
      break;

    case INITIAL_USER_GROUP_ID:
      if (value == null) {
        unsetInitialUserGroupId();
      } else {
        setInitialUserGroupId((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DOMAIN_ID:
      return getDomainId();

    case NAME:
      return getName();

    case DESCRIPTION:
      return getDescription();

    case CREATED_TIME:
      return getCreatedTime();

    case UPDATED_TIME:
      return getUpdatedTime();

    case INITIAL_USER_GROUP_ID:
      return getInitialUserGroupId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case DOMAIN_ID:
      return isSetDomainId();
    case NAME:
      return isSetName();
    case DESCRIPTION:
      return isSetDescription();
    case CREATED_TIME:
      return isSetCreatedTime();
    case UPDATED_TIME:
      return isSetUpdatedTime();
    case INITIAL_USER_GROUP_ID:
      return isSetInitialUserGroupId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Domain)
      return this.equals((Domain)that);
    return false;
  }

  public boolean equals(Domain that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_domainId = true && this.isSetDomainId();
    boolean that_present_domainId = true && that.isSetDomainId();
    if (this_present_domainId || that_present_domainId) {
      if (!(this_present_domainId && that_present_domainId))
        return false;
      if (!this.domainId.equals(that.domainId))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_description = true && this.isSetDescription();
    boolean that_present_description = true && that.isSetDescription();
    if (this_present_description || that_present_description) {
      if (!(this_present_description && that_present_description))
        return false;
      if (!this.description.equals(that.description))
        return false;
    }

    boolean this_present_createdTime = true && this.isSetCreatedTime();
    boolean that_present_createdTime = true && that.isSetCreatedTime();
    if (this_present_createdTime || that_present_createdTime) {
      if (!(this_present_createdTime && that_present_createdTime))
        return false;
      if (this.createdTime != that.createdTime)
        return false;
    }

    boolean this_present_updatedTime = true && this.isSetUpdatedTime();
    boolean that_present_updatedTime = true && that.isSetUpdatedTime();
    if (this_present_updatedTime || that_present_updatedTime) {
      if (!(this_present_updatedTime && that_present_updatedTime))
        return false;
      if (this.updatedTime != that.updatedTime)
        return false;
    }

    boolean this_present_initialUserGroupId = true && this.isSetInitialUserGroupId();
    boolean that_present_initialUserGroupId = true && that.isSetInitialUserGroupId();
    if (this_present_initialUserGroupId || that_present_initialUserGroupId) {
      if (!(this_present_initialUserGroupId && that_present_initialUserGroupId))
        return false;
      if (!this.initialUserGroupId.equals(that.initialUserGroupId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetDomainId()) ? 131071 : 524287);
    if (isSetDomainId())
      hashCode = hashCode * 8191 + domainId.hashCode();

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetDescription()) ? 131071 : 524287);
    if (isSetDescription())
      hashCode = hashCode * 8191 + description.hashCode();

    hashCode = hashCode * 8191 + ((isSetCreatedTime()) ? 131071 : 524287);
    if (isSetCreatedTime())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(createdTime);

    hashCode = hashCode * 8191 + ((isSetUpdatedTime()) ? 131071 : 524287);
    if (isSetUpdatedTime())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(updatedTime);

    hashCode = hashCode * 8191 + ((isSetInitialUserGroupId()) ? 131071 : 524287);
    if (isSetInitialUserGroupId())
      hashCode = hashCode * 8191 + initialUserGroupId.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Domain other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetDomainId()).compareTo(other.isSetDomainId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDomainId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.domainId, other.domainId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDescription()).compareTo(other.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.description, other.description);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCreatedTime()).compareTo(other.isSetCreatedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdTime, other.createdTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUpdatedTime()).compareTo(other.isSetUpdatedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdatedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updatedTime, other.updatedTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetInitialUserGroupId()).compareTo(other.isSetInitialUserGroupId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInitialUserGroupId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.initialUserGroupId, other.initialUserGroupId);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Domain(");
    boolean first = true;

    if (isSetDomainId()) {
      sb.append("domainId:");
      if (this.domainId == null) {
        sb.append("null");
      } else {
        sb.append(this.domainId);
      }
      first = false;
    }
    if (isSetName()) {
      if (!first) sb.append(", ");
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetDescription()) {
      if (!first) sb.append(", ");
      sb.append("description:");
      if (this.description == null) {
        sb.append("null");
      } else {
        sb.append(this.description);
      }
      first = false;
    }
    if (isSetCreatedTime()) {
      if (!first) sb.append(", ");
      sb.append("createdTime:");
      sb.append(this.createdTime);
      first = false;
    }
    if (isSetUpdatedTime()) {
      if (!first) sb.append(", ");
      sb.append("updatedTime:");
      sb.append(this.updatedTime);
      first = false;
    }
    if (isSetInitialUserGroupId()) {
      if (!first) sb.append(", ");
      sb.append("initialUserGroupId:");
      if (this.initialUserGroupId == null) {
        sb.append("null");
      } else {
        sb.append(this.initialUserGroupId);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class DomainStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DomainStandardScheme getScheme() {
      return new DomainStandardScheme();
    }
  }

  private static class DomainStandardScheme extends org.apache.thrift.scheme.StandardScheme<Domain> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Domain struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DOMAIN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.domainId = iprot.readString();
              struct.setDomainIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.description = iprot.readString();
              struct.setDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CREATED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.createdTime = iprot.readI64();
              struct.setCreatedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // UPDATED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.updatedTime = iprot.readI64();
              struct.setUpdatedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // INITIAL_USER_GROUP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.initialUserGroupId = iprot.readString();
              struct.setInitialUserGroupIdIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Domain struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.domainId != null) {
        if (struct.isSetDomainId()) {
          oprot.writeFieldBegin(DOMAIN_ID_FIELD_DESC);
          oprot.writeString(struct.domainId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.description != null) {
        if (struct.isSetDescription()) {
          oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
          oprot.writeString(struct.description);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetCreatedTime()) {
        oprot.writeFieldBegin(CREATED_TIME_FIELD_DESC);
        oprot.writeI64(struct.createdTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetUpdatedTime()) {
        oprot.writeFieldBegin(UPDATED_TIME_FIELD_DESC);
        oprot.writeI64(struct.updatedTime);
        oprot.writeFieldEnd();
      }
      if (struct.initialUserGroupId != null) {
        if (struct.isSetInitialUserGroupId()) {
          oprot.writeFieldBegin(INITIAL_USER_GROUP_ID_FIELD_DESC);
          oprot.writeString(struct.initialUserGroupId);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DomainTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DomainTupleScheme getScheme() {
      return new DomainTupleScheme();
    }
  }

  private static class DomainTupleScheme extends org.apache.thrift.scheme.TupleScheme<Domain> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Domain struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDomainId()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetDescription()) {
        optionals.set(2);
      }
      if (struct.isSetCreatedTime()) {
        optionals.set(3);
      }
      if (struct.isSetUpdatedTime()) {
        optionals.set(4);
      }
      if (struct.isSetInitialUserGroupId()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetDomainId()) {
        oprot.writeString(struct.domainId);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetDescription()) {
        oprot.writeString(struct.description);
      }
      if (struct.isSetCreatedTime()) {
        oprot.writeI64(struct.createdTime);
      }
      if (struct.isSetUpdatedTime()) {
        oprot.writeI64(struct.updatedTime);
      }
      if (struct.isSetInitialUserGroupId()) {
        oprot.writeString(struct.initialUserGroupId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Domain struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.domainId = iprot.readString();
        struct.setDomainIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.description = iprot.readString();
        struct.setDescriptionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.createdTime = iprot.readI64();
        struct.setCreatedTimeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.updatedTime = iprot.readI64();
        struct.setUpdatedTimeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.initialUserGroupId = iprot.readString();
        struct.setInitialUserGroupIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

