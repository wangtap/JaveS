package com.lanou3g.study;

public class Main2 {
    public static void main(String[] args) {
//        main2();



    }

    private static void main2() {
        //        Thread thread =new Thread(new HelloRunnable());
//        thread.start();

        for (int i = 0; i <5 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(".");
        }
    }
}
