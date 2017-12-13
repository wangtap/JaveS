package com.lanou3g.tcp;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by zyf on 2017/12/12.
 */


public class Xiaoming {

    public static void main(String[] args) throws IOException {
        byte[] buff = new byte[1024*1024*10];
        int len = 0;
        StringBuffer sb = new StringBuffer();
        Scanner input =new Scanner(System.in);
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        //获得与这个 ServerSocket连接的Socket的输出流
        OutputStream os  = s.getOutputStream();
        while ((len = is.read(buff)) != -1){
            sb.append(new String(buff,0,len));
            System.out.println(sb);
            //把sb清空

            String result =input.nextLine();
            os.write(result.getBytes());
       }
        ss.close();
    }

}