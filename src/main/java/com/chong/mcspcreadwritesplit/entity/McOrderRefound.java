package com.chong.mcspcreadwritesplit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class McOrderRefound implements Serializable {
    private Long id;

    private Long orderId;

    private Long memberId;

    private Long salesGoodsId;

    private Long goodsId;

    private Long goodsSkuId;

    private String goodsNo;

    private Date refoundApplyDate;

    private BigDecimal refoundApplyMoney;

    private String refoundApplyNotes;

    private Date refoundDate;

    private BigDecimal refoundMoney;

    private String refoundNotes;

    private String refoundStatus;

    private Integer refoundChannel;

    private Integer refoundPlatform;

    private String refoundType;

    private Integer refoundPoint;

    private String debitAcount;

    private String cridetAcount;

    private String thirdPartRefoundNo;

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

    public Date getRefoundApplyDate() {
        return refoundApplyDate;
    }

    public void setRefoundApplyDate(Date refoundApplyDate) {
        this.refoundApplyDate = refoundApplyDate;
    }

    public BigDecimal getRefoundApplyMoney() {
        return refoundApplyMoney;
    }

    public void setRefoundApplyMoney(BigDecimal refoundApplyMoney) {
        this.refoundApplyMoney = refoundApplyMoney;
    }

    public String getRefoundApplyNotes() {
        return refoundApplyNotes;
    }

    public void setRefoundApplyNotes(String refoundApplyNotes) {
        this.refoundApplyNotes = refoundApplyNotes == null ? null : refoundApplyNotes.trim();
    }

    public Date getRefoundDate() {
        return refoundDate;
    }

    public void setRefoundDate(Date refoundDate) {
        this.refoundDate = refoundDate;
    }

    public BigDecimal getRefoundMoney() {
        return refoundMoney;
    }

    public void setRefoundMoney(BigDecimal refoundMoney) {
        this.refoundMoney = refoundMoney;
    }

    public String getRefoundNotes() {
        return refoundNotes;
    }

    public void setRefoundNotes(String refoundNotes) {
        this.refoundNotes = refoundNotes == null ? null : refoundNotes.trim();
    }

    public String getRefoundStatus() {
        return refoundStatus;
    }

    public void setRefoundStatus(String refoundStatus) {
        this.refoundStatus = refoundStatus == null ? null : refoundStatus.trim();
    }

    public Integer getRefoundChannel() {
        return refoundChannel;
    }

    public void setRefoundChannel(Integer refoundChannel) {
        this.refoundChannel = refoundChannel;
    }

    public Integer getRefoundPlatform() {
        return refoundPlatform;
    }

    public void setRefoundPlatform(Integer refoundPlatform) {
        this.refoundPlatform = refoundPlatform;
    }

    public String getRefoundType() {
        return refoundType;
    }

    public void setRefoundType(String refoundType) {
        this.refoundType = refoundType == null ? null : refoundType.trim();
    }

    public Integer getRefoundPoint() {
        return refoundPoint;
    }

    public void setRefoundPoint(Integer refoundPoint) {
        this.refoundPoint = refoundPoint;
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

    public String getThirdPartRefoundNo() {
        return thirdPartRefoundNo;
    }

    public void setThirdPartRefoundNo(String thirdPartRefoundNo) {
        this.thirdPartRefoundNo = thirdPartRefoundNo == null ? null : thirdPartRefoundNo.trim();
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
        sb.append(", refoundApplyDate=").append(refoundApplyDate);
        sb.append(", refoundApplyMoney=").append(refoundApplyMoney);
        sb.append(", refoundApplyNotes=").append(refoundApplyNotes);
        sb.append(", refoundDate=").append(refoundDate);
        sb.append(", refoundMoney=").append(refoundMoney);
        sb.append(", refoundNotes=").append(refoundNotes);
        sb.append(", refoundStatus=").append(refoundStatus);
        sb.append(", refoundChannel=").append(refoundChannel);
        sb.append(", refoundPlatform=").append(refoundPlatform);
        sb.append(", refoundType=").append(refoundType);
        sb.append(", refoundPoint=").append(refoundPoint);
        sb.append(", debitAcount=").append(debitAcount);
        sb.append(", cridetAcount=").append(cridetAcount);
        sb.append(", thirdPartRefoundNo=").append(thirdPartRefoundNo);
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