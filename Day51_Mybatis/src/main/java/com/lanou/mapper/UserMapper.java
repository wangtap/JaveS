package com.lanou.mapper;

import com.lanou.domain.User;

import java.util.List;
public interface UserMapper {

    public User findUserById(int id);

    public List<User> findUsersByName(String username);

    public void insertUser(User user);
}
