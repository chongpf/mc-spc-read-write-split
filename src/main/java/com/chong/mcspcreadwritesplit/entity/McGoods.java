package com.chong.mcspcreadwritesplit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class McGoods implements Serializable {
    private Long id;

    private Integer goodsTypeId;

    private String goodsName;

    private BigDecimal standardPrice;

    private BigDecimal skuMinPrice;

    private BigDecimal skuMaxPrice;

    private String onSales;

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

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public BigDecimal getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(BigDecimal standardPrice) {
        this.standardPrice = standardPrice;
    }

    public BigDecimal getSkuMinPrice() {
        return skuMinPrice;
    }

    public void setSkuMinPrice(BigDecimal skuMinPrice) {
        this.skuMinPrice = skuMinPrice;
    }

    public BigDecimal getSkuMaxPrice() {
        return skuMaxPrice;
    }

    public void setSkuMaxPrice(BigDecimal skuMaxPrice) {
        this.skuMaxPrice = skuMaxPrice;
    }

    public String getOnSales() {
        return onSales;
    }

    public void setOnSales(String onSales) {
        this.onSales = onSales == null ? null : onSales.trim();
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
        sb.append(", goodsTypeId=").append(goodsTypeId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", standardPrice=").append(standardPrice);
        sb.append(", skuMinPrice=").append(skuMinPrice);
        sb.append(", skuMaxPrice=").append(skuMaxPrice);
        sb.append(", onSales=").append(onSales);
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