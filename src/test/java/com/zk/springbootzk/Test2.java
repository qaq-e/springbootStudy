package com.zk.springbootzk;

import com.zk.springbootzk.demos.config.JsonResult;
import com.zk.springbootzk.demos.dao.ProductDao;
import com.zk.springbootzk.demos.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootTest
public class Test2 {

    @Autowired
    private ProductDao productDao;

    @Test
    public void t1() {
        List<Product> productList = productDao.selectList(null);
        productList.forEach(System.out::println);
    }
}
