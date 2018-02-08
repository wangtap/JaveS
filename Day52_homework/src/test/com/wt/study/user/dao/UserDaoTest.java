package com.wt.study.user.dao;

import com.wt.study.commodity.dao.CommodityDao;
import com.wt.study.commodity.domain.Commodity;
import com.wt.study.orders.dao.OrderDao;
import com.wt.study.orders.domain.Order;
import com.wt.study.orderitem.dao.OrderitemDao;
import com.wt.study.orderitem.domain.Orderitem;
import com.wt.study.user.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class UserDaoTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void insert() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        OrderDao orderDao = sqlSession.getMapper(OrderDao.class);
        OrderitemDao orderitemDao = sqlSession.getMapper(OrderitemDao.class);
              User user = new User("王铭","123");
        userDao.insert(user);
        sqlSession.commit();
        Order order1 = new Order("订单1",user.getUserid());
        Order order2 = new Order("订单2",user.getUserid());
        orderDao.insert(order1);
        orderDao.insert(order2);
        sqlSession.commit();
       orderitemDao.insert( new Orderitem(order1.getOid(),
               1,1,10));
        orderitemDao.insert( new Orderitem(order1.getOid(),
                2,1,20));
        orderitemDao.insert( new Orderitem(order2.getOid(),
                1,1,10));
        orderitemDao.insert( new Orderitem(order2.getOid(),
                2,1,20));
        orderitemDao.insert( new Orderitem(order2.getOid(),
                        3,1,30));
        User user1 = new User("王文", "123");
        userDao.insert(user1);
        sqlSession.commit();
        Order order3 = new Order("订单",user1.getUserid());
        orderDao.insert(order3);
        sqlSession.commit();
        orderitemDao.insert( new Orderitem(order3.getOid(),
                4,1,1));
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void insertCommodity() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CommodityDao commodityDao = sqlSession.getMapper(CommodityDao.class);
        commodityDao.insert(new Commodity("雨伞",10));
        commodityDao.insert(new Commodity("雨靴",20));
        commodityDao.insert(new Commodity("雨衣",30));
        commodityDao.insert(new Commodity("墨水",1));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void orders() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderDao orderDao = sqlSession.getMapper(OrderDao.class);
        Order order = new Order("123", 30);
        orderDao.insert(order);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void queryAll() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> users = userDao.queryAll();
        System.out.println(users);
        sqlSession.close();
    }
}