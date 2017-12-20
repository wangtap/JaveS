package com.lanou3g.study;

public class Objiect {
    public Objiect(){
        System.out.println("构造方法");
    }
    {
        System.out.println("我是构造代码块");
    }
    static {
        System.out.println("我是静态代码块");
    }
    Thread thread= new Thread(new Runnable() {
        @Override
        public void run() {

        }
    });
}
