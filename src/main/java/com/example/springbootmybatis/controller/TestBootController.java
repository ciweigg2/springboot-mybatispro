package com.example.springbootmybatis.controller;

import com.alibaba.fastjson.JSON;
import com.example.springbootmybatis.mapper.TTestMapper;
import com.example.springbootmybatis.model.TTest;
import com.example.springbootmybatis.service.TTestService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 马秀成
 * @date 2018/10/18
 * @jdk.version 1.8
 * @desc
 */
@RestController
public class TestBootController {

    @Autowired
    private TTestService tTestService;

    @RequestMapping("/getList")
    public String getUser(int page ,int pageSize) {
        PageInfo<TTest> list =  tTestService.findByPage(page,pageSize);
        return JSON.toJSONString(list);
    }

}
