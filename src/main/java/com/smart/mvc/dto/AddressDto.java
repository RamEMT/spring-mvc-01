package com.smart.mvc.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: Ram
 * @Since: 2020.10.29 17:14
 */
@Data
public class AddressDto implements Serializable {

    private int id;
    private String city;
}
