package com.wt.study.orders.domain;

import com.wt.study.orderitem.domain.Orderitem;

import java.util.List;

public class OrderExample extends Order {
    private List<Orderitem> orderitemList;

    @Override
    public String toString() {
        return super.toString()+
                "OrderExample{" +
                "orderitemList=" + orderitemList +
                '}';
    }

    public List<Orderitem> getOrderitemList() {
        return orderitemList;
    }

    public void setOrderitemList(List<Orderitem> orderitemList) {
        this.orderitemList = orderitemList;
    }
}
