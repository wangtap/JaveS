package com.wt.crm.post.service.impl;

import com.wt.crm.department.domain.CrmDepartment;
import com.wt.crm.post.dao.PostDao;
import com.wt.crm.post.domain.CrmPost;
import com.wt.crm.post.service.PostService;

import java.util.List;

/**
 * Created by zyf on 2018/1/26.
 */
public class PostServiceImpl implements PostService {

	private PostDao postDao;

	@Override
	public List<CrmPost> findByDep(CrmDepartment department) {

		return postDao.findByDep(department);
	}


	public void setPostDao(PostDao postDao) {
		this.postDao = postDao;
	}
}
