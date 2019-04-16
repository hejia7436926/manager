package com.leyou.manager.item.dao;

import com.leyou.common.entity.Category;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @version : 1.0
 * @ClassName: CategoryMapper
 * @Description :
 * @auther: hejia
 * @date: 2019/4/9
 */
public interface CategoryMapper extends Mapper<Category> {

    /**
     * 根据品牌id查询商品分类
     */
    @Select("select * from category where id in (select category_id from category_brand where brand_id=#{bid})")
    List<Category> queryByBrandId(Long bid);
}
