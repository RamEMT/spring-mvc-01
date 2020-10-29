package com.smart.mvc.controller;

import com.smart.mvc.dto.UserDto;
import com.smart.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Map;

/**
 * @Author: Ram
 * @Since: 2020.10.29 11:13
 * <p>
 * 如何接收参数
 * 1、基本类型
 * 2、对象（简单对象、复杂对象）
 * 3、map  数组  集合（list）
 * 4、日期
 *
 *  基本类型和简单对象可以直接声明，其他的使用json格式的数据上传
 */
@Controller
public class BaseParamsController {

    @GetMapping("/test")
    @ResponseBody
    public String test(String username) {
        System.out.println(username);
        return username;
    }

    @GetMapping("/test1")
    @ResponseBody
    public String test(String username, int id) {
        System.out.println(username);
        System.out.println(id);
        return username;
    }

    @GetMapping("/test2")
    @ResponseBody
    public String test(User user) {
        System.out.println(user);
        return "接收简单的对象参数";
    }

    @GetMapping("/test3")
    @ResponseBody
    public String test(UserDto userDto) {
        System.out.println(userDto);
        System.out.println(userDto.getAddress().getCity());
        return "接收复杂的对象参数";
    }

    @GetMapping("/test4")
    @ResponseBody
    public String test(int[] nums) {
        System.out.println(Arrays.toString(nums));
        return "接收数组参数";
    }


    @GetMapping("/test5")
    @ResponseBody
    public String test(Map<String, String> map) {
        System.out.println(map.toString());
        return "接收map参数";
    }

    /**
     * 接收list集合数据，必须配合 @RequestParam 注解使用 ，否则报错
     */
    @GetMapping("/test6")
    @ResponseBody
    public String test6(UserDto userDto) {
        System.out.println(userDto.getList().toString());
        return "接收list参数";
    }

    @GetMapping("/test7")
    @ResponseBody
    public String test6(HttpServletRequest request,
                        HttpServletResponse response,
                        HttpSession session,
                        Model model, ModelMap map) {
        System.out.println(request.toString());
        System.out.println(response.toString());
        return "接收妹纸对象参数";
    }

}
