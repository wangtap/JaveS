package com.wt.crm.course_type.dao;

import com.wt.crm.course_type.domain.CrmCourseType;

import java.util.List;

public interface CourseTypeDao {
    List<CrmCourseType> queryAllCourseType(String condition,Object[] params);

    int getTotalData(String condition, Object[] params);

    List<CrmCourseType> pagingQueryCourseType(String condition, Object[] params, int startIndex, int pageSize);

    List<CrmCourseType> queryAllCourseTypeByCTId(String  courseTypeId);

    void saveCourseType(CrmCourseType crmCourseType);
}
