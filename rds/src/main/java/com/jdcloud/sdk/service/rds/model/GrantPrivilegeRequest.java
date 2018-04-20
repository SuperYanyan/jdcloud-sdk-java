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
 * 账号管理
 * API related to Relational Database Service
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.rds.model.AccountPrivilege;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 数据库账号授权
 */
public class GrantPrivilegeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 账号的访问权限
     * Required:true
     */
    @Required
    private List<AccountPrivilege> accountPrivileges;

    /**
     * 地域代码
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例ID
     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * 账户名
     * Required:true
     */
    @Required
    private String accountName;


    /**
     * get 账号的访问权限
     *
     * @return
     */
    public List<AccountPrivilege> getAccountPrivileges() {
        return accountPrivileges;
    }

    /**
     * set 账号的访问权限
     *
     * @param accountPrivileges
     */
    public void setAccountPrivileges(List<AccountPrivilege> accountPrivileges) {
        this.accountPrivileges = accountPrivileges;
    }

    /**
     * get 地域代码
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 账户名
     *
     * @return
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * set 账户名
     *
     * @param accountName
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


    /**
     * set 账号的访问权限
     *
     * @param accountPrivileges
     */
    public GrantPrivilegeRequest accountPrivileges(List<AccountPrivilege> accountPrivileges) {
        this.accountPrivileges = accountPrivileges;
        return this;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public GrantPrivilegeRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public GrantPrivilegeRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 账户名
     *
     * @param accountName
     */
    public GrantPrivilegeRequest accountName(String accountName) {
        this.accountName = accountName;
        return this;
    }


    /**
     * add item to 账号的访问权限
     *
     * @param accountPrivilege
     */
    public void addAccountPrivilege(AccountPrivilege accountPrivilege) {
        if (this.accountPrivileges == null) {
            this.accountPrivileges = new ArrayList<>();
        }
        this.accountPrivileges.add(accountPrivilege);
    }

}