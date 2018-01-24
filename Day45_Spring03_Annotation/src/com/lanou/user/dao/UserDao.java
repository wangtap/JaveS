package com.lanou.user.dao;

import com.lanou.user.domain.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.testng.annotations.Test;

@Repository
public class UserDao {

    public User userdao(){

        ClassPathXmlApplicationContext context =new  ClassPathXmlApplicationContext("spring-config.xml");
        User user = (User) context.getBean("user");
        return user;
    }

}
