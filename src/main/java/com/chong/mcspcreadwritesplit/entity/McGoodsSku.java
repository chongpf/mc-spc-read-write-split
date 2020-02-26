package com.chong.mcspcreadwritesplit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class McGoodsSku implements Serializable {
    private Long id;

    private Integer goodsId;

    private String goodsSkuName;

    private String isDefault;

    private BigDecimal salesPrice;

    private String salesUnit;

    private Date salesFromDate;

    private Date salesToDate;

    private Integer salesCount;

    private Integer stock;

    private Integer salesChannelId;

    private Integer salesPlatformId;

    private String enableGoodsRule;

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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsSkuName() {
        return goodsSkuName;
    }

    public void setGoodsSkuName(String goodsSkuName) {
        this.goodsSkuName = goodsSkuName == null ? null : goodsSkuName.trim();
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    public BigDecimal getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(BigDecimal salesPrice) {
        this.salesPrice = salesPrice;
    }

    public String getSalesUnit() {
        return salesUnit;
    }

    public void setSalesUnit(String salesUnit) {
        this.salesUnit = salesUnit == null ? null : salesUnit.trim();
    }

    public Date getSalesFromDate() {
        return salesFromDate;
    }

    public void setSalesFromDate(Date salesFromDate) {
        this.salesFromDate = salesFromDate;
    }

    public Date getSalesToDate() {
        return salesToDate;
    }

    public void setSalesToDate(Date salesToDate) {
        this.salesToDate = salesToDate;
    }

    public Integer getSalesCount() {
        return salesCount;
    }

    public void setSalesCount(Integer salesCount) {
        this.salesCount = salesCount;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getSalesChannelId() {
        return salesChannelId;
    }

    public void setSalesChannelId(Integer salesChannelId) {
        this.salesChannelId = salesChannelId;
    }

    public Integer getSalesPlatformId() {
        return salesPlatformId;
    }

    public void setSalesPlatformId(Integer salesPlatformId) {
        this.salesPlatformId = salesPlatformId;
    }

    public String getEnableGoodsRule() {
        return enableGoodsRule;
    }

    public void setEnableGoodsRule(String enableGoodsRule) {
        this.enableGoodsRule = enableGoodsRule == null ? null : enableGoodsRule.trim();
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
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsSkuName=").append(goodsSkuName);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", salesPrice=").append(salesPrice);
        sb.append(", salesUnit=").append(salesUnit);
        sb.append(", salesFromDate=").append(salesFromDate);
        sb.append(", salesToDate=").append(salesToDate);
        sb.append(", salesCount=").append(salesCount);
        sb.append(", stock=").append(stock);
        sb.append(", salesChannelId=").append(salesChannelId);
        sb.append(", salesPlatformId=").append(salesPlatformId);
        sb.append(", enableGoodsRule=").append(enableGoodsRule);
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