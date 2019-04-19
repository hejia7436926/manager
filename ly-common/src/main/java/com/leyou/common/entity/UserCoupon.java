package com.leyou.common.entity;

import java.io.Serializable;

/**
 * 用户持有优惠券的使用情况表
 */
public class UserCoupon implements Serializable {
    private static final long serialVersionUID = -1706841621984438318L;
    /**
     * 每张优惠券的编号
     */
    private Long couponCode;
    /**
     * 优惠券id
     */
    private Long couponId;
    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 是否使用 0未使用1已使用2已过期
     */
    private String status;

    public Long getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(Long couponCode) {
        this.couponCode = couponCode;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}