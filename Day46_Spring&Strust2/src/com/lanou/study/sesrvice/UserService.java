package com.lanou.study.sesrvice;

import com.lanou.study.dao.UserDao;

public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void register(){
        userDao.add();
    }
}
