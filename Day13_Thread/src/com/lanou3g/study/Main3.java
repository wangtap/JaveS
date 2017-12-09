package com.lanou3g.study;

public class Main3 {

    private static int num;

    public static void main(String[] args) {
        num = 100000;
        //调研?
        //为什么局部变量在内部类中使用时
        //一定要应final修饰?
        public

        /*
        什么是原子性操作？
        int a =1 ; 是原子性操作
        int b = a+1 ; 不是原子性操作
        第一部：找到 a的值
        第二部：把a的值与1相加的到和
        第三部：把和给b
         */

        pu
        startOnethread();
        startOnethread();
        startOnethread();
        startOnethread();



    }

    private static void startOnethread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 25000; i++) {
                    System.out.println(--num);
                }
            }
        }).start();
    }
}
