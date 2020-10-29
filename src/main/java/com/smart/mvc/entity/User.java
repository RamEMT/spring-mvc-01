package com.smart.mvc.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: Ram
 * @Since: 2020.10.29 9:39
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String username;
}
