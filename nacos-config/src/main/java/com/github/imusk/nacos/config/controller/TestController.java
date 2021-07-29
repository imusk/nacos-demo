package com.github.imusk.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-29 17:50
 * @classname: TestController
 * @description: 测试控制器
 */
// 刷新配置: 从配置中心修改配置文件,可即时获取
@RefreshScope
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${imusk.nacos.config.name}")
    private String name;

    @Value("${imusk.nacos.config.age}")
    private String age;

    @Value("${imusk.nacos.mysql.url}")
    private String mysql;


    @GetMapping("/config")
    public String getConfig() {
        return name + " : " + age;
    }

    @GetMapping("/mysql")
    public String getMysqlConfig() {
        return "数据库连接串 : " + mysql;
    }



}
