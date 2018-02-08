package com.lanou.account.dao;

import com.lanou.account.domain.Account;
import com.lanou.cost.dao.CostMapper;
import com.lanou.cost.domain.Cost;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class accountMapperTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void name() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springmvc-servlet.xml");
        CostMapper mapper = (CostMapper) context.getBean(CostMapper.class);
        List<Cost> all = mapper.findAll();
                System.out.println(all);
    }
}