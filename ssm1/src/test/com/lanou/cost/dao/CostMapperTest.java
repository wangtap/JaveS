package com.lanou.cost.dao;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class CostMapperTest {
    @Test
    public void t1() throws Exception {
        CostMapper costMapper = (CostMapper) new ClassPathXmlApplicationContext("springmvc-servlet.xml").getBean(CostMapper.class);

//        System.out.println(costMapper.findAllByPage(1,3));

    }
}