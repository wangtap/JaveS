package com.lanou.cgproxy;

import org.junit.Before;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class CgproxyTest {

    private ClassPathXmlApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("spring-config.xml");
    }

    @Test
    public void test() throws Exception {
        CgTransaction cgTransaction = new CgTransaction();
        CgUserDaoImpl cgUserDao = new CgUserDaoImpl();
        Cgproxy cgproxy = new Cgproxy(cgTransaction, cgUserDao);

        Enhancer enhancer = new Enhancer();

        enhancer.setCallback(cgproxy);

        enhancer.setSuperclass(cgUserDao.getClass());

        CgUserDao o = (CgUserDao) enhancer.create();

        o.add();

    }
}