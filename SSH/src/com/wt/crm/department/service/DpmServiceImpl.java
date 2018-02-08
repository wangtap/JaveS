package com.wt.crm.department.service;

import com.wt.crm.department.dao.impl.DpmDaoImpl;
import com.wt.crm.department.domain.CrmDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DpmServiceImpl implements DpmService {
    @Autowired
    private DpmDaoImpl dpmDao;

    public DpmDaoImpl getDpmDao() {
        return dpmDao;
    }

    public void setDpmDao(DpmDaoImpl dpmDao) {
        this.dpmDao = dpmDao;
    }

    @Override
    public List<CrmDepartment> queryAllDpm() {
        List<CrmDepartment> crmDepartments = dpmDao.queryallDpm();
        return crmDepartments;
    }
}
