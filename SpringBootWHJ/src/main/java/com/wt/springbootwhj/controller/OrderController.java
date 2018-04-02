package com.wt.springbootwhj.controller;


import com.wt.springbootwhj.domain.Order;
import com.wt.springbootwhj.service.WYJService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
public class OrderController {
    @Autowired
    @Qualifier("wyjService")
    private WYJService wyjService;

    @RequestMapping(value="/insertOrder")
    public boolean insertOrder(Order order){
       return wyjService.insertOrder(order);
    }

    @RequestMapping(value="/selectOrderByUid")
    public List<Order> selectOrderByUid(int uid) {
        return wyjService.selectOrderByUid(uid);
    }

    @RequestMapping(value = "/remove")
    public boolean delete(int oid){
        return wyjService.delete(oid);
    }

    @RequestMapping(value = "/updataOrder")
    public boolean updataOrder(Order order) {
        return wyjService.updataOrder(order);
    }
}
