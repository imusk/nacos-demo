package com.github.imusk.nacos.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-29 20:25
 * @classname: NacosOrderApplication
 * @description: 服务启动
 */
// 注册服务,使其他模块能够发现你
@EnableDiscoveryClient
// 开启Feign客户端支持
@EnableFeignClients(basePackages = "com.github.imusk.nacos.order.feign")
@SpringBootApplication
public class NacosOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosOrderApplication.class);
    }

}
