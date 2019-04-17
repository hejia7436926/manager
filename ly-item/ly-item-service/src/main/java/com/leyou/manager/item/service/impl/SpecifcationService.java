package com.leyou.manager.item.service.impl;

import com.leyou.common.entity.Specification;
import com.leyou.manager.item.dao.SpecificationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version : 1.0
 * @ClassName: SpecifcationService
 * @Description :
 * @auther: hejia
 * @date: 2019/4/17
 */
@Service
public class SpecifcationService {

    @Autowired
    private SpecificationMapper specificationMapper;

    public Specification queryById(Long id){
        return this.specificationMapper.selectByPrimaryKey(id);
    }
}
