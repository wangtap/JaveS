package com.lanou.user.service;

import com.lanou.user.dao.UserDao;
import com.lanou.user.domain.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User userservice(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        return userDao.userdao();
    }
}
