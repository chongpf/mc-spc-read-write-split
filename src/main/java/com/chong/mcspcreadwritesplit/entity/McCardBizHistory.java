package com.chong.mcspcreadwritesplit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class McCardBizHistory implements Serializable {
    private Long id;

    private Long memberId;

    private String gender;

    private Date bizDate;

    private Integer bizType;

    private Long cardNo;

    private Long orderId;

    private BigDecimal orderMoney;

    private Integer paymentPoint;

    private String debitAcount;

    private String cridetAcount;

    private BigDecimal beforeBalanceMoney;

    private Integer beforeBalanceTimes;

    private Date beforeValidDay;

    private BigDecimal afterBalanceMoney;

    private Integer afterBalanceTimes;

    private Date afterValidDay;

    private String notes;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getBizDate() {
        return bizDate;
    }

    public void setBizDate(Date bizDate) {
        this.bizDate = bizDate;
    }

    public Integer getBizType() {
        return bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public Long getCardNo() {
        return cardNo;
    }

    public void setCardNo(Long cardNo) {
        this.cardNo = cardNo;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Integer getPaymentPoint() {
        return paymentPoint;
    }

    public void setPaymentPoint(Integer paymentPoint) {
        this.paymentPoint = paymentPoint;
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

    public BigDecimal getBeforeBalanceMoney() {
        return beforeBalanceMoney;
    }

    public void setBeforeBalanceMoney(BigDecimal beforeBalanceMoney) {
        this.beforeBalanceMoney = beforeBalanceMoney;
    }

    public Integer getBeforeBalanceTimes() {
        return beforeBalanceTimes;
    }

    public void setBeforeBalanceTimes(Integer beforeBalanceTimes) {
        this.beforeBalanceTimes = beforeBalanceTimes;
    }

    public Date getBeforeValidDay() {
        return beforeValidDay;
    }

    public void setBeforeValidDay(Date beforeValidDay) {
        this.beforeValidDay = beforeValidDay;
    }

    public BigDecimal getAfterBalanceMoney() {
        return afterBalanceMoney;
    }

    public void setAfterBalanceMoney(BigDecimal afterBalanceMoney) {
        this.afterBalanceMoney = afterBalanceMoney;
    }

    public Integer getAfterBalanceTimes() {
        return afterBalanceTimes;
    }

    public void setAfterBalanceTimes(Integer afterBalanceTimes) {
        this.afterBalanceTimes = afterBalanceTimes;
    }

    public Date getAfterValidDay() {
        return afterValidDay;
    }

    public void setAfterValidDay(Date afterValidDay) {
        this.afterValidDay = afterValidDay;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
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
        sb.append(", gender=").append(gender);
        sb.append(", bizDate=").append(bizDate);
        sb.append(", bizType=").append(bizType);
        sb.append(", cardNo=").append(cardNo);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderMoney=").append(orderMoney);
        sb.append(", paymentPoint=").append(paymentPoint);
        sb.append(", debitAcount=").append(debitAcount);
        sb.append(", cridetAcount=").append(cridetAcount);
        sb.append(", beforeBalanceMoney=").append(beforeBalanceMoney);
        sb.append(", beforeBalanceTimes=").append(beforeBalanceTimes);
        sb.append(", beforeValidDay=").append(beforeValidDay);
        sb.append(", afterBalanceMoney=").append(afterBalanceMoney);
        sb.append(", afterBalanceTimes=").append(afterBalanceTimes);
        sb.append(", afterValidDay=").append(afterValidDay);
        sb.append(", notes=").append(notes);
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