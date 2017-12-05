package com.lanou3g;

import java.util.ArrayList;
import java.util.List;

public class study {
    public static class Main {
        public static  void main (String [] args ){
//            System.out.println("123");
            /*            /*
            psvm main 方法的快捷键
            sout  输出语句的快捷键
             */
/*
            集合 、什么是集合？
            在使用数组时，发现数组的长度是不可变的
            在初始化就定义好了，不可改变

            这时候我们来学习一下集合
            集合可以装载一些元素
            并且，集合的大小可以改变
             */
//            创建了一个集合对象
            ArrayList  list=new ArrayList();//多态
            /*
            通过观察发现，List是一个接口
            那么Arraylist一定是List接口的一个实现类
            java中，类最多只能继承一个类
            java中只支持单继承
            但是java中支持多实现
            实现：一个类可以实现接口，
            多个接口之间通过逗号隔开

             */
//            System.out.println(list.size());
            /*
            length 数组的长度，是一个属性
            length ()是字符串的长度，是一个方法
            size（） 是集合的方法，获取集合的长度
             */
//            给集合添加一个元素
//            add方法可以接受任意一个类型的对象
            list.add("张三");
            list.add(new Student());
            list.add(1);
            System.out.println(list.size());
         for (int i = 0; i <list.size(); i++) {
                Object obj =list.get(i);
                System.out.println(obj.toString());
            }
            /*
            基本数据类型包装类
            八大基本数据类型，每个类型都有一个包装类
            包装类。其实就是一个class，就是一个类型

            可以创建该类型的对象

            对应关系
            int   Integer
            char   Character
            byte  Byte
            short Short
            long  Long
            float Float
            double Double
            boolean  Boolean

            除了int和char 其他都是基本数据类型的大驼峰结构

            自动拆箱和自动装箱

            Integer  a =1;//自动装箱
            //a=new Integer (1);

            int b =a;//自动拆箱

             */
            Integer a =1;
            int  b  =a ;
            Object obj=1;
            System.out.println(obj.getClass().getName());
            System.out.println(a.getClass().getName());


        }

    }
}
