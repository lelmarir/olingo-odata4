/*
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
package org.apache.olingo.client.core.edm.xml;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import org.apache.olingo.client.api.edm.xml.CommonNavigationProperty;
import org.apache.olingo.client.api.edm.xml.CommonProperty;
import org.apache.olingo.client.api.edm.xml.ComplexType;
import org.apache.olingo.client.core.op.ComplexTypeDeserializer;

@JsonDeserialize(using = ComplexTypeDeserializer.class)
public abstract class AbstractComplexType extends AbstractEdmItem implements ComplexType {

  private static final long serialVersionUID = -4765071294433482957L;

  private String name;

  @Override
  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  @Override
  public CommonProperty getProperty(final String name) {
    return getOneByName(name, getProperties());
  }

  @Override
  public CommonNavigationProperty getNavigationProperty(final String name) {
    return getOneByName(name, getNavigationProperties());
  }
}
