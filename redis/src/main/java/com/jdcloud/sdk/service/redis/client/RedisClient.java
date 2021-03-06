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
 * 京东云缓存Redis接口
 * 缓存Redis相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.redis.model.DescribeCacheInstanceRequest;
import com.jdcloud.sdk.service.redis.model.DescribeCacheInstanceResponse;
import com.jdcloud.sdk.service.redis.client.DescribeCacheInstanceExecutor;
import com.jdcloud.sdk.service.redis.model.DescribeCacheInstancesRequest;
import com.jdcloud.sdk.service.redis.model.DescribeCacheInstancesResponse;
import com.jdcloud.sdk.service.redis.client.DescribeCacheInstancesExecutor;
import com.jdcloud.sdk.service.redis.model.DescribeInstanceClassRequest;
import com.jdcloud.sdk.service.redis.model.DescribeInstanceClassResponse;
import com.jdcloud.sdk.service.redis.client.DescribeInstanceClassExecutor;
import com.jdcloud.sdk.service.redis.model.ModifyCacheInstanceAttributeRequest;
import com.jdcloud.sdk.service.redis.model.ModifyCacheInstanceAttributeResponse;
import com.jdcloud.sdk.service.redis.client.ModifyCacheInstanceAttributeExecutor;
import com.jdcloud.sdk.service.redis.model.DescribeUserQuotaRequest;
import com.jdcloud.sdk.service.redis.model.DescribeUserQuotaResponse;
import com.jdcloud.sdk.service.redis.client.DescribeUserQuotaExecutor;
import com.jdcloud.sdk.service.redis.model.ResetCacheInstancePasswordRequest;
import com.jdcloud.sdk.service.redis.model.ResetCacheInstancePasswordResponse;
import com.jdcloud.sdk.service.redis.client.ResetCacheInstancePasswordExecutor;
import com.jdcloud.sdk.service.redis.model.DeleteCacheInstanceRequest;
import com.jdcloud.sdk.service.redis.model.DeleteCacheInstanceResponse;
import com.jdcloud.sdk.service.redis.client.DeleteCacheInstanceExecutor;
import com.jdcloud.sdk.service.redis.model.CreateCacheInstanceRequest;
import com.jdcloud.sdk.service.redis.model.CreateCacheInstanceResponse;
import com.jdcloud.sdk.service.redis.client.CreateCacheInstanceExecutor;
import com.jdcloud.sdk.service.redis.model.ModifyCacheInstanceClassRequest;
import com.jdcloud.sdk.service.redis.model.ModifyCacheInstanceClassResponse;
import com.jdcloud.sdk.service.redis.client.ModifyCacheInstanceClassExecutor;

/**
 * redisClient
 */
public class RedisClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.0.0";
    public final static String DefaultEndpoint = "redis.jdcloud-api.com";
    public final static String ServiceName = "redis";
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

    private RedisClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 查询缓存Redis实例详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCacheInstanceResponse describeCacheInstance(DescribeCacheInstanceRequest request) throws JdcloudSdkException {
        return new DescribeCacheInstanceExecutor().client(this).execute(request);
    }

    /**
     * 查询缓存Redis实例列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCacheInstancesResponse describeCacheInstances(DescribeCacheInstancesRequest request) throws JdcloudSdkException {
        return new DescribeCacheInstancesExecutor().client(this).execute(request);
    }

    /**
     * 查询某区域下的实例规格列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeInstanceClassResponse describeInstanceClass(DescribeInstanceClassRequest request) throws JdcloudSdkException {
        return new DescribeInstanceClassExecutor().client(this).execute(request);
    }

    /**
     * 修改缓存Redis实例的资源名称、描述，二者至少选一
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyCacheInstanceAttributeResponse modifyCacheInstanceAttribute(ModifyCacheInstanceAttributeRequest request) throws JdcloudSdkException {
        return new ModifyCacheInstanceAttributeExecutor().client(this).execute(request);
    }

    /**
     * 查询账户配额信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeUserQuotaResponse describeUserQuota(DescribeUserQuotaRequest request) throws JdcloudSdkException {
        return new DescribeUserQuotaExecutor().client(this).execute(request);
    }

    /**
     * 重置缓存Redis实例密码
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ResetCacheInstancePasswordResponse resetCacheInstancePassword(ResetCacheInstancePasswordRequest request) throws JdcloudSdkException {
        return new ResetCacheInstancePasswordExecutor().client(this).execute(request);
    }

    /**
     * 删除单个缓存Redis实例
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteCacheInstanceResponse deleteCacheInstance(DeleteCacheInstanceRequest request) throws JdcloudSdkException {
        return new DeleteCacheInstanceExecutor().client(this).execute(request);
    }

    /**
     * 创建一个指定配置的缓存Redis实例
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateCacheInstanceResponse createCacheInstance(CreateCacheInstanceRequest request) throws JdcloudSdkException {
        return new CreateCacheInstanceExecutor().client(this).execute(request);
    }

    /**
     * 变更缓存Redis实例配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ModifyCacheInstanceClassResponse modifyCacheInstanceClass(ModifyCacheInstanceClassRequest request) throws JdcloudSdkException {
        return new ModifyCacheInstanceClassExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public RedisClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private RedisClient redisClient;

        public DefaultBuilder() {
            redisClient = new RedisClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            redisClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            redisClient.httpRequestConfig = config;
            return this;
        }

        public RedisClient build() throws JdcloudSdkException {

            if (redisClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                redisClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (redisClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("RedisClient build error: jdcloud credentials provider not set");
                }
            }
            if (redisClient.httpRequestConfig == null) {
                redisClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (redisClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("RedisClient build error: http request config not set");
                }
            }
            return redisClient;
        }

        public Builder environment(Environment environment) {
            redisClient.environment = environment;
            return this;
        }
    }
}
