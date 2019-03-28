package com.leyou.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version : 1.0
 * @ClassName: ItemApplivation
 * @Description :
 * @auther: hejia
 * @date: 2019/3/28
 */
@SpringCloudApplication
@EnableDiscoveryClient
public class ItemApplivation {

    public static void main(String[] args) {
        SpringApplication.run(ItemApplivation.class,args);
    }
}
