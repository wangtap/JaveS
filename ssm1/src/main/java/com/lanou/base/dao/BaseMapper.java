package com.lanou.base.dao;

import com.lanou.page.PageBean;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T>{
    int deleteByPrimaryKey(Serializable id);

    int insert(T t);

    int insertSelective(T t);

    T selectByPrimaryKey(Serializable id);

    int updateByPrimaryKeySelective(T t);

    int updateByPrimaryKey(T t);

    List<T> findAll(PageBean<T> pageBean);

    List<T> findAllByPage(PageBean<T> pageBean);

    int findTotalData();
}
