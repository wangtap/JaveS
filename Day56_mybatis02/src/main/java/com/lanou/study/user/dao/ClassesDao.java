package com.lanou.study.user.dao;

import com.lanou.study.user.domain.Classes;
import com.lanou.study.user.domain.ClassesQueryParamber;

import java.util.List;

public interface ClassesDao {
    void insertClasses(Classes classes);

    List<Classes> queryByForEach(ClassesQueryParamber classesQueryParamber);
}
