package com.lanou3g.study;

public class HelloRunnable implements  Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("hello runnable:"+i);
        }

    }
}
