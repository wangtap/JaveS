package com.wt.crm.base.baseDao.impl;

import com.wt.crm.base.baseDao.BaseDao;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {
    private Class<?> beanClass;

    public BaseDaoImpl() {
     ParameterizedType paramType = (ParameterizedType) this.getClass().getGenericSuperclass();
        beanClass= (Class<?>) paramType.getActualTypeArguments()[0];
    }

    @Override
    public void save(T t) {
        this.getHibernateTemplate().save(t);
    }

    @Override
    public void delete(T t) {
        this.getHibernateTemplate().delete(t);
    }

    @Override
    public void update(T t) {
        this.getHibernateTemplate().update(t);
    }

    @Override
    public void saveOrUpdate(T t) {
        this.getHibernateTemplate().saveOrUpdate(t);
    }

    @Override
    public T findById(Serializable id) {
        return  this.getHibernateTemplate().get((Class<T>) beanClass,id);
    }

    @Override
    public List findAll() {
        return this.getHibernateTemplate().find("from "+beanClass.getName());
    }
}
