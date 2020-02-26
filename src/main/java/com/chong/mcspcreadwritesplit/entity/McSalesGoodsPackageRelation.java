package com.chong.mcspcreadwritesplit.entity;

import java.io.Serializable;
import java.util.Date;

public class McSalesGoodsPackageRelation implements Serializable {
    private Long id;

    private Long packageGoodsNo;

    private Integer packageGoodsId;

    private String packageGoodsName;

    private Integer packageGoodsSkuId;

    private String packageGoodsSkuName;

    private Long salesGoodsNo;

    private Integer salesGoodsId;

    private String salesGoodsName;

    private Integer salesGoodsSkuId;

    private String salesGoodsSkuName;

    private String isDelete;

    private Date createTime;

    private Long createUser;

    private Date updateTime;

    private Long updateUser;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPackageGoodsNo() {
        return packageGoodsNo;
    }

    public void setPackageGoodsNo(Long packageGoodsNo) {
        this.packageGoodsNo = packageGoodsNo;
    }

    public Integer getPackageGoodsId() {
        return packageGoodsId;
    }

    public void setPackageGoodsId(Integer packageGoodsId) {
        this.packageGoodsId = packageGoodsId;
    }

    public String getPackageGoodsName() {
        return packageGoodsName;
    }

    public void setPackageGoodsName(String packageGoodsName) {
        this.packageGoodsName = packageGoodsName == null ? null : packageGoodsName.trim();
    }

    public Integer getPackageGoodsSkuId() {
        return packageGoodsSkuId;
    }

    public void setPackageGoodsSkuId(Integer packageGoodsSkuId) {
        this.packageGoodsSkuId = packageGoodsSkuId;
    }

    public String getPackageGoodsSkuName() {
        return packageGoodsSkuName;
    }

    public void setPackageGoodsSkuName(String packageGoodsSkuName) {
        this.packageGoodsSkuName = packageGoodsSkuName == null ? null : packageGoodsSkuName.trim();
    }

    public Long getSalesGoodsNo() {
        return salesGoodsNo;
    }

    public void setSalesGoodsNo(Long salesGoodsNo) {
        this.salesGoodsNo = salesGoodsNo;
    }

    public Integer getSalesGoodsId() {
        return salesGoodsId;
    }

    public void setSalesGoodsId(Integer salesGoodsId) {
        this.salesGoodsId = salesGoodsId;
    }

    public String getSalesGoodsName() {
        return salesGoodsName;
    }

    public void setSalesGoodsName(String salesGoodsName) {
        this.salesGoodsName = salesGoodsName == null ? null : salesGoodsName.trim();
    }

    public Integer getSalesGoodsSkuId() {
        return salesGoodsSkuId;
    }

    public void setSalesGoodsSkuId(Integer salesGoodsSkuId) {
        this.salesGoodsSkuId = salesGoodsSkuId;
    }

    public String getSalesGoodsSkuName() {
        return salesGoodsSkuName;
    }

    public void setSalesGoodsSkuName(String salesGoodsSkuName) {
        this.salesGoodsSkuName = salesGoodsSkuName == null ? null : salesGoodsSkuName.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", packageGoodsNo=").append(packageGoodsNo);
        sb.append(", packageGoodsId=").append(packageGoodsId);
        sb.append(", packageGoodsName=").append(packageGoodsName);
        sb.append(", packageGoodsSkuId=").append(packageGoodsSkuId);
        sb.append(", packageGoodsSkuName=").append(packageGoodsSkuName);
        sb.append(", salesGoodsNo=").append(salesGoodsNo);
        sb.append(", salesGoodsId=").append(salesGoodsId);
        sb.append(", salesGoodsName=").append(salesGoodsName);
        sb.append(", salesGoodsSkuId=").append(salesGoodsSkuId);
        sb.append(", salesGoodsSkuName=").append(salesGoodsSkuName);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}