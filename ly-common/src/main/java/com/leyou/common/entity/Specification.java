package com.leyou.common.entity;
/**
 * 商品规格参数模板，json格式。
 */
public class Specification {
    /**
     * 规格模板所属商品分类id
     */
    private Long categoryId;
    /**
     * 规格参数模板，json格式
     */
    private String specifications;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }
}