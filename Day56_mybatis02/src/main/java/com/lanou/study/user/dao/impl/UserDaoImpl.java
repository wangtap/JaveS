package com.lanou.study.user.dao.impl;

import com.lanou.study.user.dao.UserDao;
import com.lanou.study.user.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private  SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) throws IOException {
        this.sqlSessionFactory = sqlSessionFactory;
    }
    public UserDaoImpl() throws IOException {
    }

    public User findUserById(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("findUserById", id);
        return user;
    }

    public List<User> findUsersByName(String name) {
        return null;
    }

    public void insertUser(User user) {

    }
}
