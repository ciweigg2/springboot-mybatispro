package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.model.TTest;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TTestMapperTest {

    private static TTestMapper mapper;

    @BeforeClass
    public static void setUpMybatisDatabase() {
        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(TTestMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/TTestMapperTestConfiguration.xml"));
        //you can use builder.openSession(true) to commit to database
        mapper = builder.getConfiguration().getMapper(TTestMapper.class, builder.openSession());
    }

    @Test
    public void testinsertList() throws FileNotFoundException {
        List testLists = new ArrayList();
        TTest tTest = new TTest();
        tTest.setName("deft");
        tTest.setDeft("职业选手2");
        testLists.add(tTest);
        mapper.insertList(testLists);
    }

    @Test
    public void testfindByNameAndDeft() throws FileNotFoundException {
        mapper.findByNameAndDeft("deft", "职业选手");
    }

}
