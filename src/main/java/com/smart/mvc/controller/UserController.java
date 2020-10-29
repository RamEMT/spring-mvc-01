package com.smart.mvc.controller;

import com.smart.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: Ram
 * @Since: 2020.10.29 9:36
 * <p>
 * 一个控制器 一般就是一个功能模块
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/list")
    @ResponseBody
    public List<User> users() {
        return null;
    }

    @GetMapping("/info")
    @ResponseBody
    public User user() {
        return new User();
    }

    /**
     *  RequestMapping 注解参数
     *      1、value   请求路径 和参数 path 一样
     *      2、method  请求方式（枚举）
     *      3、consumes  Context-Type 类型
     *      4、headers
     *      5、produces
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET, consumes = "application/json")
    @ResponseBody
    public void test() {
        System.out.println("测试");
    }
}
