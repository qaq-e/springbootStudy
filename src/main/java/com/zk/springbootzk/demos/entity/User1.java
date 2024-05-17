package com.zk.springbootzk.demos.entity;

import lombok.Data;

@Data
public class User1 {
    private String username;
    private String password;

    public User1() {}

    public User1(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
