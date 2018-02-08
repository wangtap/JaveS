package com.lanou.study.user.dao.impl;

import com.lanou.study.user.dao.UserDao;
import com.lanou.study.user.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class UserDaoImplTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void name() throws Exception {
        UserDao userDao = new UserDaoImpl(sqlSessionFactory);
        User userById = userDao.findUserById(2);
        System.out.println(userById);
    }

    @Test
    public void orders() throws Exception {

    }
}