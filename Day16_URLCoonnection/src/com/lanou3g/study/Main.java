package com.lanou3g.study;

import net.sf.json.JSONObject;

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
        //我们要把json这个字符串转换成我们java的实体类的对象
        //现在我们可以通过GsonFormat插件帮助我们生成实体类
        //还需要一个工具，帮助我们直接把字符串转换成对应实体类的对象
        JSONObject jsonObject=JSONObject.fromObject(result);
        Book book =(Book)JSONObject.toBean(jsonObject,Book.class);
        System.out.println("id为："+book.getId());



    }
}
