package com.zk.springbootzk.demos.controller;


import com.zk.springbootzk.demos.config.ChineseSearch;
import com.zk.springbootzk.demos.config.Indexer;
import com.zk.springbootzk.demos.config.search;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("lucence")
public class LucenceController {

//    @GetMapping("test1")
//    public String test1() {
        //索引保存到的路径
//        String indexDir = "D:\\lucene";
//        //需要索引的文件数据存放的目录
//        String dataDir = "D:\\lucene\\data";
//        Indexer indexer = null;
//        int indexedNum = 0;
//        //记录索引开始时间
//        long startTime = System.currentTimeMillis();
//        try {
//// 开始构建索引
//            indexer = new Indexer(indexDir);
//            indexedNum = indexer.indexAll(dataDir);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
////记录索引结束时间
//        long endTime = System.currentTimeMillis();
//        System.out.println("索引耗时" + (endTime - startTime) + "毫秒");
//        System.out.println("共索引了" + indexedNum + "个文件");
//        return "success";

//    }

//    简化
    @GetMapping("test1")
    public void test1() throws Exception {
            new Indexer("D:\\lucene").indexAll("D:\\lucene\\data");
    }

//    @GetMapping("test2")
//    public String test2() {
//        String indexDir = "D:\\lucene";
////查询这个字符串
//        String q = "live";
//        try {
//            search.search(indexDir, q);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return "success";
//    }

// 简化
    @GetMapping("test2")
    public String test2() throws Exception {
        String indexDir = "D:\\lucene";
        //查询这个字符串
        String q = "live";
        search.search(indexDir, q);
        return "success";
    }


}
