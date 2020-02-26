package com.chong.mcspcreadwritesplit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class McGoodsSkuCard implements Serializable {
    private Long id;

    private Integer goodsId;

    private Integer goodsSkuId;

    private Integer cardType;

    private String cardTypeName;

    private Byte waitDaysAfterActivation;

    private String useDateRangeType;

    private Integer useFixDays;

    private Date useFixFromDate;

    private Date useFixToDate;

    private String consumeWeekdayType;

    private String consumeWeekdays;

    private Date consumeStartTime;

    private Date consumeEndTime;

    private String consumeSportType;

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

    public Integer getGoodsSkuId() {
        return goodsSkuId;
    }

    public void setGoodsSkuId(Integer goodsSkuId) {
        this.goodsSkuId = goodsSkuId;
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

    public String getUseDateRangeType() {
        return useDateRangeType;
    }

    public void setUseDateRangeType(String useDateRangeType) {
        this.useDateRangeType = useDateRangeType == null ? null : useDateRangeType.trim();
    }

    public Integer getUseFixDays() {
        return useFixDays;
    }

    public void setUseFixDays(Integer useFixDays) {
        this.useFixDays = useFixDays;
    }

    public Date getUseFixFromDate() {
        return useFixFromDate;
    }

    public void setUseFixFromDate(Date useFixFromDate) {
        this.useFixFromDate = useFixFromDate;
    }

    public Date getUseFixToDate() {
        return useFixToDate;
    }

    public void setUseFixToDate(Date useFixToDate) {
        this.useFixToDate = useFixToDate;
    }

    public String getConsumeWeekdayType() {
        return consumeWeekdayType;
    }

    public void setConsumeWeekdayType(String consumeWeekdayType) {
        this.consumeWeekdayType = consumeWeekdayType == null ? null : consumeWeekdayType.trim();
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

    public String getConsumeSportType() {
        return consumeSportType;
    }

    public void setConsumeSportType(String consumeSportType) {
        this.consumeSportType = consumeSportType == null ? null : consumeSportType.trim();
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
        sb.append(", goodsSkuId=").append(goodsSkuId);
        sb.append(", cardType=").append(cardType);
        sb.append(", cardTypeName=").append(cardTypeName);
        sb.append(", waitDaysAfterActivation=").append(waitDaysAfterActivation);
        sb.append(", useDateRangeType=").append(useDateRangeType);
        sb.append(", useFixDays=").append(useFixDays);
        sb.append(", useFixFromDate=").append(useFixFromDate);
        sb.append(", useFixToDate=").append(useFixToDate);
        sb.append(", consumeWeekdayType=").append(consumeWeekdayType);
        sb.append(", consumeWeekdays=").append(consumeWeekdays);
        sb.append(", consumeStartTime=").append(consumeStartTime);
        sb.append(", consumeEndTime=").append(consumeEndTime);
        sb.append(", consumeSportType=").append(consumeSportType);
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