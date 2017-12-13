package com.lanou3g.study;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SendMain {
    public static void main(String[] args) throws IOException {
        //创建一个socket对象
        //指定目标的ip地址和端口号
                 Socket socket =new Socket("192.168.11.209",9999);
                 //获得socket对象的输出工具
        //这东西叫流
//        new Socket("",8888).getOutputStream().write('f');
        OutputStream os =socket.getOutputStream();
        /*
        调用这个 工具的写方法
        要把传输的内容作为参数传出去
        参数是字节数组
         */
        os.write(("地方发帖热无法忍受").getBytes());




        //关闭socket
            socket.close();






    }
}
