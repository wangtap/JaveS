package com.lanou3g.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public abstract class SendMessage implements Runnable {
    public void run (OutputStream os ) throws IOException {
        Scanner input =new Scanner(System.in);
        String  send=input.nextLine();
        os.write(send.getBytes());
    }
}
