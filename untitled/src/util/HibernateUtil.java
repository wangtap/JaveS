package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private    static SessionFactory SF;

    static {
        SF=new Configuration().configure().buildSessionFactory();
    }

    public static Session  getSession(){
        return  SF.openSession();
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


    }
