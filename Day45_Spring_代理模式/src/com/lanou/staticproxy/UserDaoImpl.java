package com.lanou.staticproxy;

public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("--------add________");
    }

    @Override
    public void delete() {
        System.out.println("--------delete-------");
    }
}
