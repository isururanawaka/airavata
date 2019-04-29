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
package org.apache.airavata.sharing.registry.models;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * <p>This is an internal enum type for managing sharings</p>
 * 
 */
public enum SharingType implements org.apache.thrift.TEnum {
  DIRECT_NON_CASCADING(0),
  DIRECT_CASCADING(1),
  INDIRECT_CASCADING(2);

  private final int value;

  private SharingType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static SharingType findByValue(int value) { 
    switch (value) {
      case 0:
        return DIRECT_NON_CASCADING;
      case 1:
        return DIRECT_CASCADING;
      case 2:
        return INDIRECT_CASCADING;
      default:
        return null;
    }
  }
}
