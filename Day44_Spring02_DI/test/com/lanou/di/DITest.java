package com.lanou.di;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class DITest {
    private ApplicationContext context;
    @Before
    public void setUp() throws Exception {
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void person() throws Exception {
        Object per = context.getBean("per");
        System.out.println(per);
    }

    @Test
    public void wt() throws Exception {
        Object wt = context.getBean("wt");
        System.out.println(wt);
    }
}