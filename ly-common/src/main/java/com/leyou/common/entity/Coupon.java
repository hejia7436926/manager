package com.leyou.common.entity;

import java.util.Date;
/**
 * 优惠券表
 */
public class Coupon {
    /**
     * 优惠券id
     */
    private Long id;
    /**
     * 优惠卷名称
     */
    private String name;
    /**
     * 优惠卷类型,1、抵扣  2、折扣(打折）
     */
    private String type;
    /**
     * 抵扣或折扣条件，如果没有限制，则设置为0
     */
    private Long condition;
    /**
     * 优惠金额
     */
    private Long reduction;
    /**
     * 如果没有折扣，为100。如果是八五折，折扣为85
     */
    private Integer discount;
    /**
     * 优惠券可以生效的sku的id拼接，以,分割
     */
    private String targets;
    /**
     * 剩余优惠券数量
     */
    private Integer stock;
    /**
     * 优惠券生效时间
     */
    private Date startTime;
    /**
     * 优惠券失效时间
     */
    private Date endTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getTargets() {
        return targets;
    }

    public void setTargets(String targets) {
        this.targets = targets == null ? null : targets.trim();
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
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