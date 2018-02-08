package com.lanou.cgproxy;

import org.springframework.stereotype.Repository;

@Repository
public class CgUserDaoImpl implements CgUserDao {
    @Override
    public void add() {
        System.out.println("--------add----");
    }
}
