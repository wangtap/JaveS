package com.wt.crm.course_type.service.impl;

import com.wt.crm.course_type.dao.impl.CourseTypeDaoImpl;
import com.wt.crm.course_type.domain.CrmCourseType;
import com.wt.crm.course_type.service.CourseTypeService;
import com.wt.crm.page.PageBean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseTypeServiceImpl implements CourseTypeService {
    @Autowired
    private CourseTypeDaoImpl courseTypeDao;
    public CourseTypeDaoImpl getCourseTypeDao() {
        return courseTypeDao;
    }

    public void setCourseTypeDao(CourseTypeDaoImpl courseTypeDao) {
        this.courseTypeDao = courseTypeDao;
    }

    @Override
    public List<CrmCourseType> queryAllCourseType() {
        return courseTypeDao.queryAllCourseType("", new Object[]{});

    }

    @Override
    public CrmCourseType queryAllCourseTypeByCTId(String courseTypeId) {
        List<CrmCourseType> crmCourseTypes = courseTypeDao.queryAllCourseTypeByCTId(courseTypeId);
        return crmCourseTypes.get(0);

    }

    @Override
    public void saveCourseType(CrmCourseType crmCourseType) {
        courseTypeDao.saveCourseType(crmCourseType);
    }

    @Override
    public List<CrmCourseType> conditionQueryCourseType(CrmCourseType crmCourseType) {

        StringBuffer sbCondition = new StringBuffer();
        ArrayList<Object> objects = new ArrayList<>();
        this.isNotBlank(crmCourseType, sbCondition, objects);
        String codition=sbCondition.toString();
        Object[] params=objects.toArray();

        return courseTypeDao.queryAllCourseType(codition,params);
    }

    private void isNotBlank(CrmCourseType crmCourseType, StringBuffer sbCondition, ArrayList<Object> objects) {
        if (StringUtils.isNotBlank(crmCourseType.getCourseName())){
            sbCondition.append(" and courseName like ? ");
            objects.add("%" +crmCourseType.getCourseName() +"%");
        }
        if (StringUtils.isNotBlank(crmCourseType.getRemark())){
            sbCondition.append(" and remark like ? ");
            objects.add("%" +crmCourseType.getRemark() +"%");
        }
        if (StringUtils.isNotBlank(crmCourseType.getTotalStart())){
            sbCondition.append(" and total >= ? ");
            objects.add(Integer.parseInt(crmCourseType.getTotalStart()));
        }
        if (StringUtils.isNotBlank(crmCourseType.getTotalEnd())){
            sbCondition.append(" and total <= ? ");
            objects.add(Integer.parseInt(crmCourseType.getTotalEnd()));
        }
        if (StringUtils.isNotBlank(crmCourseType.getLessonCostStart())){
            sbCondition.append(" and courseCost >= ? ");
            objects.add(Double.parseDouble(crmCourseType.getLessonCostStart()));
        }
        if (StringUtils.isNotBlank(crmCourseType.getLessonCostEnd())){
            sbCondition.append(" and courseCost <= ? ");
            objects.add(Double.parseDouble(crmCourseType.getLessonCostEnd()));
        }
    }


    public PageBean<CrmCourseType> pagingQueryCourseType(CrmCourseType crmCourseType,int pageCode,int pageSize){
        StringBuffer sbCondition = new StringBuffer();
        ArrayList<Object> objects = new ArrayList<>();
        this.isNotBlank(crmCourseType, sbCondition, objects);
        String codition=sbCondition.toString();
        Object[] params=objects.toArray();
        int totalData = courseTypeDao.getTotalData(codition, params);
        PageBean<CrmCourseType> pageBean = new PageBean<>(pageCode, totalData, pageSize);
        List<CrmCourseType> data = courseTypeDao.pagingQueryCourseType(codition, params, (pageCode - 1) * pageBean.getPageSize(), pageSize);
        pageBean.setData(data);
        return pageBean;
    }

    public PageBean<CrmCourseType> pagingQueryCourseType(int pageCode,int pageSize){
       return this.pagingQueryCourseType(new CrmCourseType(),pageCode,pageSize);
    }
}
