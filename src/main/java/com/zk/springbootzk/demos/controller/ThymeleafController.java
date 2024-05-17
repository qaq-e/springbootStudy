package com.zk.springbootzk.demos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
//    @RequestMapping("/test404")
//    public String test404() {
//        return "index";
//    }
    @RequestMapping("/test500")
    public String test500() {
        System.out.println(10/0);
        return "aaa.html";
    }

    @GetMapping("test1")
    public String test() {
        return "test1";
    }
}

