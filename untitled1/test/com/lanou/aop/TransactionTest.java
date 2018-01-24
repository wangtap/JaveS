package com.lanou.aop;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class TransactionTest {

    private ClassPathXmlApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("spring-config.xml");
    }

    @Test
    public void aop() throws Exception {
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.add();
    }

}