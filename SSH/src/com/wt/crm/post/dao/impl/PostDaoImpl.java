package com.wt.crm.post.dao.impl;

import com.wt.crm.department.domain.CrmDepartment;
import com.wt.crm.post.dao.PostDao;
import com.wt.crm.post.domain.CrmPost;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by zyf on 2018/1/26.
 */
public class PostDaoImpl extends HibernateDaoSupport implements PostDao {
	@Override
	public List<CrmPost> findByDep(CrmDepartment department) {
		List<CrmPost> crmPosts = (List<CrmPost>) this.getHibernateTemplate().find("from CrmPost where crmDepartment=?", department);

		return crmPosts;
	}
}
