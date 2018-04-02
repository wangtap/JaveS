package com.wt.crm.course_type.web.action;

import com.wt.crm.base.baseAction.BaseAction;
import com.wt.crm.course_type.domain.CrmCourseType;
import com.wt.crm.page.PageBean;
import org.springframework.stereotype.Controller;

@Controller
public class CourseTypeAction extends BaseAction<CrmCourseType> {
//    private int pageCode=1;
//    private int pageSize=5;
//
//    @Qualifier("crmCourseType")
//    @Autowired(required = false)
//    private CrmCourseType crmCourseType;
//    @Autowired
//    private CourseTypeServiceImpl service;
//
//    public void setPageCode(int pageCode) {
//        this.pageCode = pageCode;
//    }
//
//    public void setPageSize(int pageSize) {
//        this.pageSize = pageSize;
//    }
//
//    public CrmCourseType getCrmCourseType() {
//        return crmCourseType;
//    }
//
//    public void setCrmCourseType(CrmCourseType crmCourseType) {
//        this.crmCourseType = crmCourseType;
//    }
//
//    public CourseTypeServiceImpl getService() {
//        return service;
//    }
//
//    public void setService(CourseTypeServiceImpl service) {
//        this.service = service;
//    }

    public String queryAllCourseType(){
        PageBean<CrmCourseType> pageBean = getCourseTypeService().pagingQueryCourseType(getPageCode(), getPageSize());
        this.put("pageBean",pageBean);
        return "queryAllCourseType";
    }

    public String saveCourseType(){
        getCourseTypeService().saveCourseType(getCrmCourseType());
        return "saveCourseType";
    }

    public String showCourseType(){
        return SUCCESS;
    }

    public String editCourseType(){
        CrmCourseType crmCourseType = getCourseTypeService().queryAllCourseTypeByCTId(getCrmCourseType().getCourseTypeId());
        this.push(crmCourseType);
        return "editCourseType";
    }

    public String  conditionQueryCourseType(){
        PageBean<CrmCourseType> pageBean = getCourseTypeService().pagingQueryCourseType(getCrmCourseType(), getPageCode(), getPageSize());
        this.put("pageBean",pageBean);
        return "conditionQueryCourseType";
    }
}
