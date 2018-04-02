package com.wt.springbootwhj.service.impl;


import com.wt.springbootwhj.domain.Article;
import com.wt.springbootwhj.domain.Comment;
import com.wt.springbootwhj.domain.Order;
import com.wt.springbootwhj.domain.User;
import com.wt.springbootwhj.mapper.ArticleMapper;
import com.wt.springbootwhj.mapper.CommentMapper;
import com.wt.springbootwhj.mapper.OrderMapper;
import com.wt.springbootwhj.mapper.UserMapper;
import com.wt.springbootwhj.service.WYJService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("wyjService")
public class WYJServiceImpl implements WYJService {
    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Article> selectAll() {
        return articleMapper.select();
    }

    @Override
    public List<Article> selectArticleByHot(int page) {
        return articleMapper.selectHot((page-1)*Article.PAGE_SIZE,Article.PAGE_SIZE);
    }

    @Override
    public Article selectArticeById(int id) {
        return articleMapper.selectArticeById(id);
    }

    @Override
    public List<Article> selectArticeType(int type) {
        return articleMapper.selectArticeType(type);
    }

    @Override
    public User selectUser(String user_name) {
        return userMapper.selectByUsername(user_name);
    }

    @Override
    public User selectUserByLogin(User user) {
        return userMapper.selectUserByLogin(user);
    }

    @Override
    public int selectUserByPhone(User user) {
        return userMapper.selectUserByPhone(user);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public User isExist(User user) {
        return userMapper.isExist(user);
    }

    @Override
    public Boolean updataUser(User user) {
        return userMapper.updataUser(user);
    }

    @Override
    public List<Comment> selectCommentById(int id) {
        return commentMapper.selectCommentById(id);
    }

    @Override
    public boolean insertOrder(Order order) {
        return orderMapper.insertOrder(order);
    }

    @Override
    public List<Order> selectOrderByUid(int uid) {
        return orderMapper.selectOrderByUid(uid);
    }

    @Override
    public boolean delete(int oid) {
        return orderMapper.delete(oid);
    }

    @Override
    public boolean updataOrder(Order order) {
        return orderMapper.updataOrder(order);
    }


}
