package com.lanou.dao;

import com.lanou.domain.Orders;
import com.lanou.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest {

    private UserMapper userMapper;
    private OrdersMapper ordersMapper;
    private SqlSession sqlSession;

    @Before
    public void setUp() throws Exception {
        sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml")).openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
        ordersMapper = sqlSession.getMapper(OrdersMapper.class);
    }

    @Test
    public void findAll() throws Exception {
        List<User> user = userMapper.findUser();
        System.out.println(user);
    }

    @Test
    public void insertUser() throws Exception {
        User user = new User();
        user.setUsername("马云");
        userMapper.insertUser(user);
        Orders orders = new Orders();
        orders.setNumber("马云的订单");
        orders.setUser_id(user.getId());
        ordersMapper.insertOrders(orders);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test() throws Exception {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper1 = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper3 = sqlSession.getMapper(UserMapper.class);

        System.out.println(mapper);
        System.out.println(mapper1);
        System.out.println(mapper2);
        System.out.println(mapper3);
    }

    @After
    public void after(){


    }
}