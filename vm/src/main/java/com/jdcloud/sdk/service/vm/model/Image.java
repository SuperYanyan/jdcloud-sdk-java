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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;

/**
 * image
 */
public class Image  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 镜像ID
     */
    private String imageId;

    /**
     * 镜像名称
     */
    private String name;

    /**
     * 操作系统发行版，[suse, debian, ubuntu, centos, windows-server]
     */
    private String platform;

    /**
     * 操作系统版本号
     */
    private String osVersion;

    /**
     * 镜像架构 i386, x86_64
     */
    private String architecture;

    /**
     * 镜像系统盘大小
     */
    private Integer systemDiskSizeGB;

    /**
     * 镜像来源 jcloud：官方镜像 marketplace：镜像市场镜像 self：用户自己的镜像 shared：其他用户分享的镜像
     */
    private String imageSource;

    /**
     * 镜像的操作系统类型，[windows, linux]
     */
    private String osType;

    /**
     * 镜像状态, [pending, ready, deleting, error]
     */
    private String status;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 镜像本身大小
     */
    private Integer sizeMB;

    /**
     * 镜像描述
     */
    private String desc;

    /**
     * 打包镜像数据盘映射信息
     */
    private List<InstanceDiskAttachment> dataDisks;


    /**
     * get 镜像ID
     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set 镜像ID
     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * get 镜像名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 镜像名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 操作系统发行版，[suse, debian, ubuntu, centos, windows-server]
     *
     * @return
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * set 操作系统发行版，[suse, debian, ubuntu, centos, windows-server]
     *
     * @param platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * get 操作系统版本号
     *
     * @return
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * set 操作系统版本号
     *
     * @param osVersion
     */
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * get 镜像架构 i386, x86_64
     *
     * @return
     */
    public String getArchitecture() {
        return architecture;
    }

    /**
     * set 镜像架构 i386, x86_64
     *
     * @param architecture
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * get 镜像系统盘大小
     *
     * @return
     */
    public Integer getSystemDiskSizeGB() {
        return systemDiskSizeGB;
    }

    /**
     * set 镜像系统盘大小
     *
     * @param systemDiskSizeGB
     */
    public void setSystemDiskSizeGB(Integer systemDiskSizeGB) {
        this.systemDiskSizeGB = systemDiskSizeGB;
    }

    /**
     * get 镜像来源 jcloud：官方镜像 marketplace：镜像市场镜像 self：用户自己的镜像 shared：其他用户分享的镜像
     *
     * @return
     */
    public String getImageSource() {
        return imageSource;
    }

    /**
     * set 镜像来源 jcloud：官方镜像 marketplace：镜像市场镜像 self：用户自己的镜像 shared：其他用户分享的镜像
     *
     * @param imageSource
     */
    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

    /**
     * get 镜像的操作系统类型，[windows, linux]
     *
     * @return
     */
    public String getOsType() {
        return osType;
    }

    /**
     * set 镜像的操作系统类型，[windows, linux]
     *
     * @param osType
     */
    public void setOsType(String osType) {
        this.osType = osType;
    }

    /**
     * get 镜像状态, [pending, ready, deleting, error]
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 镜像状态, [pending, ready, deleting, error]
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 镜像本身大小
     *
     * @return
     */
    public Integer getSizeMB() {
        return sizeMB;
    }

    /**
     * set 镜像本身大小
     *
     * @param sizeMB
     */
    public void setSizeMB(Integer sizeMB) {
        this.sizeMB = sizeMB;
    }

    /**
     * get 镜像描述
     *
     * @return
     */
    public String getDesc() {
        return desc;
    }

    /**
     * set 镜像描述
     *
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * get 打包镜像数据盘映射信息
     *
     * @return
     */
    public List<InstanceDiskAttachment> getDataDisks() {
        return dataDisks;
    }

    /**
     * set 打包镜像数据盘映射信息
     *
     * @param dataDisks
     */
    public void setDataDisks(List<InstanceDiskAttachment> dataDisks) {
        this.dataDisks = dataDisks;
    }


    /**
     * set 镜像ID
     *
     * @param imageId
     */
    public Image imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * set 镜像名称
     *
     * @param name
     */
    public Image name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 操作系统发行版，[suse, debian, ubuntu, centos, windows-server]
     *
     * @param platform
     */
    public Image platform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * set 操作系统版本号
     *
     * @param osVersion
     */
    public Image osVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * set 镜像架构 i386, x86_64
     *
     * @param architecture
     */
    public Image architecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * set 镜像系统盘大小
     *
     * @param systemDiskSizeGB
     */
    public Image systemDiskSizeGB(Integer systemDiskSizeGB) {
        this.systemDiskSizeGB = systemDiskSizeGB;
        return this;
    }

    /**
     * set 镜像来源 jcloud：官方镜像 marketplace：镜像市场镜像 self：用户自己的镜像 shared：其他用户分享的镜像
     *
     * @param imageSource
     */
    public Image imageSource(String imageSource) {
        this.imageSource = imageSource;
        return this;
    }

    /**
     * set 镜像的操作系统类型，[windows, linux]
     *
     * @param osType
     */
    public Image osType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * set 镜像状态, [pending, ready, deleting, error]
     *
     * @param status
     */
    public Image status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public Image createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 镜像本身大小
     *
     * @param sizeMB
     */
    public Image sizeMB(Integer sizeMB) {
        this.sizeMB = sizeMB;
        return this;
    }

    /**
     * set 镜像描述
     *
     * @param desc
     */
    public Image desc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * set 打包镜像数据盘映射信息
     *
     * @param dataDisks
     */
    public Image dataDisks(List<InstanceDiskAttachment> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }


    /**
     * add item to 打包镜像数据盘映射信息
     *
     * @param dataDisk
     */
    public void addDataDisk(InstanceDiskAttachment dataDisk) {
        if (this.dataDisks == null) {
            this.dataDisks = new ArrayList<>();
        }
        this.dataDisks.add(dataDisk);
    }

}