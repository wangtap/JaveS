package com.wt.crm.classes.web.action;

import com.wt.crm.base.baseAction.BaseAction;
import com.wt.crm.classes.domain.CrmClasses;

import java.util.List;

public class ClassesAction extends BaseAction<CrmClasses> {
    public String findAll(){
        List<CrmClasses> allClasses = getClassesService().findAll();
        System.out.println(allClasses.get(0).getCrmCourseType().toString());
//        System.out.println(allClasses.toString());
        this.set("allClasses",allClasses);
        return "findAll";
    }
}
