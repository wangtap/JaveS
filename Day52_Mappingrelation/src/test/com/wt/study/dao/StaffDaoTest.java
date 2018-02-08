package com.wt.study.dao;

import com.wt.study.domain.CrmDepartment;
import com.wt.study.domain.CrmStaff;
import com.wt.study.domain.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class StaffDaoTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void queryStaff() throws Exception {

        SqlSession session =
                sqlSessionFactory.openSession();
        StaffDao staffDao = session.getMapper(StaffDao.class);
        List<CrmStaff> crmStaffs = staffDao.queryStaff();
        System.out.println(crmStaffs);
        session.close();

    }

    @Test
    public void queryOrder() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderDao orderDao = sqlSession.getMapper(OrderDao.class);
        List<Order> orders = orderDao.queryOrder();
        System.out.println(orders);
        sqlSession.close();
    }

    @Test
    public void department() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        DepartmentDao departmentDao = sqlSession.getMapper(DepartmentDao.class);
        List<CrmDepartment> crmDepartments = departmentDao.queryDepartment();
        System.out.println(crmDepartments);
        sqlSession.close();
    }
}