package com.lanou.aop;


import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
//        int a=10/0;
        System.out.println("-------add--------");
    }
//
//    @Override
//    public void select() {
//        System.out.println("--------select------");
//    }
}
