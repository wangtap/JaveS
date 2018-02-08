package com.lanou.study.user.service;

import com.lanou.study.user.dao.UserDao;
import com.lanou.study.user.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


 @org.springframework.stereotype.Service
public class Service {
//    private ApplicationContext context=new ClassPathXmlApplicationContext("spring-servlet.xml");
//    private UserDao userDao= (UserDao) context.getBean("userDao");

    public void register(User user){
        System.out.println(user);
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-servlet.xml");
        UserDao userDao= (UserDao) context.getBean("userDao");
        userDao.insertUser(user);
    }

    public String   login(User user){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-servlet.xml");
        UserDao userDao= (UserDao) context.getBean("userDao");
        User login = userDao.login(user);
        if (login!=null){
            return "success";
        }else {
            return "login";
        }
    }
}
