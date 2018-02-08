package com.lanou.domain;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UserTest {

    private SqlSession sqlSession;

    @Before
    public void before() throws IOException {
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        sqlSession = sessionFactory.openSession();
    }

    @Test
    public void insertUser() throws Exception {
        User user = new User("1王小艺",1,"男",new Date(),"中南海");
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        //把配置文件中的信息封装成一个对象
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sessionFactory.openSession();
        sqlSession.insert("user.insertUser",user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectByName() throws Exception {
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        SqlSession sqlSession = sessionFactory.openSession();
        List<Object> o = sqlSession.selectList("user.selectByName","王");
        System.out.println(Arrays.toString(o.toArray()));
        sqlSession.close();
    }

    @Test
    public void deleteById() throws Exception {
        sqlSession.delete("user.deleteById",8);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser() throws Exception {
        User 王小艺 =sqlSession.selectOne("user.selectByUsername", "王小艺");
        王小艺.setSex("女 ");
        王小艺.setBirthday(new Date(1000000));
        王小艺.setAddress("121223213");
        sqlSession.update("user.updateUser",王小艺);
        sqlSession.commit();
        sqlSession.close();
    }
}