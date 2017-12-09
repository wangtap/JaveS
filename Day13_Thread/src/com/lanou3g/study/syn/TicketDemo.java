package com.lanou3g.study.syn;

public class TicketDemo {
    private int ticker= 100000;
    /*
    锁是一个对象，任意类型的对象

    synchronized关键字，就可以给方法山一个锁，给方法上锁的时候
    使用对象时当前类对象
    就是TicketDemo.class对象
    当一个线程进入sellTicket方法时该线程就会持有这个锁对象
    其他线程想进入sellTicket方法时找不到锁对象所有进不去
    这时候，只能等待前一个线程执行完毕后从方法出来，
    释放锁对象下一个线程才能进去
    这个现象就是同步
     */
    public void sellTicket(){
        System.out.println(Thread.cuttentThread().getName.
                ticker);
        TicketDemo td = new TicketDemo();
        new Thread(new Runnable() {
            @Override
            public void run() {
                td.sellTicket();
            }
        }



    }
}