package com.zk.springbootzk.demos.web;

import com.zk.springbootzk.demos.TestException;

public class Test2 {

    public void tt() throws TestException{
        int num = 1;
        if(num == 1){
            throw new TestException("编码001异常");
        }
        else if (num == 2) {
            throw new TestException("编码002异常");
        }
        //  强行抛出异常
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        try {
            test2.tt();
        }  catch (TestException e) {
            System.out.println(e.getMessage());
        }
    }

}
