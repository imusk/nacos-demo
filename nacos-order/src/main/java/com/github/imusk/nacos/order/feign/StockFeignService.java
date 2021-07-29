package com.github.imusk.nacos.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-29 20:45
 * @classname: StockService
 * @description: 远程调用库存模块服务
 */
@FeignClient("nacos-stock")
public interface StockFeignService {

    @RequestMapping("/stock/test")
    public String test(@RequestParam("info") String info);

}
