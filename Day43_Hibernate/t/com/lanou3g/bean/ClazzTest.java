package com.lanou3g.bean;


import com.lanou3g.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClazzTest {
    /*
    通过debug
    我们发现，在执行了save方法后
    缓存map中，出现了两条数据

    所以我们可以知道
    save方法可以将数据保存在缓存中的
     */
    @Test
    public void ClazzTest(){
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        Clazz clazz = new Clazz();
        clazz.setCid(1);
        clazz.setCname("一年级1班");
        Clazz clazz1 = new Clazz();
        clazz.setCid(2);
        clazz.setCname("一年级2班");
        session.beginTransaction();

        session.save(clazz);

        session.getTransaction().commit();

        session.beginTransaction();
        session.get(Clazz.class,3);
        clazz.setCname("一年级四班");
        session.getTransaction().commit();

        session.close();
    }

    @Test
    public void get(){
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        session.beginTransaction();
        Clazz clazz = session.get(Clazz.class, 3);
//        session.close();
//        Session session1 = new Configuration().configure().buildSessionFactory().openSession();
//        Clazz clazz1 = session1.get(Clazz.class, 3);
        System.out.println(clazz);
        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void evice(){
        HibernateUtil.handle(session -> {
            //这里这个get方法将找到的班级对象，存入缓存中
            Clazz clazz = session.get(Clazz.class, 3);

            ///evict方法，会将这个班级对象从缓存中移除
            session.evict(clazz);

            //缓存中没有这个对象了
            //再次get，会去数据库中查找
            Clazz clazz1 = session.get(Clazz.class, 3);

            return clazz;
        });
    }
    @Test
    public void oneToMany1(){
        HibernateUtil.handle(session -> {
            Student student=new Student();
            student.setSname("张三");
            Student student1=new Student();
            student1.setSname("李四");
            Student student2=new Student();
            student2.setSname("王五");
            session.save(student);
            session.save(student1);
            session.save(student2);

            Clazz clazz=new Clazz();
            clazz.getStudents().add(student);
            clazz.getStudents().add(student1);
            clazz.getStudents().add(student2);
            clazz.setCname("四年级四班 ");
//            clazz.setCid(4);
            session.save(clazz);

            return clazz;
        });
    }

    @Test
    public  void oneToMany2(){
        HibernateUtil.handle(session -> {
            Student zhaoliu = new Student();
            Student xiaoming = new Student();
            zhaoliu.setSname("赵六");
            xiaoming.setSname("小明");

            Clazz clazz = new Clazz();
            clazz.setCname("Java班级");
            clazz.getStudents().add(zhaoliu);
            clazz.getStudents().add(xiaoming);

            //因为设置了级联属性为save-update
            //所以保存班级时，也会保存学生
            session.save(clazz);
            return clazz;
        });
    }

    @Test
    public void oneToMany3(){
        HibernateUtil.handle(session -> {
            Clazz clazz=session.get(Clazz.class,2);
            clazz.getStudents().add(new Student("小红"));
            clazz.getStudents().add(new Student("小明"));

            return clazz;
        });
    }
        @Test
    public void oneToMany4(){
        HibernateUtil.handle(session -> {
            Clazz clazz = session.get(Clazz.class, 2);
            //给两个学生一个班级对象

            Student s1 = new Student("张三丰");
            s1.setClazz(clazz);
            Student s2 = new Student("李隆基");
            s2.setClazz(clazz);

            session.save(clazz);
            session.save(s1);
            session.save(s2);
            return s1;
                }
        );
    }

    @Test
    public void validateSecond(){
        HibernateUtil.handle(session -> {
            Clazz clazz = session.get(Clazz.class, 3);
            //这里，发现一级缓存中有该数据
            //则直接从一级缓存中获取，不在查找数据库
            clazz=session.get(Clazz.class,3);
            return null;
        });


        HibernateUtil.handle(session -> {
            /*
            这里，已经不是上一个session了
            是一个新的session
            所以一级缓存中，肯定没有数据
            那么去二级缓存中找，也找到了
            所以不去查找数据库
             */
            Clazz clazz = session.get(Clazz.class, 3);
            return null;
        });
    }


    @Test
    public void query(){
        HibernateUtil.handle(session -> {
            //from后面跟着的是类的全名
            Query query = session.createQuery(
                    "from "
                            + Clazz.class.getName());
            List<Clazz> list=query.list();
            for (Clazz clazz : list) {
                System.out.println(clazz);
            }
            //输出，二级缓存中数据总数
            //这个得在1配置文件中，配置开启二级缓存统计
            System.out.println(
                    session.getSessionFactory().getStatistics().getEntityLoadCount()
            );
            return null;
        });
    }

    @Test
    public void queryCache(){
        HibernateUtil.handle(session -> {
            Query query = session.createQuery("from " + Clazz.class.getName());
            //手动开启查询缓存
            List list = query.setCacheable(true).list();
            System.out.println(Arrays.toString(list.toArray()));
          return null;
        });
    }
}
