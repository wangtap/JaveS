package com.lanou.aop;

import org.junit.Test;
import org.springframework.aop.SpringProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserDaoImplTest {
    @Test
    public void name() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Object o = context.getBean("userDao");
        System.out.println(o.getClass().getName());
        System.out.println(o.getClass().getSuperclass().getName());
        Class<?>[] interfaces = o.getClass().getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
        UserDao user = (UserDao) o;
        user.add();
        user.delete();


    }
}