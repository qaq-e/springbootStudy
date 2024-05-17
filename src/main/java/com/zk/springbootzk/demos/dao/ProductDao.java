package com.zk.springbootzk.demos.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zk.springbootzk.demos.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends BaseMapper<Product> {

    public Product getProductById(Integer id);

}
