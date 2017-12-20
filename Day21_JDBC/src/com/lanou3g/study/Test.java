package com.lanou3g.study;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        静态的东西随着类的加载而进入内存所以当我们未创建对象，只是将类加载
        会执行该类的静态代码块
        而因为类只需要加载一次，所以在创建T时，不会执行静态代码块
         */


//        Class c=Objiect.class;//类对象
//        Class<?> aClass = Class.forName("com.lanou3g.study.Objiect");//加载类

      new Objiect();

    }
}
