package com.zk.springbootzk.demos.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Product {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String productName;
    private String productNumber;
    private String addedTime;
}
