package com.zk.springbootzk;

import com.alibaba.fastjson.JSON;
import com.zk.springbootzk.demos.entity.User1;
import com.zk.springbootzk.demos.service.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
public class Course14ApplicationTests {
    @Resource
    private RedisService redisService;

    @Test
    public void contextLoads() {
//测试redis的string类型
        redisService.setString("weichat","程序员私房菜");
        log.info("我的微信公众号为：{}", redisService.getString("weichat"));
// 如果是个实体，我们可以使用json工具转成json字符串，
        User1 user = new User1("CSDN", "123456");
        redisService.setString("userInfo", JSON.toJSONString(user));
        log.info("用户信息：{}", redisService.getString("userInfo"));
//        // 前后分离就只需要 上面的,不需要转为实体类
        User1 userInfo = JSON.parseObject(redisService.getString("userInfo"), User1.class);
        System.out.println(userInfo.getUsername());

        log.info("用户信息：{}", redisService.getString("userInfo12"));
        // 添加信息
        // 1. 保存 新闻 到 mysql => 10
        // 2. 保存 新闻 到 redis news 10 => 实体对象 to Json 字符串
        // 读取：
        // redisService.getString("userInfo12") == null ? 到 mysql 中读取： 当前读取值
    }
}

