package com.wt.crm.course_type.service;

import com.wt.crm.course_type.domain.CrmCourseType;

import java.util.List;

public interface CourseTypeService {
    List<CrmCourseType> queryAllCourseType();

    CrmCourseType queryAllCourseTypeByCTId(String  courseTypeId);


    void saveCourseType(CrmCourseType crmCourseType);

    List<CrmCourseType> conditionQueryCourseType(CrmCourseType crmCourseType);
}
