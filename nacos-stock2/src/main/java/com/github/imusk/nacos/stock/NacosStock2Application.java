package com.github.imusk.nacos.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-29 20:25
 * @classname: NacosOrderApplication
 * @description: 服务启动
 */
// 注册服务,使其他模块能够发现你
@EnableDiscoveryClient
@SpringBootApplication
public class NacosStock2Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosStock2Application.class);
    }

}
