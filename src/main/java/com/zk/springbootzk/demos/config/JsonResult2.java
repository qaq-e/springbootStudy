package com.zk.springbootzk.demos.config;


import lombok.Data;

@Data
public class JsonResult2 {
    /**
     * 异常码
     */
    protected String code;
    /**
     * 异常信息
     */
    protected String msg;
    public JsonResult2() {
        this.code = "200";
        this.msg = "操作成功";
    }
    public JsonResult2(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
// get set
}

