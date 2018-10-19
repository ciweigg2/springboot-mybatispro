package com.example.springbootmybatis.service;

import com.example.springbootmybatis.model.TTest;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

/**
 * @author 马秀成
 * @date 2018/10/19
 * @jdk.version 1.8
 * @desc
 */
public interface TTestService {

    PageInfo<TTest> findByPage(int page, int pageSize);

}
