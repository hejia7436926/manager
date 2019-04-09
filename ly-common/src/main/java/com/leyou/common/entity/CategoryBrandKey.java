package com.leyou.common.entity;
/**
 * 商品分类和品牌的中间表，多对多
 */
public class CategoryBrandKey {
    /**
     * 商品类目编号
     */
    private Long categoryId;
    /**
     * 品牌编号
     */
    private Long brandId;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }
}