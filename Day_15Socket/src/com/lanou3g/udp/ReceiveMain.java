package com.lanou3g.udp;

import java.io.IOException;
import java.net.*;

public class ReceiveMain {
    public static void main(String[] args) throws IOException {
        //定义一个ds监控8080
        DatagramSocket ds =new DatagramSocket(8080);
        byte[]  buff=new byte[1024];
        //定义数据包
        DatagramPacket dp = new DatagramPacket(buff,0,buff.length);
        while (true) {
            //调用ds的方法receive
            //接收ds的数据存到dp中
            ds.receive(dp);
            String hostName = dp.getAddress().getHostName();
            String date = new String(dp.getData(), 0, dp.getLength());
            System.out.println(date+"----from"+hostName);
        }
    }
}
