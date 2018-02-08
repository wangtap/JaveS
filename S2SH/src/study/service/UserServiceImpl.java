package study.service;

import study.dao.UserDaoImpl;

public class UserServiceImpl implements UserSerivice {
    private UserDaoImpl userDao;

    @Override
    public void register() {
        userDao.add();
        System.out.println("------register-----");
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public UserDaoImpl getUserDao() {
        return userDao;
    }
}
