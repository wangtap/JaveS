package com.lanou3g.SerializableDemo;

import org.junit.Test;

import java.io.*;

public class SerializableDemo {

@Test
    public  void  output() throws IOException {
        Pet pet =new Pet("雪纳瑞","male");
        FileOutputStream fos =new FileOutputStream("src/pet.out");

        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fos);
        objectOutputStream.writeObject(pet);
//        objectOutputStream.flush();
        objectOutputStream.close();
    }

    @Test
    public void input() throws IOException, ClassNotFoundException {

        FileInputStream fis =new FileInputStream("src/pet.out");
        ObjectInputStream objectInputStream = new ObjectInputStream(fis);
        Object o = objectInputStream.readObject();
        objectInputStream.close();
        Pet pet =(Pet)o;
        System.out.println(o);

        objectInputStream.close();


    }
}
