package com.lanou3g.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class LiSi {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8888);
        Socket socket =serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[ ] buff =new byte[1024];
//        System.out.println(inputStream.read(buff));

        int len =0;
        boolean toEnd =false;
        String c="";
//          StringBuffer connect =new StringBuffer();


//        StringBuffer stringBuffer=new StringBuffer();
        while ((len=inputStream.read(buff))!=-1){
            String content = new String(buff, 0, len);
            c += content;
//           connect=stringBuffer.append(new String(buff,0,len));
            System.out.println(c);
//            System.out.println(len);

        if (c.contains("quit")){
            toEnd=true;
            continue;
             }
        }

//             if (len!=-1){
                 System.out.println(c);
            socket.close();

//             }

    }
}
