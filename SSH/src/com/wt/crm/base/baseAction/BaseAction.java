package com.wt.crm.base.baseAction;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wt.crm.classes.service.Impl.ClassesServiceImpl;
import com.wt.crm.course_type.domain.CrmCourseType;
import com.wt.crm.course_type.service.impl.CourseTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BaseAction<T> extends ActionSupport {
    private int pageCode=1;
    private int pageSize=5;

    @Qualifier("crmCourseType")
    @Autowired(required = false)
    private CrmCourseType crmCourseType;
    @Autowired
    private CourseTypeServiceImpl courseTypeService;
    @Autowired
    private ClassesServiceImpl classesService;

    public ClassesServiceImpl getClassesService() {
        return classesService;
    }

    public void setClassesService(ClassesServiceImpl classesService) {
        this.classesService = classesService;
    }

    public int getPageCode() {
        return pageCode;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageCode(int pageCode) {
        this.pageCode = pageCode;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public CrmCourseType getCrmCourseType() {
        return crmCourseType;
    }

    public void setCrmCourseType(CrmCourseType crmCourseType) {
        this.crmCourseType = crmCourseType;
    }

    public CourseTypeServiceImpl getCourseTypeService() {
        return courseTypeService;
    }

    public void setCourseTypeService(CourseTypeServiceImpl service) {
        this.courseTypeService = service;
    }

    public void push(Object o){
        ActionContext.getContext().getValueStack().push(o);
    }

    public void put(String key,Object o){
        ActionContext.getContext().put(key, o);
    }

    public void set(String s ,Object o){
        ActionContext.getContext().getValueStack().set(s, o);
    }

    public void putSession(String key,Object value){
        ActionContext.getContext().getSession().put(key, value);
    }

    public void putApplication(String key,Object value){
        ActionContext.getContext().getApplication().put(key, value);
    }
}
