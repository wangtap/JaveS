package com.lanou.jdkproxy;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

public class JDKProxyTest {

    private ClassPathXmlApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("spring-config.xml");
    }

    @Test
    public void jdktest() throws Exception {
        JDKUserDaoImpl jdkUserDao = new JDKUserDaoImpl();
        JDKTransaction jdkTransaction = new JDKTransaction();
        JDKProxy jdkProxy = new JDKProxy(jdkUserDao, jdkTransaction);
        JDKUserDao o = (JDKUserDao) Proxy.newProxyInstance(jdkUserDao.getClass().getClassLoader(), jdkUserDao.getClass().getInterfaces(), jdkProxy);
        o.add();


    }
}