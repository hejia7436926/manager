package com.leyou.manager.item.service.impl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.leyou.common.entity.Brand;
import com.leyou.common.utils.PageResult;
import com.leyou.manager.item.dao.BrandMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * @version : 1.0
 * @ClassName: BrandServiceImpl
 * @Description :
 * @auther: hejia
 * @date: 2019/4/9
 */
@Service
public class BrandServiceImpl {

    @Autowired
    private BrandMapper brandMapper;
    /**TODU*/
    public PageResult<Brand> queryBrandByPageAndSort(Integer page,Integer rows,String sortBy,Boolean desc,String key){
        //开始分页
        PageHelper.startPage(page,rows);
        //过滤
        Example example = new Example(Brand.class);
        if(StringUtils.isNoneBlank(key)){
            example.createCriteria().andLike("name","%"+key+"%")
                    .orEqualTo("letter",key);
        }
        if (StringUtils.isNotBlank(sortBy)) {
            // 排序
            String orderByClause = sortBy + (desc ? " DESC" : " ASC");
            example.setOrderByClause(orderByClause);
        }
        // 查询
        Page<Brand> pageInfo = (Page<Brand>) brandMapper.selectByExample(example);
        // 返回结果
        return new PageResult<>(pageInfo.getTotal(),pageInfo);
    }
}
