package com.test.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {


    @RequestMapping(value = "index")
    @ResponseBody
    public String index() {
        return "Hello world";
    }

    /**
     *
     * 1. git init
     *
     * 2. git status //查看项目中有哪些需要提交的文件
     *
     * 2. git remote add origin https://github.com/Isxzlok/springboot-demo
     *
     */



}
