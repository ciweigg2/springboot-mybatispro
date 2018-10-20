package com.example.springbootmybatis.model;

import java.io.Serializable;
import lombok.Data;

/**
* Created by Mybatis Generator 2018/10/19
*/
@Data
public class TTest implements Serializable {
    /* 用户id*/
    private Long id;

    /* 用户名*/
    private String name;

    /* 用户数据*/
    private String deft;

    private static final long serialVersionUID = 1L;
}