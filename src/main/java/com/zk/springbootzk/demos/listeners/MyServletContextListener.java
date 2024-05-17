package com.zk.springbootzk.demos.listeners;

import com.zk.springbootzk.demos.entity.Product;
import com.zk.springbootzk.demos.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;

@Component
public class MyServletContextListener implements
        ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent)
    {
// 先获取到application上下文
        ApplicationContext applicationContext =
                contextRefreshedEvent.getApplicationContext();
// 获取对应的service
        ProductService productService = applicationContext.getBean(ProductService.class);
        Product product = productService.getProduct(4);
// 获取application域对象，将查到的信息放到application域中
        ServletContext application =
                applicationContext.getBean(ServletContext.class);
        application.setAttribute("product", product);
    }
}