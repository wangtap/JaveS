package com.lanou3g.study;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        //把t1.txt文件内容复制到target.txt中

        FileInputStream fr = new FileInputStream("src/123.jpg");
        byte[] chs =new byte[1024*1024*10];
//        String q = String.valueOf(chs);

        //读了多少字符
        int len = fr.read(chs);
        FileOutputStream fw= new FileOutputStream("src/333.jpg");
        new FileOutputStream("src/333.jpg").write(chs,0,new FileInputStream("src/123.jpg").read(chs));
        fw.write(chs,0,len);
//            System.out.println(q);
//        System.out.println(len);
        fr.close();
        fw.close();


    }
}
