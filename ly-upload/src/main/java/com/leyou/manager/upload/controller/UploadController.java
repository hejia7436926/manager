package com.leyou.manager.upload.controller;

import com.leyou.manager.upload.service.UploadService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {
    @Autowired
    private UploadService service;
    /**
    * 上传图片功能
    * @author   HEJIA
    */
    @PostMapping("/upload/image")
    public ResponseEntity<String> uploadImage(@RequestParam("file")MultipartFile file){
        String url = this.service.upload(file);
        if(StringUtils.isBlank(url)){
            //url为空，证明上传失败
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        //返回200，并且携带url的路径
        return ResponseEntity.ok(url);
    }
}
