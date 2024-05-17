package com.zk.springbootzk.demos.controller;

import com.zk.springbootzk.demos.config.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    @GetMapping("test")
    public String test() {
        return "test1.html";
    }

    @GetMapping("test1")
    @ResponseBody
    public JsonResult test1() {
        Map map = new HashMap();
        map.put("name", "小明");
        map.put("sex", "男");
        map.put("hobby", null);
//        return map;
        return new JsonResult(map);
    }
}
