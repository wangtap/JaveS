package com.lanou3g.udp;

import com.lanou3g.util.Constants;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class SendMain {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds =new DatagramSocket(0000);
        //创建一个 地址对象，将ip地址传到构造方法中
        InetAddress address= InetAddress.getByName(Constants.ADDRESS);
        byte [] buff=new  byte[1024];
        buff="我是测试的内容1".getBytes();
        //创建数据包
        DatagramPacket dp=new DatagramPacket(buff,buff.length,InetAddress.getByName(Constants.ADDRESS),8080);

        ds.send(dp);
//        new DatagramSocket(0000).send(new DatagramPacket(buff,buff.length,InetAddress.getByName(Constants.ADDRESS),8080));


    }
}
