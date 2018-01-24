package com.lanou.study.dao;

import com.lanou.study.domain.User;

public class UserDao {
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public void add(){
        System.out.println("Dao:添加了一个User"+user.getName());
    }
}
