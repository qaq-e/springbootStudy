package com.zk.springbootzk.demos.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "用户实体类")
public class User {
    @ApiModelProperty(value = "用户唯一标识")
    private Long id;
    @ApiModelProperty(value = "用户名")
    private String username;
    @ApiModelProperty(value = "用户密码")
    private String userpwd;

    public User(Long id, String username, String userpwd) {
        this.id = id;
        this.username = username;
        this.userpwd = userpwd;
    }
}
