package com.lanou.study.user.dao;

import com.lanou.study.user.domain.OrderDetail;
import com.lanou.study.user.domain.Orders;
import com.lanou.study.user.domain.OrdersExt;

import java.util.List;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    List<OrdersExt> findOrdersUser();

    List<OrderDetail>  findOrdersAll();
}