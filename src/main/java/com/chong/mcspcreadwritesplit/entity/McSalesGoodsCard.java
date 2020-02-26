package com.chong.mcspcreadwritesplit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class McSalesGoodsCard implements Serializable {
    private Long id;

    private Long salesGoodsId;

    private String goodsNo;

    private Integer goodsId;

    private String goodsName;

    private Integer goodsSkuId;

    private String goodsSkuName;

    private Integer cardType;

    private String cardTypeName;

    private Byte waitDaysAfterActivation;

    private Date dateActivation;

    private Long memberId;

    private String gender;

    private Date useFromDate;

    private Date validDay;

    private String consumeWeekdays;

    private Date consumeStartTime;

    private Date consumeEndTime;

    private String consumeSportIds;

    private String consumeavenueids;

    private Integer maxConsumeTimesPerday;

    private Integer creditConsumeTimes;

    private BigDecimal maxConsumeMoneyPerday;

    private BigDecimal creditConsumeMoney;

    private Integer singleConsumeDuration;

    private String isOvertimeCharge;

    private Integer overtimeNochargeDuration;

    private Integer singleOvertimeDuration;

    private BigDecimal singleOvertimeMoney;

    private Integer balanceConsumeTimes;

    private BigDecimal balanceConsumeMoney;

    private Date lastConsumeDate;

    private Integer lastDateConsumeTimes;

    private BigDecimal lastDateConsumeMoney;

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

    public Long getSalesGoodsId() {
        return salesGoodsId;
    }

    public void setSalesGoodsId(Long salesGoodsId) {
        this.salesGoodsId = salesGoodsId;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo == null ? null : goodsNo.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsSkuId() {
        return goodsSkuId;
    }

    public void setGoodsSkuId(Integer goodsSkuId) {
        this.goodsSkuId = goodsSkuId;
    }

    public String getGoodsSkuName() {
        return goodsSkuName;
    }

    public void setGoodsSkuName(String goodsSkuName) {
        this.goodsSkuName = goodsSkuName == null ? null : goodsSkuName.trim();
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getCardTypeName() {
        return cardTypeName;
    }

    public void setCardTypeName(String cardTypeName) {
        this.cardTypeName = cardTypeName == null ? null : cardTypeName.trim();
    }

    public Byte getWaitDaysAfterActivation() {
        return waitDaysAfterActivation;
    }

    public void setWaitDaysAfterActivation(Byte waitDaysAfterActivation) {
        this.waitDaysAfterActivation = waitDaysAfterActivation;
    }

    public Date getDateActivation() {
        return dateActivation;
    }

    public void setDateActivation(Date dateActivation) {
        this.dateActivation = dateActivation;
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

    public Date getUseFromDate() {
        return useFromDate;
    }

    public void setUseFromDate(Date useFromDate) {
        this.useFromDate = useFromDate;
    }

    public Date getValidDay() {
        return validDay;
    }

    public void setValidDay(Date validDay) {
        this.validDay = validDay;
    }

    public String getConsumeWeekdays() {
        return consumeWeekdays;
    }

    public void setConsumeWeekdays(String consumeWeekdays) {
        this.consumeWeekdays = consumeWeekdays == null ? null : consumeWeekdays.trim();
    }

    public Date getConsumeStartTime() {
        return consumeStartTime;
    }

    public void setConsumeStartTime(Date consumeStartTime) {
        this.consumeStartTime = consumeStartTime;
    }

    public Date getConsumeEndTime() {
        return consumeEndTime;
    }

    public void setConsumeEndTime(Date consumeEndTime) {
        this.consumeEndTime = consumeEndTime;
    }

    public String getConsumeSportIds() {
        return consumeSportIds;
    }

    public void setConsumeSportIds(String consumeSportIds) {
        this.consumeSportIds = consumeSportIds == null ? null : consumeSportIds.trim();
    }

    public String getConsumeavenueids() {
        return consumeavenueids;
    }

    public void setConsumeavenueids(String consumeavenueids) {
        this.consumeavenueids = consumeavenueids == null ? null : consumeavenueids.trim();
    }

    public Integer getMaxConsumeTimesPerday() {
        return maxConsumeTimesPerday;
    }

    public void setMaxConsumeTimesPerday(Integer maxConsumeTimesPerday) {
        this.maxConsumeTimesPerday = maxConsumeTimesPerday;
    }

    public Integer getCreditConsumeTimes() {
        return creditConsumeTimes;
    }

    public void setCreditConsumeTimes(Integer creditConsumeTimes) {
        this.creditConsumeTimes = creditConsumeTimes;
    }

    public BigDecimal getMaxConsumeMoneyPerday() {
        return maxConsumeMoneyPerday;
    }

    public void setMaxConsumeMoneyPerday(BigDecimal maxConsumeMoneyPerday) {
        this.maxConsumeMoneyPerday = maxConsumeMoneyPerday;
    }

    public BigDecimal getCreditConsumeMoney() {
        return creditConsumeMoney;
    }

    public void setCreditConsumeMoney(BigDecimal creditConsumeMoney) {
        this.creditConsumeMoney = creditConsumeMoney;
    }

    public Integer getSingleConsumeDuration() {
        return singleConsumeDuration;
    }

    public void setSingleConsumeDuration(Integer singleConsumeDuration) {
        this.singleConsumeDuration = singleConsumeDuration;
    }

    public String getIsOvertimeCharge() {
        return isOvertimeCharge;
    }

    public void setIsOvertimeCharge(String isOvertimeCharge) {
        this.isOvertimeCharge = isOvertimeCharge == null ? null : isOvertimeCharge.trim();
    }

    public Integer getOvertimeNochargeDuration() {
        return overtimeNochargeDuration;
    }

    public void setOvertimeNochargeDuration(Integer overtimeNochargeDuration) {
        this.overtimeNochargeDuration = overtimeNochargeDuration;
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

    public Integer getBalanceConsumeTimes() {
        return balanceConsumeTimes;
    }

    public void setBalanceConsumeTimes(Integer balanceConsumeTimes) {
        this.balanceConsumeTimes = balanceConsumeTimes;
    }

    public BigDecimal getBalanceConsumeMoney() {
        return balanceConsumeMoney;
    }

    public void setBalanceConsumeMoney(BigDecimal balanceConsumeMoney) {
        this.balanceConsumeMoney = balanceConsumeMoney;
    }

    public Date getLastConsumeDate() {
        return lastConsumeDate;
    }

    public void setLastConsumeDate(Date lastConsumeDate) {
        this.lastConsumeDate = lastConsumeDate;
    }

    public Integer getLastDateConsumeTimes() {
        return lastDateConsumeTimes;
    }

    public void setLastDateConsumeTimes(Integer lastDateConsumeTimes) {
        this.lastDateConsumeTimes = lastDateConsumeTimes;
    }

    public BigDecimal getLastDateConsumeMoney() {
        return lastDateConsumeMoney;
    }

    public void setLastDateConsumeMoney(BigDecimal lastDateConsumeMoney) {
        this.lastDateConsumeMoney = lastDateConsumeMoney;
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
        sb.append(", salesGoodsId=").append(salesGoodsId);
        sb.append(", goodsNo=").append(goodsNo);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsSkuId=").append(goodsSkuId);
        sb.append(", goodsSkuName=").append(goodsSkuName);
        sb.append(", cardType=").append(cardType);
        sb.append(", cardTypeName=").append(cardTypeName);
        sb.append(", waitDaysAfterActivation=").append(waitDaysAfterActivation);
        sb.append(", dateActivation=").append(dateActivation);
        sb.append(", memberId=").append(memberId);
        sb.append(", gender=").append(gender);
        sb.append(", useFromDate=").append(useFromDate);
        sb.append(", validDay=").append(validDay);
        sb.append(", consumeWeekdays=").append(consumeWeekdays);
        sb.append(", consumeStartTime=").append(consumeStartTime);
        sb.append(", consumeEndTime=").append(consumeEndTime);
        sb.append(", consumeSportIds=").append(consumeSportIds);
        sb.append(", consumeavenueids=").append(consumeavenueids);
        sb.append(", maxConsumeTimesPerday=").append(maxConsumeTimesPerday);
        sb.append(", creditConsumeTimes=").append(creditConsumeTimes);
        sb.append(", maxConsumeMoneyPerday=").append(maxConsumeMoneyPerday);
        sb.append(", creditConsumeMoney=").append(creditConsumeMoney);
        sb.append(", singleConsumeDuration=").append(singleConsumeDuration);
        sb.append(", isOvertimeCharge=").append(isOvertimeCharge);
        sb.append(", overtimeNochargeDuration=").append(overtimeNochargeDuration);
        sb.append(", singleOvertimeDuration=").append(singleOvertimeDuration);
        sb.append(", singleOvertimeMoney=").append(singleOvertimeMoney);
        sb.append(", balanceConsumeTimes=").append(balanceConsumeTimes);
        sb.append(", balanceConsumeMoney=").append(balanceConsumeMoney);
        sb.append(", lastConsumeDate=").append(lastConsumeDate);
        sb.append(", lastDateConsumeTimes=").append(lastDateConsumeTimes);
        sb.append(", lastDateConsumeMoney=").append(lastDateConsumeMoney);
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