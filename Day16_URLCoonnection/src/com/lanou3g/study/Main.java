package com.lanou3g.study;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        统一资源定位符 ，就是一个网址（绝对路径）
         */
        URL url =new URL("https://api.douban.com/v2/book/1220562");
        URLConnection conn =url.openConnection();

        //获得网络连接的流，从流中获得数据
        InputStream is =conn.getInputStream();
        byte []buff=new byte[1024*1024*10];
        int len = is.read(buff);
        String result =new String(buff,0,len);
        System.out.println(result);


    }
}
