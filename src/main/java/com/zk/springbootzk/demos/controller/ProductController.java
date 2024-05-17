package com.zk.springbootzk.demos.controller;

import com.zk.springbootzk.demos.config.JsonResult;
import com.zk.springbootzk.demos.dao.ProductDao;
import com.zk.springbootzk.demos.entity.Product;
import com.zk.springbootzk.demos.events.EmailEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @GetMapping("getById")
    public JsonResult getById(Integer id) {
//        Product product = productDao.getProductById(Integer.valueOf(id));
        List<Product> productList = productDao.selectList(null);
        return new JsonResult(productList);
    }

    @GetMapping("app")
    public JsonResult app(HttpServletRequest request){
        ServletContext app = request.getServletContext();
        return new JsonResult(app.getAttribute("product"));
    }

    @Resource
    private ApplicationContext applicationContext;


    @PostMapping("save")
    public JsonResult save(Product product) {
        System.out.println(product);
        productDao.insert(product);
        System.out.println("信息保存成功");
        EmailEvent emailEvent = new EmailEvent(this,product.getProductName(),"xxxxxx");
        applicationContext.publishEvent(emailEvent);
        System.out.println("通知去发个邮件");
        return new JsonResult(product);
    }

}
