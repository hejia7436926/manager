package com.leyou.manager.item.service.impl;

import com.leyou.common.entity.Category;
import com.leyou.manager.item.dao.CategoryMapper;
import com.leyou.manager.item.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceimpl implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

//    @Override
    public List<Category> queryListByParent(Long pid) {
        Category category = new Category();
        category.setParentId(pid);
        return categoryMapper.select(category);
    }

    public List<Category> queryByBrandId(Long bid){

        return categoryMapper.queryByBrandId(bid);
    }

    public List<String> queryNameByIds(List<Long>ids){
        return this.categoryMapper.selectByIdList(ids).stream().map(Category::getName).collect(Collectors.toList());
    }




}
