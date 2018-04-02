package com.wt.springbootwhj.service;


import com.wt.springbootwhj.domain.Article;
import com.wt.springbootwhj.domain.Comment;
import com.wt.springbootwhj.domain.Order;
import com.wt.springbootwhj.domain.User;

import java.util.List;

public interface WYJService {
    List<Article> selectAll();
    List<Article> selectArticleByHot(int page);
    Article selectArticeById(int id);
    List<Article> selectArticeType(int type);

    User selectUser(String user_name);
    User selectUserByLogin(User user);
    int selectUserByPhone(User user);
    void insertUser(User user);
    User isExist(User user);
    Boolean updataUser(User user);

    List<Comment> selectCommentById(int id);

    boolean insertOrder(Order order);
    List<Order> selectOrderByUid(int uid);
    boolean delete(int oid);
    boolean updataOrder(Order order);
}
