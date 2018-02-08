package com.wt.study.dao;

import com.wt.study.domain.User;

import java.util.List;

public interface UserDao {
    List<User> conditionQuery(User user);

    List<User> queryByIds(List list);
}
