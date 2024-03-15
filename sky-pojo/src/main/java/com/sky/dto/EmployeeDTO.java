package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeDTO implements Serializable {

    // 来自02-03第二分钟的注释，需要注释掉id
    // TODO
    // private Long id;

    private String username;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;

}
