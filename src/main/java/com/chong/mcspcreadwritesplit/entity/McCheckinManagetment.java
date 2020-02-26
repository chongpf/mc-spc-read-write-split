package com.chong.mcspcreadwritesplit.entity;

import java.io.Serializable;
import java.util.Date;

public class McCheckinManagetment implements Serializable {
    private Long id;

    private String goodsNo;

    private Long goodsId;

    private Integer goodsType;

    private String goodsName;

    private Long goodsSkuId;

    private String goodsSkuName;

    private Long memberId;

    private String gender;

    private Date allowExitDate;

    private Date consumeDate;

    private Date entryDate;

    private Date exitDate;

    private Integer consumeDuration;

    private String cosumeStatus;

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

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Long getGoodsSkuId() {
        return goodsSkuId;
    }

    public void setGoodsSkuId(Long goodsSkuId) {
        this.goodsSkuId = goodsSkuId;
    }

    public String getGoodsSkuName() {
        return goodsSkuName;
    }

    public void setGoodsSkuName(String goodsSkuName) {
        this.goodsSkuName = goodsSkuName == null ? null : goodsSkuName.trim();
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

    public Date getAllowExitDate() {
        return allowExitDate;
    }

    public void setAllowExitDate(Date allowExitDate) {
        this.allowExitDate = allowExitDate;
    }

    public Date getConsumeDate() {
        return consumeDate;
    }

    public void setConsumeDate(Date consumeDate) {
        this.consumeDate = consumeDate;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getExitDate() {
        return exitDate;
    }

    public void setExitDate(Date exitDate) {
        this.exitDate = exitDate;
    }

    public Integer getConsumeDuration() {
        return consumeDuration;
    }

    public void setConsumeDuration(Integer consumeDuration) {
        this.consumeDuration = consumeDuration;
    }

    public String getCosumeStatus() {
        return cosumeStatus;
    }

    public void setCosumeStatus(String cosumeStatus) {
        this.cosumeStatus = cosumeStatus == null ? null : cosumeStatus.trim();
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
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsType=").append(goodsType);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsSkuId=").append(goodsSkuId);
        sb.append(", goodsSkuName=").append(goodsSkuName);
        sb.append(", memberId=").append(memberId);
        sb.append(", gender=").append(gender);
        sb.append(", allowExitDate=").append(allowExitDate);
        sb.append(", consumeDate=").append(consumeDate);
        sb.append(", entryDate=").append(entryDate);
        sb.append(", exitDate=").append(exitDate);
        sb.append(", consumeDuration=").append(consumeDuration);
        sb.append(", cosumeStatus=").append(cosumeStatus);
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