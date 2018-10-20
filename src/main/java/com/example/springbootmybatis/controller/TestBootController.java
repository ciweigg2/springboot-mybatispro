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

import java.util.ArrayList;
import java.util.List;

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

    @Autowired
    private TTestMapper tTestMapper;

    @RequestMapping("/getList")
    public String getUser(int page ,int pageSize) {
        PageInfo<TTest> list =  tTestService.findByPage(page,pageSize);
        List testLists = new ArrayList();
        TTest tTest = new TTest();
        tTest.setName("deft");
        tTest.setDeft("职业选手");
        testLists.add(tTest);
        tTestMapper.insertList(testLists);
        return JSON.toJSONString(list);
    }

}
