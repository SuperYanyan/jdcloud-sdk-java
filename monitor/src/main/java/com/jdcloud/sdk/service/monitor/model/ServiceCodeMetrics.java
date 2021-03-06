/*
 * Copyright 2018-2025 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;

/**
 * serviceCodeMetrics
 */
public class ServiceCodeMetrics  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * metrics
     */
    private List<MetricDetail> metrics;

    /**
     * serviceCode
     */
    private String serviceCode;


    /**
     * get metrics
     *
     * @return
     */
    public List<MetricDetail> getMetrics() {
        return metrics;
    }

    /**
     * set metrics
     *
     * @param metrics
     */
    public void setMetrics(List<MetricDetail> metrics) {
        this.metrics = metrics;
    }

    /**
     * get serviceCode
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * set metrics
     *
     * @param metrics
     */
    public ServiceCodeMetrics metrics(List<MetricDetail> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public ServiceCodeMetrics serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * add item to metrics
     *
     * @param metric
     */
    public void addMetric(MetricDetail metric) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metric);
    }

}