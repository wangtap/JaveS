package com.wt.study.user.domain;

import com.wt.study.orders.domain.Order;

import java.util.List;

public class UserExample extends User {
    private List<Order> orderList;

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }


    @Override
    public String toString() {
        return super.toString()+
                "UserExample{" +
                "orderList=" + orderList +
                '}';

    }
}
