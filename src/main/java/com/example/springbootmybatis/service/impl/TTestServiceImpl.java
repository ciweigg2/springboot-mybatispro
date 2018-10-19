package com.example.springbootmybatis.service.impl;

import com.example.springbootmybatis.mapper.TTestMapper;
import com.example.springbootmybatis.model.TTest;
import com.example.springbootmybatis.service.TTestService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 马秀成
 * @date 2018/10/19
 * @jdk.version 1.8
 * @desc
 */
@Service
public class TTestServiceImpl implements TTestService {

    @Autowired
    private TTestMapper tTestMapper;

    public PageInfo<TTest> findwithPage(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        return new PageInfo<>(tTestMapper.find());
    }

    @Override
    public PageInfo<TTest> findByPage(int page, int pageSize) {
        return findwithPage(page ,pageSize);
    }
}
