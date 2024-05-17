package com.zk.springbootzk.demos.controller;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("success")
    public String success() {
        return "success";
    }


    @RequestMapping("unauthorized")
    public String unauthorized() {
        return "unauthorized";
    }

    @RequestMapping("logout")
    public String logout() {
        SecurityUtils.getSubject().logout();
        return "logout";
    }
}
