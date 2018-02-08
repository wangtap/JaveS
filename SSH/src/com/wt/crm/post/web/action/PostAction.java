package com.wt.crm.post.web.action;

import com.wt.crm.post.domain.CrmPost;
import com.wt.crm.post.service.PostService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import org.apache.struts2.ServletActionContext;

import java.io.IOException;
import java.util.List;

/**
 * Created by zyf on 2018/1/26.
 */
public class PostAction extends ActionSupport implements ModelDriven<CrmPost>{

	//用来接收提交上来的数据
	private CrmPost post = new CrmPost();

	private PostService postService;

	public String findAllByDep() throws IOException {
		System.out.println(post.toString());
		List<CrmPost> byDep = postService.findByDep(post.getCrmDepartment());


		JsonConfig jsonConfig = new JsonConfig();
		//排除"crmDepartment","staffSet"
		jsonConfig.setExcludes(new String[]{"crmDepartment","staffSet"});

		JSONArray jsonArray = JSONArray.fromObject(byDep, jsonConfig);
		String string = jsonArray.toString();
		System.out.println(byDep.get(0).getPostName());
		System.out.println(string);
		//设置响应json的编码
		ServletActionContext.getResponse().setContentType("application/json;charset=utf-8");

		ServletActionContext.getResponse().getWriter().write(string);
		//不好意思不需要result标签
		//我自己response了已经
		return NONE;
	}


	@Override
	public CrmPost getModel() {
		return post;
	}


	//不给set方法的话spring是无法帮助我们注入的
	public void setPostService(PostService postService) {
		this.postService = postService;
	}
}
