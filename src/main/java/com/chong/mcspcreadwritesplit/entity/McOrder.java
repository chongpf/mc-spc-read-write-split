package com.chong.mcspcreadwritesplit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class McOrder implements Serializable {
    private Long id;

    private Long memberId;

    private Integer orderType;

    private Date orderDate;

    private BigDecimal orderMoney;

    private Integer salesChannel;

    private Integer salesPlatform;

    private String paymentType;

    private Date paymentDate;

    private BigDecimal paymentMoney;

    private Integer paymentPoint;

    private String paymentStatus;

    private String debitAcount;

    private String cridetAcount;

    private Integer paymentChannel;

    private Integer paymentMethod;

    private Integer userPayGate;

    private String thirdPartOrderNo;

    private String refoundStatus;

    private BigDecimal totalRefoundMoney;

    private String expressDeliveryStatus;

    private Integer goodsCount;

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

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Integer getSalesChannel() {
        return salesChannel;
    }

    public void setSalesChannel(Integer salesChannel) {
        this.salesChannel = salesChannel;
    }

    public Integer getSalesPlatform() {
        return salesPlatform;
    }

    public void setSalesPlatform(Integer salesPlatform) {
        this.salesPlatform = salesPlatform;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public BigDecimal getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(BigDecimal paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public Integer getPaymentPoint() {
        return paymentPoint;
    }

    public void setPaymentPoint(Integer paymentPoint) {
        this.paymentPoint = paymentPoint;
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

    public Integer getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(Integer paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Integer getUserPayGate() {
        return userPayGate;
    }

    public void setUserPayGate(Integer userPayGate) {
        this.userPayGate = userPayGate;
    }

    public String getThirdPartOrderNo() {
        return thirdPartOrderNo;
    }

    public void setThirdPartOrderNo(String thirdPartOrderNo) {
        this.thirdPartOrderNo = thirdPartOrderNo == null ? null : thirdPartOrderNo.trim();
    }

    public String getRefoundStatus() {
        return refoundStatus;
    }

    public void setRefoundStatus(String refoundStatus) {
        this.refoundStatus = refoundStatus == null ? null : refoundStatus.trim();
    }

    public BigDecimal getTotalRefoundMoney() {
        return totalRefoundMoney;
    }

    public void setTotalRefoundMoney(BigDecimal totalRefoundMoney) {
        this.totalRefoundMoney = totalRefoundMoney;
    }

    public String getExpressDeliveryStatus() {
        return expressDeliveryStatus;
    }

    public void setExpressDeliveryStatus(String expressDeliveryStatus) {
        this.expressDeliveryStatus = expressDeliveryStatus == null ? null : expressDeliveryStatus.trim();
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
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
        sb.append(", memberId=").append(memberId);
        sb.append(", orderType=").append(orderType);
        sb.append(", orderDate=").append(orderDate);
        sb.append(", orderMoney=").append(orderMoney);
        sb.append(", salesChannel=").append(salesChannel);
        sb.append(", salesPlatform=").append(salesPlatform);
        sb.append(", paymentType=").append(paymentType);
        sb.append(", paymentDate=").append(paymentDate);
        sb.append(", paymentMoney=").append(paymentMoney);
        sb.append(", paymentPoint=").append(paymentPoint);
        sb.append(", paymentStatus=").append(paymentStatus);
        sb.append(", debitAcount=").append(debitAcount);
        sb.append(", cridetAcount=").append(cridetAcount);
        sb.append(", paymentChannel=").append(paymentChannel);
        sb.append(", paymentMethod=").append(paymentMethod);
        sb.append(", userPayGate=").append(userPayGate);
        sb.append(", thirdPartOrderNo=").append(thirdPartOrderNo);
        sb.append(", refoundStatus=").append(refoundStatus);
        sb.append(", totalRefoundMoney=").append(totalRefoundMoney);
        sb.append(", expressDeliveryStatus=").append(expressDeliveryStatus);
        sb.append(", goodsCount=").append(goodsCount);
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