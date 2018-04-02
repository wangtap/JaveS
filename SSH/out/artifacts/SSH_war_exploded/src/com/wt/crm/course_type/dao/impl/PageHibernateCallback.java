package com.wt.crm.course_type.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;

import java.util.List;

public class PageHibernateCallback<T> implements HibernateCallback<List<T>>{
    private  String sql;
    private Object[] params;
    private int startIndex;
    private int pageSize;

    public PageHibernateCallback() {
    }

    public PageHibernateCallback(String sql, Object[] params, int startIndex, int pageSize) {
        this.sql = sql;
        this.params = params;
        this.startIndex = startIndex;
        this.pageSize = pageSize;
    }

    @Override
    public List<T> doInHibernate(Session session) throws HibernateException {
        Query query = session.createQuery(sql);
        for (int i = 0; i < params.length; i++) {
            query.setParameter(i,params[i]);
        }
        query.setFirstResult(startIndex);
        query.setMaxResults(pageSize);
        return query.list();
    }
}
