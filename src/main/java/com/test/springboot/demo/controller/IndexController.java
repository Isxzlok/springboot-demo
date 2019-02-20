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
     * 2. git remote add origin https://github.com/Isxzlok/springboot-demo
     *
     * 3. git status //查看项目中有哪些需要提交的文件
     *
     * 4. git add . //添加所要提交的文件到commit
     *
     * 5. git commit -m '这是提交的原因'
     *
     * 6. git push --set-upstream origin master //第一次提交敲这条命令
     *
     * 以后提交都只需敲 git push
     *
     *
     * .gitignore文件   该文件作用是避免提交一些不必要的文件
     *
     *
     *
     */



}
