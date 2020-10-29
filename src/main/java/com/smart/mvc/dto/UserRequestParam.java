package com.smart.mvc.dto;

import lombok.Data;

import java.util.List;

/**
 * @Author: Ram
 * @Since: 2020.10.29 17:12
 */
@Data
public class UserRequestParam {

    private String username;
    private int age;
    private List<AddressDto> addressDtoList;
}
