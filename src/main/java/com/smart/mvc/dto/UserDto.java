package com.smart.mvc.dto;

import lombok.Data;

import java.util.List;

/**
 * @Author: Ram
 * @Since: 2020.10.29 17:17
 */
@Data
public class UserDto {
    private int id;
    private String username;
    private AddressDto address;
    private List<String> list;
}
