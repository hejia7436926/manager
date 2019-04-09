package com.leyou.common.entity;

import java.util.Date;
/**
* 促销活动表
*/
public class Promotion {
    /**
     * 促销活动id
     */
    private Long id;
    /**
     * 活动类型，目前可选的有：0没有促销，1满减，2满额送抵扣券，3秒杀
     */
    private String type;
    /**
     * 促销活动说明
     */
    private String description;
    /**
     * 满减条件，秒杀的话设置为0
     */
    private Long condition;
    /**
     * 满减后的折扣金额
     */
    private Long reduction;
    /**
     * 秒杀价格，如果是秒杀活动，需要填写
     */
    private Long seckillPrice;
    /**
     * 满额送券，关联的优惠券id
     */
    private Long couponId;
    /**
     * 作用的目标sku的id拼接，以'',''拼接
     */
    private String targets;

    private Date startTime;

    private Date endTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getCondition() {
        return condition;
    }

    public void setCondition(Long condition) {
        this.condition = condition;
    }

    public Long getReduction() {
        return reduction;
    }

    public void setReduction(Long reduction) {
        this.reduction = reduction;
    }

    public Long getSeckillPrice() {
        return seckillPrice;
    }

    public void setSeckillPrice(Long seckillPrice) {
        this.seckillPrice = seckillPrice;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public String getTargets() {
        return targets;
    }

    public void setTargets(String targets) {
        this.targets = targets == null ? null : targets.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}