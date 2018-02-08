package com.wt.study.user.dao;

import com.wt.study.user.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;

import static org.junit.Assert.*;

public class UserDaoTest {
    private ApplicationContext context;
    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("spring-config.xml");
    }
    @Test
    public void testFindUserById() {
        UserDao userDao = (UserDao) context.getBean("userDao");
        User user = userDao.findUserById(1);
        System.out.println(user);
    }
}