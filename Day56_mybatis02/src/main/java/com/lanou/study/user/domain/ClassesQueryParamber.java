package com.lanou.study.user.domain;

import java.util.List;

public class ClassesQueryParamber {
    private List<Classes> classesList;
    private List<Integer> classesIds;

    public List<Integer> getClassesIds() {
        return classesIds;
    }

    public void setClassesIds(List<Integer> classesIds) {
        this.classesIds = classesIds;
    }

    public List<Classes> getClassesList() {
        return classesList;
    }

    public void setClassesList(List<Classes> classesList) {
        this.classesList = classesList;
    }
}
