package com.lanou3g.study;

import org.junit.Test;

import java.io.*;

public class BufferDemo {

    @Test
    public  void showRead() throws IOException {

        FileReader fr =new FileReader("src/单词考试.txt");
        BufferedReader buff = new BufferedReader(fr);

        String line =null;
        StringBuffer sb =new StringBuffer();

        //readLine方法，一读读一行如果什么都没有读到返回null
        while ((line=buff.readLine())!=null){
            //将读到的内容，添加到sb中
            sb.append(line+"\n");
            }
        System.out.println(sb);

    }
    @Test
    public  void showWrite() throws IOException {
        FileWriter fw =new FileWriter("src/showWrite.txt");

                BufferedWriter bffw =new BufferedWriter(fw);
        for (int i = 0; i < 20; i++) {
            bffw.write(i+"");
            bffw.newLine();//新来一行
        }
        bffw.flush();//将流中的内容刷新到文件
//        bffw.close();


    }

}
