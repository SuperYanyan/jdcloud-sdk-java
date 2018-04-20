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
 * 安全组
 * 安全组相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.vpc.model.NetworkSecurityGroup;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询安全组列表
 */
public class DescribeNetworkSecurityGroupsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * networkSecurityGroups
     */
    private List<NetworkSecurityGroup> networkSecurityGroups;

    /**
     * 总数量
     */
    private Number totalCount;


    /**
     * get networkSecurityGroups
     *
     * @return
     */
    public List<NetworkSecurityGroup> getNetworkSecurityGroups() {
        return networkSecurityGroups;
    }

    /**
     * set networkSecurityGroups
     *
     * @param networkSecurityGroups
     */
    public void setNetworkSecurityGroups(List<NetworkSecurityGroup> networkSecurityGroups) {
        this.networkSecurityGroups = networkSecurityGroups;
    }

    /**
     * get 总数量
     *
     * @return
     */
    public Number getTotalCount() {
        return totalCount;
    }

    /**
     * set 总数量
     *
     * @param totalCount
     */
    public void setTotalCount(Number totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set networkSecurityGroups
     *
     * @param networkSecurityGroups
     */
    public DescribeNetworkSecurityGroupsResult networkSecurityGroups(List<NetworkSecurityGroup> networkSecurityGroups) {
        this.networkSecurityGroups = networkSecurityGroups;
        return this;
    }

    /**
     * set 总数量
     *
     * @param totalCount
     */
    public DescribeNetworkSecurityGroupsResult totalCount(Number totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to networkSecurityGroups
     *
     * @param networkSecurityGroup
     */
    public void addNetworkSecurityGroup(NetworkSecurityGroup networkSecurityGroup) {
        if (this.networkSecurityGroups == null) {
            this.networkSecurityGroups = new ArrayList<>();
        }
        this.networkSecurityGroups.add(networkSecurityGroup);
    }

}