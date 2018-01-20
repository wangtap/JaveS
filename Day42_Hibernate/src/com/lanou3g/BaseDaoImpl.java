package com.lanou3g;

import com.lanou3g.util.HibernateUtil;
import org.hibernate.Session;

import java.io.Serializable;

public class BaseDaoImpl<T> implements BaseDao<T> {


    @Override
    public T add(T t) {
        return HibernateUtil.handle(new HibernateUtil.ResultHandle<T>() {
            @Override
            public T resultHandle(Session session) {
                session.save(t);
                return t;
            }
        } );
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
