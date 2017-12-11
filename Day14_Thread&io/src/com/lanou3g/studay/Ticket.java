package com.lanou3g.studay;

public class Ticket {
    public  void sellTick(){
        //大括号：代码块
        //synchronized:同步
        //所以这个代码块叫同步代码块
        //synchronized:后面的括号中要传入的就是这个同步 块 的锁对象
        //this：本类对象：指根据这个类创造出来的类型Ticket
        //Ticket.class这 个类的类对象类型为lass
        //
        synchronized (Ticket.class){
            for (int i = 0; i < 10; i++) {
                try {
                    //请您等一等
                    /*
                    一旦锁对象调用wait方法
                    那么当前运行的线程就会失去执行权
                    并且失去抢夺执行权的权力
                    当锁对象的notifyall方法被调用了
                    这个线程才可以重新开始抢夺执行权，抢到后执行
                     */
                    Ticket.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
                    System.out.println("转了一圈---"+i);
            }

        }

    }
    public void continued() {
        synchronized (Ticket.class) {
            Ticket.class.notifyAll();
        }
    }

}
