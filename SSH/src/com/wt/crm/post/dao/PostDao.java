package com.wt.crm.post.dao;

import com.wt.crm.department.domain.CrmDepartment;
import com.wt.crm.post.domain.CrmPost;

import java.util.List;

/**
 * Created by zyf on 2018/1/26.
 */
public interface PostDao {

	/**
	 * 查询某一部门的所有职务
	 * @return
	 */
	List<CrmPost> findByDep(CrmDepartment department);
}
