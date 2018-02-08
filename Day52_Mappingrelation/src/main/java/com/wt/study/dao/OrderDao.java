package com.wt.study.dao;

import com.wt.study.domain.CrmStaff;
import com.wt.study.domain.Order;

import java.util.List;

public interface OrderDao {
    List<Order> queryOrder();

}

