package com.leyou.manager.item.controller;

import com.leyou.common.entity.Specification;
import com.leyou.manager.item.service.impl.SpecifcationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version : 1.0
 * @ClassName: SpecificationController
 * @Description :
 * @auther: hejia
 * @date: 2019/4/17
 */
@RestController
public class SpecificationController {

    @Autowired
    private SpecifcationService specifcationService;
    @GetMapping("spec/{id}")
    public ResponseEntity<String> querySpecificationByCategoryId(@PathVariable("id")Long id){
        Specification specification = this.specifcationService.queryById(id);
        if(specification == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(specification.getSpecifications());
    }
}
