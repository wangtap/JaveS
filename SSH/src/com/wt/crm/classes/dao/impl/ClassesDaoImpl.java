package com.wt.crm.classes.dao.impl;

import com.wt.crm.base.baseDao.BaseDao;
import com.wt.crm.base.baseDao.impl.BaseDaoImpl;
import com.wt.crm.classes.dao.ClassesDao;
import com.wt.crm.classes.domain.CrmClasses;

import java.io.Serializable;
import java.util.List;

public class ClassesDaoImpl extends BaseDaoImpl<CrmClasses> implements ClassesDao {
    @Override
    public void save(CrmClasses crmClasses) {

    }

    @Override
    public void delete(CrmClasses crmClasses) {

    }

    @Override
    public void update(CrmClasses crmClasses) {

    }

    @Override
    public void saveOrUpdate(CrmClasses crmClasses) {

    }

    @Override
    public CrmClasses findById(Serializable id) {
        return null;
    }

    @Override
    public List<CrmClasses> findAll() {
       return (List<CrmClasses>) this.getHibernateTemplate().find("from CrmClasses ");
    }
}
