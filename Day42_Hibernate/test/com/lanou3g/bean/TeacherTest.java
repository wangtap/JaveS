package com.lanou3g.bean;

import com.lanou3g.util.HibernateUtil;
import com.lanou3g.util.HibernateUtil.ResultHandle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class TeacherTest {
    @Test
    public void save(){
        //创建一个装载配置信息的对象
        Configuration configuration = new Configuration();

        //将hibernate.cfg.xml中的信息装进去
        configuration.configure();

        //根据配置信息创建一个session.Factory
        //sessionFactory负责创建Session
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        //开启一个session
        //在hibernate中，session就相当于
        ////jdbc中的connection
        Session session = sessionFactory.openSession();

        //获取事物对象
        Transaction transaction = session.getTransaction();

        //hibernate默认是不自动提交事物的
        //先开启事物
        transaction.begin();

        //构造一个要保存的teacher对象
        Teacher teacher = new Teacher();
        teacher.setName("菩提老祖");
        teacher.setAge(9999);
        teacher.setSubject("七十二变");
        teacher.setTid(1);

        //session就相当于connection
        //也就是说增删改查方法都是session调用 的
        session.save(teacher);

        //提交事物
        //如果不提交事物，则上述保存操作
        ///并不会更新到数据库
        transaction.commit();
        //session相当于连接，使用后需要关闭
        session.close();
    }
//        Teacher teacher = session.get(Teacher.class, 1L);
//    }
    @Test
    public void get(){
        Teacher handle =HibernateUtil.handle(new ResultHandle<Teacher>() {
            @Override
            public Teacher resultHandle(Session session) {
                return session.get(Teacher.class, 1L);
            }
        });

        HibernateUtil.handle(session -> {
          return   session.get(Teacher.class, 1L);
        });



        System.out.println(handle.toString());


    }





}
