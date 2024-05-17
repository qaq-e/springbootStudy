package com.zk.springbootzk.demos.controller;

import com.zk.springbootzk.demos.config.ChineseSearch;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;
import java.util.List;

@Controller
@RequestMapping("/lucene")
public class IndexController {

    @GetMapping("/test")
    public String test(Model model) {
// 索引所在的目录
        String indexDir = "D:\\lucene2";
// 要查询的字符
     String q = "南京文明";
        try {
            List<String> list = ChineseSearch.search(indexDir, q);
            model.addAttribute("list", list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "result";
    }
}

