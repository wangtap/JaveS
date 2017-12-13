package com.lanou3g.study;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceiveMain {
    public static void main(String[] args) throws IOException {
        //创建一个接受方ServerSocket对象
        //构造方法中传入的参数为9999（端口号）
        ServerSocket ss= new ServerSocket(9999);
        //从接收方，得到是谁发来的
        //因为接收方和发送方会建立联系
        //这里就是通过接收方获得发送方
//        accept方法是阻塞的，如果获得不到发送方的socket，那么就将程序阻塞
        Socket accept = ss.accept();


        //获得发送方的读取对象
        InputStream is = accept.getInputStream();
//        InputStream IS = new ServerSocket(8888).accept().getInputStream().read(byte[ ],0,10);
        //调用 IS的读取方法
//        将soccket的内容
        byte[] buf =new byte[1024];
//
//          读取到buf这个字节数组中，返回值为读了多少数据
        int len = 0;
        String c="";
        StringBuffer sb =new StringBuffer();
                   while ((len = is.read(buf)) != -1) {
            /*
        根据字节数组，创造一个字符传
        取数组中，从0开始，取多少个，取len个

         */
                String content = new String(buf, 0, len);

                c += content;
                sb.append(content);

//            System.out.println(content);
                System.out.println(sb);
//            System.out.println(c);
//            System.out.println(len);
            }

            ss.close();







    }
}
