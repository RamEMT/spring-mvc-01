package com.smart.mvc.controller;

import com.smart.mvc.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Ram
 * @Since: 2020.10.29 15:24
 * <p>
 * 前后端不分离 --- @Controller
 * 前后端分离 --- @ResponseBody
 * <p>
 * REST风格
 * 域名/api/功能模块?参数
 */
@RestController
public class ResponseController {

    /**
     * 动态路径 在 mapping 声明 {变量}
     * 在参数中 使用 @PathVariable 注解
     *
     * @param id
     * @return
     */
    @GetMapping("/detail/{id}")
    public User detail(@PathVariable int id) {
        System.out.println(id);
        return null;
    }

    @GetMapping("/list/{page}/{size}")
    public String list(@PathVariable int page,@PathVariable int size){
        System.out.println(page);
        System.out.println(size);
        return "动态路径";
    }
}
