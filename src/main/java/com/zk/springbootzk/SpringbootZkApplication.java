package com.zk.springbootzk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
@MapperScan("com.zk.springbootzk.demos.dao")
public class SpringbootZkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootZkApplication.class, args);
    }

}
