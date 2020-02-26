package com.chong.mcspcreadwritesplit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class McCheckinOvertime implements Serializable {
    private Long id;

    private String goodsNo;

    private Date billingStartTime;

    private Date billingEndTime;

    private Integer consumeDuration;

    private Integer overTimeDuration;

    private BigDecimal overtimeMoney;

    private Integer singleOvertimeDuration;

    private BigDecimal singleOvertimeMoney;

    private Long orderId;

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

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo == null ? null : goodsNo.trim();
    }

    public Date getBillingStartTime() {
        return billingStartTime;
    }

    public void setBillingStartTime(Date billingStartTime) {
        this.billingStartTime = billingStartTime;
    }

    public Date getBillingEndTime() {
        return billingEndTime;
    }

    public void setBillingEndTime(Date billingEndTime) {
        this.billingEndTime = billingEndTime;
    }

    public Integer getConsumeDuration() {
        return consumeDuration;
    }

    public void setConsumeDuration(Integer consumeDuration) {
        this.consumeDuration = consumeDuration;
    }

    public Integer getOverTimeDuration() {
        return overTimeDuration;
    }

    public void setOverTimeDuration(Integer overTimeDuration) {
        this.overTimeDuration = overTimeDuration;
    }

    public BigDecimal getOvertimeMoney() {
        return overtimeMoney;
    }

    public void setOvertimeMoney(BigDecimal overtimeMoney) {
        this.overtimeMoney = overtimeMoney;
    }

    public Integer getSingleOvertimeDuration() {
        return singleOvertimeDuration;
    }

    public void setSingleOvertimeDuration(Integer singleOvertimeDuration) {
        this.singleOvertimeDuration = singleOvertimeDuration;
    }

    public BigDecimal getSingleOvertimeMoney() {
        return singleOvertimeMoney;
    }

    public void setSingleOvertimeMoney(BigDecimal singleOvertimeMoney) {
        this.singleOvertimeMoney = singleOvertimeMoney;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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
        sb.append(", goodsNo=").append(goodsNo);
        sb.append(", billingStartTime=").append(billingStartTime);
        sb.append(", billingEndTime=").append(billingEndTime);
        sb.append(", consumeDuration=").append(consumeDuration);
        sb.append(", overTimeDuration=").append(overTimeDuration);
        sb.append(", overtimeMoney=").append(overtimeMoney);
        sb.append(", singleOvertimeDuration=").append(singleOvertimeDuration);
        sb.append(", singleOvertimeMoney=").append(singleOvertimeMoney);
        sb.append(", orderId=").append(orderId);
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