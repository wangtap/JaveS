package com.lanou3g.bean;

import com.sun.corba.se.impl.interceptors.SlotTableStack;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.Scanner;

public class StudentTest {

    //快速删除类中无用的import语句
    //alt+ctrl+o
    @Test
    public  void hello(){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    }
    @Test
    public  void save() {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();

        Student student = new Student(2L,"猴子",100,"男");
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }
    @Test
    public void get(){
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();


        session.beginTransaction();
        Student student = session.get(Student.class, 1L);
        Student s = session.get(Student.class, 1L);
        //托管
        //将s指向对象，从持久化转为游离态
        //此时hibernate也就不再维护该对象的状态
        //什么叫维护
        //只要一个对象处于持久化状态
        //hibernate就会保证他的属性与数据库一致
        session.evict(s);
        s.setName("王五");

        System.out.println(student);
        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void get1(){
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        session.beginTransaction();

        Student student = session.get(Student.class, 1L);
        System.out.println(student);
        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void update(){
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        session.beginTransaction();
        Student student = session.get(Student.class, 1L);
        student.setName("紫霞");

        session.getTransaction().commit();
        session.close();



    }


    @Test
    public void delect(){
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        session.beginTransaction();
        Student student = session.get(Student.class, 1L);
        session.delete(student);

        session.getTransaction();
        session.close();
    }
    @Test
    public void flush(){
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Student student1 = session.get(Student.class, 1L);
        Student student2 = session.get(Student.class, 2L);
        student2.setName("姐姐妹妹们");
        Student student = new Student(5L, "小明", 10L, "男");
        session.save(student);
        session.flush();
        session.getTransaction();
        session.close();

    }



}