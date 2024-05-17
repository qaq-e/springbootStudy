package com.zk.springbootzk.demos.controller;

import com.zk.springbootzk.demos.entity.User;
import com.zk.springbootzk.demos.entity.User1;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/test1", produces = "application/json; charset=UTF-8")
public class Test1Controller {
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String testGet() {
        return "success";
    }
    @GetMapping("/user/{id}")
    public String testPathVariable(@PathVariable Integer id) {
        System.out.println("获取到的id为：" + id);
        return "success";
    }

    @GetMapping("/user/{idd}/{name}")
    public String testPathVariable(@PathVariable(value = "idd") Integer id,
                                   @PathVariable String name) {
        System.out.println("获取到的id为：" + id);
        System.out.println("获取到的name为：" + name);
        return "success";
    }

    @PostMapping("/user1")
    public String testRequestBody(@RequestBody User1 user1) {
        System.out.println("获取到的username为：" + user1.getUsername());
        System.out.println("获取到的password为：" + user1.getPassword());
        return "success";
    }
}
