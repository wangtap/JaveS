package com.lanou3g.studay;

public class Main2 {
    public static void main(String[] args) {
        DeadLock deadLock =new DeadLock();
     new Thread(new Runnable() {
         @Override
         public void run() {
             deadLock.forThreadA();
         }
     }).start();
     new Thread(new Runnable() {
         @Override
         public void run() {
             deadLock.forThreadB();
         }
     }).start();



    }
}
