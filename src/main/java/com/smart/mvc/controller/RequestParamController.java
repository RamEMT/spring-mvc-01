package com.smart.mvc.controller;

import com.smart.mvc.dto.UserRequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Ram
 * @Since: 2020.10.29 14:12
 */
@Controller
public class RequestParamController {

    /**
     *  value --- 别名
     */
    @GetMapping("/t1")
    @ResponseBody
    public String test(@RequestParam(value = "user_name") String username){
        System.out.println(username);
        return "RequestParam注解的使用";
    }

    /**
     * RequestParam 属性
     *      value 当客户端的参数与方法的参数不一致时用 -- 别名
     *      required 默认为true 表示必要参数
     *      defaultValue 给参数赋默认值
     */
    @GetMapping("/t2")
    @ResponseBody
    public String test2(@RequestParam(value = "username",required = false) String name,
                        @RequestParam(required = false,defaultValue = "1") int page,
                        @RequestParam(required = false,defaultValue = "10") int size){
        System.out.println(name);
        System.out.println(page);
        System.out.println(size);
        return "RequestParam注解使用默认值";
    }


    @PostMapping(value = "/t3",consumes = "application/json")
    @ResponseBody
    public String test3(@RequestBody UserRequestParam param){
        System.out.println(param);
        return "RequestBody注解的使用";
    }

    
}
