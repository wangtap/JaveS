package com.lanou3g.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class ReceiveMessage implements Runnable {

    public void run(InputStream is ) throws IOException {
        byte[] buff = new byte[1024*1024*10];
        int l = is.read(buff);
        System.out.println(new String(buff,0,l));


    }
}
