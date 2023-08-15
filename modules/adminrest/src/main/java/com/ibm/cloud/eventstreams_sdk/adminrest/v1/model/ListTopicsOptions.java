/*
 * (C) Copyright IBM Corp. 2023.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.eventstreams_sdk.adminrest.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listTopics options.
 */
public class ListTopicsOptions extends GenericModel {

  protected String topicFilter;

  /**
   * Builder.
   */
  public static class Builder {
    private String topicFilter;

    /**
     * Instantiates a new Builder from an existing ListTopicsOptions instance.
     *
     * @param listTopicsOptions the instance to initialize the Builder with
     */
    private Builder(ListTopicsOptions listTopicsOptions) {
      this.topicFilter = listTopicsOptions.topicFilter;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListTopicsOptions.
     *
     * @return the new ListTopicsOptions instance
     */
    public ListTopicsOptions build() {
      return new ListTopicsOptions(this);
    }

    /**
     * Set the topicFilter.
     *
     * @param topicFilter the topicFilter
     * @return the ListTopicsOptions builder
     */
    public Builder topicFilter(String topicFilter) {
      this.topicFilter = topicFilter;
      return this;
    }
  }

  protected ListTopicsOptions() { }

  protected ListTopicsOptions(Builder builder) {
    topicFilter = builder.topicFilter;
  }

  /**
   * New builder.
   *
   * @return a ListTopicsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the topicFilter.
   *
   * A filter to be applied to the topic names. A simple filter can be specified as a string with asterisk (`*`)
   * wildcards representing 0 or more characters, e.g. `topic-name*` will filter all topic names that begin with the
   * string `topic-name` followed by any character sequence. A more complex filter pattern can be used by surrounding a
   * regular expression in forward slash (`/`) delimiters, e.g. `/topic-name.* /`.
   *
   * @return the topicFilter
   */
  public String topicFilter() {
    return topicFilter;
  }
}

