package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.model.TTest;
import com.example.springbootmybatis.model.TTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Mybatis Generator 2018/10/19
 */
@Mapper
public interface TTestMapper {
    long countByExample(TTestExample example);

    int deleteByExample(TTestExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TTest record);

    int insertSelective(TTest record);

    List<TTest> selectByExample(TTestExample example);

    TTest selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TTest record, @Param("example") TTestExample example);

    int updateByExample(@Param("record") TTest record, @Param("example") TTestExample example);

    int updateByPrimaryKeySelective(TTest record);

    int updateByPrimaryKey(TTest record);

    List<TTest> find();

    List<TTest> findByDeftlike(@Param("likeDeft")String likeDeft);

    List<TTest> findByName(@Param("name") String name);

    List<TTest> findByNameAndDeft(@Param("name") String name, @Param("deft") String deft);

    int insertList(@Param("list")List<TTest> list);

}