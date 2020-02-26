package com.chong.mcspcreadwritesplit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class McOrderDetail implements Serializable {
    private Long id;

    private Long orderId;

    private Long memberId;

    private Long salesGoodsId;

    private Long goodsId;

    private Long goodsSkuId;

    private String goodsNo;

    private BigDecimal goodsPrice;

    private BigDecimal goodsMoney;

    private String isActive;

    private String paymentStatus;

    private String debitAcount;

    private String cridetAcount;

    private String refoundStatus;

    private BigDecimal refoundMoney;

    private String expressDeliveryStatus;

    private String isInPackageGoods;

    private Long packageGoodsNo;

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

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getSalesGoodsId() {
        return salesGoodsId;
    }

    public void setSalesGoodsId(Long salesGoodsId) {
        this.salesGoodsId = salesGoodsId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getGoodsSkuId() {
        return goodsSkuId;
    }

    public void setGoodsSkuId(Long goodsSkuId) {
        this.goodsSkuId = goodsSkuId;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo == null ? null : goodsNo.trim();
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getGoodsMoney() {
        return goodsMoney;
    }

    public void setGoodsMoney(BigDecimal goodsMoney) {
        this.goodsMoney = goodsMoney;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive == null ? null : isActive.trim();
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus == null ? null : paymentStatus.trim();
    }

    public String getDebitAcount() {
        return debitAcount;
    }

    public void setDebitAcount(String debitAcount) {
        this.debitAcount = debitAcount == null ? null : debitAcount.trim();
    }

    public String getCridetAcount() {
        return cridetAcount;
    }

    public void setCridetAcount(String cridetAcount) {
        this.cridetAcount = cridetAcount == null ? null : cridetAcount.trim();
    }

    public String getRefoundStatus() {
        return refoundStatus;
    }

    public void setRefoundStatus(String refoundStatus) {
        this.refoundStatus = refoundStatus == null ? null : refoundStatus.trim();
    }

    public BigDecimal getRefoundMoney() {
        return refoundMoney;
    }

    public void setRefoundMoney(BigDecimal refoundMoney) {
        this.refoundMoney = refoundMoney;
    }

    public String getExpressDeliveryStatus() {
        return expressDeliveryStatus;
    }

    public void setExpressDeliveryStatus(String expressDeliveryStatus) {
        this.expressDeliveryStatus = expressDeliveryStatus == null ? null : expressDeliveryStatus.trim();
    }

    public String getIsInPackageGoods() {
        return isInPackageGoods;
    }

    public void setIsInPackageGoods(String isInPackageGoods) {
        this.isInPackageGoods = isInPackageGoods == null ? null : isInPackageGoods.trim();
    }

    public Long getPackageGoodsNo() {
        return packageGoodsNo;
    }

    public void setPackageGoodsNo(Long packageGoodsNo) {
        this.packageGoodsNo = packageGoodsNo;
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
        sb.append(", orderId=").append(orderId);
        sb.append(", memberId=").append(memberId);
        sb.append(", salesGoodsId=").append(salesGoodsId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsSkuId=").append(goodsSkuId);
        sb.append(", goodsNo=").append(goodsNo);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsMoney=").append(goodsMoney);
        sb.append(", isActive=").append(isActive);
        sb.append(", paymentStatus=").append(paymentStatus);
        sb.append(", debitAcount=").append(debitAcount);
        sb.append(", cridetAcount=").append(cridetAcount);
        sb.append(", refoundStatus=").append(refoundStatus);
        sb.append(", refoundMoney=").append(refoundMoney);
        sb.append(", expressDeliveryStatus=").append(expressDeliveryStatus);
        sb.append(", isInPackageGoods=").append(isInPackageGoods);
        sb.append(", packageGoodsNo=").append(packageGoodsNo);
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