package com.github.imusk.nacos.order.controller;

import com.github.imusk.nacos.order.feign.StockFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-29 20:50
 * @classname: OrderController
 * @description: 订单控制器
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private StockFeignService stockFeignService;


    @GetMapping("/test")
    public String test() {
        return stockFeignService.test("口罩");
    }


}
