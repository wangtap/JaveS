package com.lanou3g;

public class Student {

    private String name = "张三疯";

    @Override
    public String toString() {
        /*
        修改从父类继承过来的方法
        这就是复写，重写，覆盖
         */
        return name;
    }
}
