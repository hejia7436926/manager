package com.leyou.common.entity;
/**
 * 库存表
 */
public class Stock {
    /**
     * 库存对应的商品sku id
     */
    private Long skuId;

    /**
     * 可秒杀库存
     */
    private Integer seckillStock;

    /**
     * 秒杀总数量
     */
    private Integer seckillTotal;

    /**
     * 库存数量
     */
    private Integer stock;

    /**
     * @return skuId
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * @param skuId skuId
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * @return seckillStock
     */
    public Integer getSeckillStock() {
        return seckillStock;
    }

    /**
     * @param seckillStock seckillStock
     */
    public void setSeckillStock(Integer seckillStock) {
        this.seckillStock = seckillStock;
    }

    /**
     * @return seckillTotal
     */
    public Integer getSeckillTotal() {
        return seckillTotal;
    }

    /**
     * @param seckillTotal seckillTotal
     */
    public void setSeckillTotal(Integer seckillTotal) {
        this.seckillTotal = seckillTotal;
    }

    /**
     * @return stock
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * @param stock stock
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }
}