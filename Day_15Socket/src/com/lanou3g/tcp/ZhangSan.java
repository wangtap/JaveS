package com.lanou3g.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ZhangSan {
    public static void main(String[] args) throws IOException {
        //发送方
        Socket socket= new Socket("192.168.11.209",8888);

        OutputStream os= socket.getOutputStream();
        InputStream is =socket.getInputStream();
//        byte[] buff= new byte[1024*1024*10];
//        String send ="";
//        Scanner input =new Scanner(System.in);
//        while (!(send=input.nextLine()).contains("quit")){
//            //如果输入的内容不是quit抽象继续
//            os.write(send.getBytes());
            new Thread(new ReceiveMessage() {

                public void run() {
                    System.out.println("1RM");

                                    }
            }).start();
            new Thread(new SendMessage() {

                public void run() {
                    System.out.println("1SM");

                }
            }).start();



//            new ReceiveMessage(is) {
//                @Override
//                public void run() {
//
//                }
//            } ;


//            int l  = is.read(buff);
//            System.out.println(new String(buff,0,l));
        socket.close();
        }
        //如果输入了quit，则循环会终止，关闭这个socket

    }

