package com.lanou3g.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ZhangSan2 {
    public static void main(String[] args) throws IOException {
        //发送方
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        //获得与这个 ServerSocket连接的Socket的输出流
        OutputStream os  = s.getOutputStream();
//        byte[] buff= new byte[1024*1024*10];
//        String send ="";
//        Scanner input =new Scanner(System.in);
//        while (!(send=input.nextLine()).contains("quit")){
//            //如果输入的内容不是quit抽象继续
//            os.write(send.getBytes());
            new Thread(new ReceiveMessage() {
                @Override
                public void run() {

                                    }
            }).start();
            new Thread(new SendMessage() {
                @Override
                public void run() {

                }
            }).start();

        ss.close();


//            new ReceiveMessage(is) {
//                @Override
//                public void run() {
//
//                }
//            } ;


//            int l  = is.read(buff);
//            System.out.println(new String(buff,0,l));
        }
        //如果输入了quit，则循环会终止，关闭这个socket

    }

