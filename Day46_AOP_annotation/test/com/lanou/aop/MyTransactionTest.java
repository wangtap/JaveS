package com.lanou.aop;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class MyTransactionTest {

    private ClassPathXmlApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("spring-config.xml");
    }

    @Test
    public void aop() throws Exception {
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.add();
        userDao.get();
//        MyTransaction  transaction = (MyTransaction) context.getBean("transaction");
    }

    @Test
    public void tran(){
//        Object t = context.getBean("t");
//        MyTransaction myTransaction1 = new MyTransaction();
//        System.out.println(myTransaction1.getClass().getName());
//        Object myTransaction = context.getBean("myTransaction");

    }

}