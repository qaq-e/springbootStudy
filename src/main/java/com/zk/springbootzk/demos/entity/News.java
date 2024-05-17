package com.zk.springbootzk.demos.entity;

import lombok.Data;

@Data
public class News {

    private Integer id;
    private String title;
    private String conenent;

    public News(Integer id, String title, String conenent) {
        this.id = id;
        this.title = title;
        this.conenent = conenent;
    }
}
