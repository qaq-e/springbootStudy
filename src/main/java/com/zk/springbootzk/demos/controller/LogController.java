package com.zk.springbootzk.demos.controller;

import com.zk.springbootzk.demos.config.MicroServiceUrl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class LogController {

    @Value("${url.orderUrl}")
    private String orderUrl;

    @Resource
    private MicroServiceUrl microServiceUrl;

    @GetMapping("log1")
    public String log1() {
        log.debug("=====测试日志debug级别打印====");
        log.info("======测试日志info级别打印=====");
        log.warn("======测试日志warn级别打印=====");
        log.error("=====测试日志error级别打印====");
// 可以使用占位符打印出一些参数信息
        String str1 = "blog.itcodai.com";
        String str2 = "blog.csdn.net/eson_15";
        log.info("======倪升武的个人博客：{}；倪升武的CSDN博客：{}", str1, str2);
        log.info("订单地址{}",orderUrl);
        log.info("--------------url-----------------");
        log.info("=====获取的订单服务地址为：{}", microServiceUrl.getOrderUrl());
        log.info("=====获取的用户服务地址为：{}", microServiceUrl.getUserUrl());
        log.info("=====获取的购物车服务地址为：{}",
                microServiceUrl.getShoppingUrl());
        return "log1";
    }
}
