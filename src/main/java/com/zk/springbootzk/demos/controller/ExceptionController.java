package com.zk.springbootzk.demos.controller;

import com.zk.springbootzk.demos.config.BusinessErrorException;
import com.zk.springbootzk.demos.config.BusinessMsgEnum;
import com.zk.springbootzk.demos.config.JsonResult;
import com.zk.springbootzk.demos.config.JsonResult2;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
@Slf4j
public class ExceptionController {

    @PostMapping("/test")
    public JsonResult2 test(@RequestParam("name") String name,
                           @RequestParam("pass") String pass) {
        log.info("name：{}", name);
        log.info("pass：{}", pass);
        String t = null;
        System.out.println(t.equals(""));
        return new JsonResult2();
    }

    @PostMapping("test2")
    public JsonResult test2(String num){
        if ("1".equals(num)){
            throw new BusinessErrorException(BusinessMsgEnum.PARMETER_EXCEPTION);
        }
        else {
//            System.out.println("一切正常");
            return new JsonResult<>();
        }
    }
}

