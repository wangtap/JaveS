package com.wt.crm.classes.service.Impl;

import com.wt.crm.classes.dao.impl.ClassesDaoImpl;
import com.wt.crm.classes.domain.CrmClasses;
import com.wt.crm.classes.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassesServiceImpl implements ClassesService {
    @Autowired
    private ClassesDaoImpl classesDao;

    public void setClassesDao(ClassesDaoImpl classesDao) {
        this.classesDao = classesDao;
    }

    @Override
    public List<CrmClasses> findAll() {
        return classesDao.findAll();
    }
}
