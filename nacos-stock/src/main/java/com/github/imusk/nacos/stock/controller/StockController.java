package com.github.imusk.nacos.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-29 20:42
 * @classname: StockkController
 * @description: 库存接口
 */
@RestController
@RequestMapping("/stock")
public class StockController {


    @RequestMapping("/test")
    public String test(String info) {
        return "库存模块接收到到信息: " + info;
    }


}
