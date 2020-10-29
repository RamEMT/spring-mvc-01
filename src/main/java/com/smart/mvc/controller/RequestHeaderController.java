package com.smart.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Ram
 * @Since: 2020.10.29 20:31
 */
@Controller
public class RequestHeaderController {

    @GetMapping("h1")
    @ResponseBody
    public String test1(@RequestHeader String token){
        System.out.println(token);
        return "请求头传递参数";
    }

    @GetMapping("h2")
    @ResponseBody
    public String test2(@CookieValue("TY_SESSION_ID") String tsi){
        System.out.println(tsi);
        return "cookie参数";
    }
}
