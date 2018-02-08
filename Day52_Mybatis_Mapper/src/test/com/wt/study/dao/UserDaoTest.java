package com.wt.study.dao;

import com.wt.study.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class UserDaoTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void t1() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setSex("男");
        List<User> users = mapper.conditionQuery(user);
        System.out.println(users);
        sqlSession.close();
    }

    @Test
    public void queryByIds() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
       List<Integer> list=new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
        List<User> users = mapper.queryByIds(list);
        System.out.println(users);
        sqlSession.close();
    }

    @Test
    public void name() throws Exception {
        SqlSession session =
                sqlSessionFactory.openSession();
        session.close();
    }
}