package com.lanou.study.user.dao;

import com.lanou.study.user.domain.User;

import java.util.List;

public interface UserDao {

    User findUserById(int id);
     List<User> findUsersByName(String name);
      void insertUser(User user);
}
