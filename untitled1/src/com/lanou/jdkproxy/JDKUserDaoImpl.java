package com.lanou.jdkproxy;

import org.springframework.stereotype.Repository;

@Repository
public class JDKUserDaoImpl implements JDKUserDao {
    @Override
    public void add() {
        System.out.println("--------add----");
    }
}
