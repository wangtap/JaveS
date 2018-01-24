package com.lanou3g.factory;

import com.lanou3g.createobj.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class FactoryTest {
    private static ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context=new ClassPathXmlApplicationContext("applicationContext.xml");

    }

    @Test
    public void staticFactory() throws Exception {
        User staticFactory = (User) context.getBean("staticFactory");
        System.out.println(staticFactory.toString());
    }

    @Test
    public void fact() throws Exception {
        /*
        因为我们在配置文件中，已近为user3指定了工厂
        ，所以我们这里不需要获得工厂在获得User对象
        Spring已近帮我们做好了
         */
        Object user3 = context.getBean("user3");
        System.out.println(user3);
    }
}