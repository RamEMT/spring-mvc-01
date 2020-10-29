package com.smart.mvc.controller;

import com.smart.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: Ram
 * @Since: 2020.10.29 9:36
 *
 *  一个控制器 一般就是一个功能模块
 */
@Controller
public class UserController {

    @GetMapping("/list")
    @ResponseBody
    public List<User> users(){
        return null;
    }

    @GetMapping("/user")
    @ResponseBody
    public User user(){
        return new User();
    }
}
