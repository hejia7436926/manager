package com.leyou.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @version : 1.0
 * @ClassName: ItemApplivation
 * @Description :
 * @auther: hejia
 * @date: 2019/3/28
 */
@SpringCloudApplication
@EnableDiscoveryClient
@MapperScan("com.leyou.manager.item")
public class ItemApplivation {

    public static void main(String[] args) {
        SpringApplication.run(ItemApplivation.class,args);
    }
}
