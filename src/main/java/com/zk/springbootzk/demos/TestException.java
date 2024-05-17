package com.zk.springbootzk.demos;

public class TestException extends Exception{
    private String message = "测试异常";

    public TestException(String mes) {
        this.message = mes;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
