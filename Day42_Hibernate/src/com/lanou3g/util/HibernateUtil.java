package com.lanou3g.util;

import com.lanou3g.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class  HibernateUtil {
    private    static SessionFactory SF;

    static {
        SF=new Configuration().configure().buildSessionFactory();
    }

    public static Session  getSession(){
        return  SF.openSession();
    }

    public interface BaseDao<T> {
        T add(T t);
        T delect(T t);
        T update(T t);
        T get(Class<T> tClass,long id);
    }


    public interface ResultHandle<T> {
        T resultHandle(Session session);
    }

    public static  <T> T  handle(ResultHandle<T> resultHandle){
        Session session = getSession();
        Transaction transaction = session.beginTransaction();

        T t=  resultHandle.resultHandle(session);

        transaction.commit();
        session.close();
        return t;
    }


    public class BaseDaoImpl<T> implements com.lanou3g.BaseDao<T> {


        @Override
        public T add(T t) {
            return HibernateUtil.handle(session ->  {
                session.save(t);
                return t;

            });
        }

        @Override
        public T delect(T t) {
            return HibernateUtil.handle(session -> {
                session.delete(t);
                return t;
            });
        }

        @Override
        public T update(T t) {
            return HibernateUtil.handle(session -> {
                session.update(t);
                return t;
            });
        }

        @Override
        public T get(Class<T> tClass, long id) {
            return HibernateUtil.handle(session -> {
                T t = session.get(tClass, id);
                return t;
            });
        }

    }
}
