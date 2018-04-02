package com.wt.crm.staff.dao.impl;

import com.wt.crm.post.domain.CrmPost;
import com.wt.crm.staff.dao.StaffDao;
import com.wt.crm.staff.domain.CrmStaff;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW )
public class StaffDaoImpl extends HibernateDaoSupport implements StaffDao{


    @Override
    public List<CrmStaff> queryStaffByLoginNameAndLoginPwd(String loginName, String loginPwd) {
        String hql= "from CrmStaff cs where cs.loginName=? and cs.loginPwd=?";
        return  (List<CrmStaff>) this.getHibernateTemplate().find(hql,loginName,loginPwd);

    }

    @Override
    public List<CrmStaff> queryAllStaff() {
        List<CrmStaff> list = (List<CrmStaff>) this.getHibernateTemplate().find("from CrmStaff ");
        return list;
    }

    @Override
    public CrmStaff queryStaffBySId(String sId) {
        return this.getHibernateTemplate().get(CrmStaff.class, sId);
    }

    @Override
    public void editStaff(CrmStaff formCS) {

        this.getHibernateTemplate().saveOrUpdate(formCS);
    }



}
