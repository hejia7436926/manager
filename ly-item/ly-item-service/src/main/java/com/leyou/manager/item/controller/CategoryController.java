package com.leyou.manager.item.controller;

import com.leyou.common.entity.Category;
import com.leyou.manager.item.service.ICategoryService;
import com.leyou.manager.item.service.impl.CategoryServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryServiceimpl categoryService;

    @GetMapping("/category/list")
    public ResponseEntity<List<Category>> queryByParentId(@RequestParam(value = "pid",defaultValue = "0")Long pid){
        List<Category> list = this.categoryService.queryListByParent(pid);
        return ResponseEntity.ok(list);
    }
}
