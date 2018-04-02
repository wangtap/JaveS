package com.wt.crm.course_type.dao.impl;

import com.wt.crm.course_type.dao.CourseTypeDao;
import com.wt.crm.course_type.domain.CrmCourseType;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class CourseTypeDaoImpl extends HibernateDaoSupport implements CourseTypeDao {
    @Override
    public List<CrmCourseType> queryAllCourseType(String condition,Object[] params) {
        String sql="from  CrmCourseType where 1=1 "+condition;
        return  (List<CrmCourseType>) this.getHibernateTemplate().find(sql, params);
    }

    @Override
    public int getTotalData(String condition,Object[] params) {
        String sql="  select count (c) from  CrmCourseType  c where 1=1 "+condition;

        List<Long> find = (List<Long>) this.getHibernateTemplate().find(sql, params);
        if (find!=null){
            return find.get(0).intValue();
        }
        return 0;
    }
    @Override
    public List<CrmCourseType> pagingQueryCourseType(String condition, Object[] params, int startIndex, int pageSize){
        String sql="from  CrmCourseType where 1=1 "+condition;
        return this.getHibernateTemplate().execute(new PageHibernateCallback<CrmCourseType>(sql, params, startIndex, pageSize));
    }

    @Override
    public List<CrmCourseType> queryAllCourseTypeByCTId(String courseTypeId) {
        return (List<CrmCourseType>)this.getHibernateTemplate().find("from  CrmCourseType cct where  courseTypeId=?",courseTypeId);
    }

    @Override
    public void saveCourseType(CrmCourseType crmCourseType) {
        this.getHibernateTemplate().saveOrUpdate(crmCourseType);
    }
}
