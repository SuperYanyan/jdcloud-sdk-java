/*
 * Copyright 2018 JDCLOUD.COM
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
 * 云主机
 * 云主机实例、镜像、规格类型、实例模板、配额相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.vm.model.AttachDiskRequest;
import com.jdcloud.sdk.service.vm.model.AttachDiskResponse;
import com.jdcloud.sdk.service.vm.client.AttachDiskExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeImageMembersRequest;
import com.jdcloud.sdk.service.vm.model.DescribeImageMembersResponse;
import com.jdcloud.sdk.service.vm.client.DescribeImageMembersExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeImageRequest;
import com.jdcloud.sdk.service.vm.model.DescribeImageResponse;
import com.jdcloud.sdk.service.vm.client.DescribeImageExecutor;
import com.jdcloud.sdk.service.vm.model.RebuildInstanceRequest;
import com.jdcloud.sdk.service.vm.model.RebuildInstanceResponse;
import com.jdcloud.sdk.service.vm.client.RebuildInstanceExecutor;
import com.jdcloud.sdk.service.vm.model.RebootInstanceRequest;
import com.jdcloud.sdk.service.vm.model.RebootInstanceResponse;
import com.jdcloud.sdk.service.vm.client.RebootInstanceExecutor;
import com.jdcloud.sdk.service.vm.model.ShareImageRequest;
import com.jdcloud.sdk.service.vm.model.ShareImageResponse;
import com.jdcloud.sdk.service.vm.client.ShareImageExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeImagesRequest;
import com.jdcloud.sdk.service.vm.model.DescribeImagesResponse;
import com.jdcloud.sdk.service.vm.client.DescribeImagesExecutor;
import com.jdcloud.sdk.service.vm.model.StopInstanceRequest;
import com.jdcloud.sdk.service.vm.model.StopInstanceResponse;
import com.jdcloud.sdk.service.vm.client.StopInstanceExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceVncUrlRequest;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceVncUrlResponse;
import com.jdcloud.sdk.service.vm.client.DescribeInstanceVncUrlExecutor;
import com.jdcloud.sdk.service.vm.model.DeleteImageRequest;
import com.jdcloud.sdk.service.vm.model.DeleteImageResponse;
import com.jdcloud.sdk.service.vm.client.DeleteImageExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceRequest;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceResponse;
import com.jdcloud.sdk.service.vm.client.DescribeInstanceExecutor;
import com.jdcloud.sdk.service.vm.model.ResizeInstanceRequest;
import com.jdcloud.sdk.service.vm.model.ResizeInstanceResponse;
import com.jdcloud.sdk.service.vm.client.ResizeInstanceExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeQuotasRequest;
import com.jdcloud.sdk.service.vm.model.DescribeQuotasResponse;
import com.jdcloud.sdk.service.vm.client.DescribeQuotasExecutor;
import com.jdcloud.sdk.service.vm.model.CreateImageRequest;
import com.jdcloud.sdk.service.vm.model.CreateImageResponse;
import com.jdcloud.sdk.service.vm.client.CreateImageExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeInstancesRequest;
import com.jdcloud.sdk.service.vm.model.DescribeInstancesResponse;
import com.jdcloud.sdk.service.vm.client.DescribeInstancesExecutor;
import com.jdcloud.sdk.service.vm.model.CreateInstancesRequest;
import com.jdcloud.sdk.service.vm.model.CreateInstancesResponse;
import com.jdcloud.sdk.service.vm.client.CreateInstancesExecutor;
import com.jdcloud.sdk.service.vm.model.UnShareImageRequest;
import com.jdcloud.sdk.service.vm.model.UnShareImageResponse;
import com.jdcloud.sdk.service.vm.client.UnShareImageExecutor;
import com.jdcloud.sdk.service.vm.model.ModifyInstancePasswordRequest;
import com.jdcloud.sdk.service.vm.model.ModifyInstancePasswordResponse;
import com.jdcloud.sdk.service.vm.client.ModifyInstancePasswordExecutor;
import com.jdcloud.sdk.service.vm.model.ModifyInstanceAttributeRequest;
import com.jdcloud.sdk.service.vm.model.ModifyInstanceAttributeResponse;
import com.jdcloud.sdk.service.vm.client.ModifyInstanceAttributeExecutor;
import com.jdcloud.sdk.service.vm.model.DisassociateElasticIpRequest;
import com.jdcloud.sdk.service.vm.model.DisassociateElasticIpResponse;
import com.jdcloud.sdk.service.vm.client.DisassociateElasticIpExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeImageConstraintsRequest;
import com.jdcloud.sdk.service.vm.model.DescribeImageConstraintsResponse;
import com.jdcloud.sdk.service.vm.client.DescribeImageConstraintsExecutor;
import com.jdcloud.sdk.service.vm.model.StartInstanceRequest;
import com.jdcloud.sdk.service.vm.model.StartInstanceResponse;
import com.jdcloud.sdk.service.vm.client.StartInstanceExecutor;
import com.jdcloud.sdk.service.vm.model.DeleteInstanceRequest;
import com.jdcloud.sdk.service.vm.model.DeleteInstanceResponse;
import com.jdcloud.sdk.service.vm.client.DeleteInstanceExecutor;
import com.jdcloud.sdk.service.vm.model.AssociateElasticIpRequest;
import com.jdcloud.sdk.service.vm.model.AssociateElasticIpResponse;
import com.jdcloud.sdk.service.vm.client.AssociateElasticIpExecutor;
import com.jdcloud.sdk.service.vm.model.DetachDiskRequest;
import com.jdcloud.sdk.service.vm.model.DetachDiskResponse;
import com.jdcloud.sdk.service.vm.client.DetachDiskExecutor;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceTypesRequest;
import com.jdcloud.sdk.service.vm.model.DescribeInstanceTypesResponse;
import com.jdcloud.sdk.service.vm.client.DescribeInstanceTypesExecutor;

/**
 * vmClient
 */
public class VmClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.0.1";
    public final static String DefaultEndpoint = "vm.jdcloud-api.com";
    public final static String ServiceName = "vm";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private VmClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 云主机挂载硬盘，主机和云盘没有未完成的任务时才可挂载，一个主机上最多可挂载4块数据盘
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AttachDiskResponse attachDisk(AttachDiskRequest request) throws JdcloudSdkException {
        return new AttachDiskExecutor().client(this).execute(request);
    }

    /**
     * 查询镜像共享帐户列表，不能操作非私有镜像
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeImageMembersResponse describeImageMembers(DescribeImageMembersRequest request) throws JdcloudSdkException {
        return new DescribeImageMembersExecutor().client(this).execute(request);
    }

    /**
     * 查询镜像信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeImageResponse describeImage(DescribeImageRequest request) throws JdcloudSdkException {
        return new DescribeImageExecutor().client(this).execute(request);
    }

    /**
     * 云主机使用指定镜像重置实例镜像，需要关机操作，
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RebuildInstanceResponse rebuildInstance(RebuildInstanceRequest request) throws JdcloudSdkException {
        return new RebuildInstanceExecutor().client(this).execute(request);
    }

    /**
     * 重启单个实例，只能重启running状态的实例，主机没有未完成的任务才可重启
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RebootInstanceResponse rebootInstance(RebootInstanceRequest request) throws JdcloudSdkException {
        return new RebootInstanceExecutor().client(this).execute(request);
    }

    /**
     * &quot;共享镜像，最多可共享给20个帐户&quot;
&quot;打包镜像暂不支持共享&quot;
&quot;不能操作非私有镜像&quot;
&quot;不能共享给自己&quot;

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ShareImageResponse shareImage(ShareImageRequest request) throws JdcloudSdkException {
        return new ShareImageExecutor().client(this).execute(request);
    }

    /**
     * 查询镜像资源信息列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeImagesResponse describeImages(DescribeImagesRequest request) throws JdcloudSdkException {
        return new DescribeImagesExecutor().client(this).execute(request);
    }

    /**
     * 停止单个实例，只能停止running状态的实例，主机没有未完成的任务才可停止
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws JdcloudSdkException {
        return new StopInstanceExecutor().client(this).execute(request);
    }

    /**
     * 查询主机vnc
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceVncUrlResponse describeInstanceVncUrl(DescribeInstanceVncUrlRequest request) throws JdcloudSdkException {
        return new DescribeInstanceVncUrlExecutor().client(this).execute(request);
    }

    /**
     * 删除私有镜像
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws JdcloudSdkException {
        return new DeleteImageExecutor().client(this).execute(request);
    }

    /**
     * 查询云主机详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws JdcloudSdkException {
        return new DescribeInstanceExecutor().client(this).execute(request);
    }

    /**
     * &quot;云主机变更实例规格，需要关机操作&quot;
&quot;16年创建的云盘做系统盘的主机，一代与二代实例类型不允许相互调整&quot;
&quot;本地盘做系统盘的主机，一代与二代实例类型不允许相互调整&quot;
&quot;ag中的主机，一代与二代实例类型不允许相互调整&quot;
&quot;变更后实例规格的网卡数量限制，要支持当前主机的网卡数量，如不支持，需要缷载网卡后再变更实例规格&quot;

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ResizeInstanceResponse resizeInstance(ResizeInstanceRequest request) throws JdcloudSdkException {
        return new ResizeInstanceExecutor().client(this).execute(request);
    }

    /**
     * 查询（虚机、镜像、密钥、模板）配额
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeQuotasResponse describeQuotas(DescribeQuotasRequest request) throws JdcloudSdkException {
        return new DescribeQuotasExecutor().client(this).execute(request);
    }

    /**
     * &quot;虚机创建私有镜像&quot;
&quot;虚机状态必须为stopped&quot;
&quot;如果虚机上有挂载数据盘，默认会将数据盘创建快照，生成打包镜像&quot;
&quot;主机没有未完成的任务才可制作镜像&quot;

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateImageResponse createImage(CreateImageRequest request) throws JdcloudSdkException {
        return new CreateImageExecutor().client(this).execute(request);
    }

    /**
     * 查询云主机列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws JdcloudSdkException {
        return new DescribeInstancesExecutor().client(this).execute(request);
    }

    /**
     * 创建一台或多台指定配置的实例
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateInstancesResponse createInstances(CreateInstancesRequest request) throws JdcloudSdkException {
        return new CreateInstancesExecutor().client(this).execute(request);
    }

    /**
     * 取消共享镜像，不能操作非私有镜像
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UnShareImageResponse unShareImage(UnShareImageRequest request) throws JdcloudSdkException {
        return new UnShareImageExecutor().client(this).execute(request);
    }

    /**
     * 修改主机密码，主机没有未完成的任务时才可操作
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyInstancePasswordResponse modifyInstancePassword(ModifyInstancePasswordRequest request) throws JdcloudSdkException {
        return new ModifyInstancePasswordExecutor().client(this).execute(request);
    }

    /**
     * 修改主机信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyInstanceAttributeResponse modifyInstanceAttribute(ModifyInstanceAttributeRequest request) throws JdcloudSdkException {
        return new ModifyInstanceAttributeExecutor().client(this).execute(request);
    }

    /**
     * 云主机解绑公网IP 解绑的是主网卡、主内网IP对应的弹性IP
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisassociateElasticIpResponse disassociateElasticIp(DisassociateElasticIpRequest request) throws JdcloudSdkException {
        return new DisassociateElasticIpExecutor().client(this).execute(request);
    }

    /**
     * 查询镜像限制
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeImageConstraintsResponse describeImageConstraints(DescribeImageConstraintsRequest request) throws JdcloudSdkException {
        return new DescribeImageConstraintsExecutor().client(this).execute(request);
    }

    /**
     * 启动单个实例，只能启动stopped状态的实例，主机没有未完成的任务才可启动
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StartInstanceResponse startInstance(StartInstanceRequest request) throws JdcloudSdkException {
        return new StartInstanceExecutor().client(this).execute(request);
    }

    /**
     * &quot;删除单个实例&quot;
&quot;主机状态必须为停止状态、同时主机没有未完成的任务才可删除&quot;
&quot;包年包月未到期的主机不能删除&quot;
&quot;如果主机中挂载了数据盘，并且设置了AutoDelete属性为true，那么数据盘会随主机一起删除&quot;

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws JdcloudSdkException {
        return new DeleteInstanceExecutor().client(this).execute(request);
    }

    /**
     * 云主机绑定公网IP 绑定的是主网卡、主内网IP对应的弹性IP
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AssociateElasticIpResponse associateElasticIp(AssociateElasticIpRequest request) throws JdcloudSdkException {
        return new AssociateElasticIpExecutor().client(this).execute(request);
    }

    /**
     * 云主机缷载硬盘，主机和云盘没有未完成的任务时才可缷载
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DetachDiskResponse detachDisk(DetachDiskRequest request) throws JdcloudSdkException {
        return new DetachDiskExecutor().client(this).execute(request);
    }

    /**
     * 查询实例类型资源信息列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceTypesResponse describeInstanceTypes(DescribeInstanceTypesRequest request) throws JdcloudSdkException {
        return new DescribeInstanceTypesExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public VmClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private VmClient vmClient;

        public DefaultBuilder() {
            vmClient = new VmClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            vmClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            vmClient.httpRequestConfig = config;
            return this;
        }

        public VmClient build() throws JdcloudSdkException {

            if (vmClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                vmClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (vmClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("VmClient build error: jdcloud credentials provider not set");
                }
            }
            if (vmClient.httpRequestConfig == null) {
                vmClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (vmClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("VmClient build error: http request config not set");
                }
            }
            return vmClient;
        }

        public Builder environment(Environment environment) {
            vmClient.environment = environment;
            return this;
        }
    }
}
