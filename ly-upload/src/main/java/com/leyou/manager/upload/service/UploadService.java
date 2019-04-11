package com.leyou.manager.upload.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * @version : 1.0
 * @ClassName: UploadService
 * @Description :
 * @auther: hejia
 * @date: 2019/4/11
 */
@Service
@Configuration
public class UploadService {
    private static final Logger log = LoggerFactory.getLogger(UploadService.class);

    //支持的文件类型
    private static final List<String>suffixes = Arrays.asList("image/png","image/jpeg");

    public String upload(MultipartFile file){
        try {
            // 1图片信息校验
            // 1）校验文件类型
            String type = file.getContentType();
            if(!suffixes.contains(type)){
                log.info("上传失败，文件类型不匹配",type);
                return null;
            }
            //2)校验图片内容
            BufferedImage image = ImageIO.read(file.getInputStream());
            if(image == null){
                log.info("上传失败，文件内容不符合要求");
                return null;
            }
            //2保存图片
            //2.1 生成保存目录
            File dir = new File("d:\\images");
            if(!dir.exists()){
                dir.mkdirs();
            }
            //2.2保存图片
            file.transferTo(new File(dir,file.getOriginalFilename()));

            //2.3拼接图片地址
            String url = "http://image.leyou.com/upload/"+file.getOriginalFilename();
            return url;
        }catch (Exception e){
            return null;
        }
    }

}
