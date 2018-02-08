package com.wt.crm.post.service;

import com.wt.crm.department.domain.CrmDepartment;
import com.wt.crm.post.domain.CrmPost;

import java.util.List;

/**
 * Created by zyf on 2018/1/26.
 */
public interface PostService {
	List<CrmPost> findByDep(CrmDepartment department);
}
