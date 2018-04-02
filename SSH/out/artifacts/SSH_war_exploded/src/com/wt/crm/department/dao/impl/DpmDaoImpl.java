package com.wt.crm.department.dao.impl;

import com.wt.crm.department.dao.DpmDao;
import com.wt.crm.department.domain.CrmDepartment;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class DpmDaoImpl extends HibernateDaoSupport implements DpmDao  {
    @Override
    public List<CrmDepartment> queryallDpm() {
        List<CrmDepartment> objects = (List<CrmDepartment>) getHibernateTemplate().find("from  CrmDepartment cd  ");
        return objects;
    }
}
