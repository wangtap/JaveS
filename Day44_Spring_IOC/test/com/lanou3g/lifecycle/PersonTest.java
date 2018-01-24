package com.lanou3g.lifecycle;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class PersonTest {
    private static ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context=new ClassPathXmlApplicationContext("applicationContext.xml");

    }

    @Test
    public void life() throws Exception {
        Object per = context.getBean("per");
        ((ClassPathXmlApplicationContext) context).close();
    }
}