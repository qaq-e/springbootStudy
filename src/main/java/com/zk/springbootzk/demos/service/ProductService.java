package com.zk.springbootzk.demos.service;


import com.zk.springbootzk.demos.dao.ProductDao;
import com.zk.springbootzk.demos.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public Product getProduct(Integer id) {
        return productDao.selectById(id);
    }
}
