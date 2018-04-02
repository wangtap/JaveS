package com.wt.crm.staff.web.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor extends MethodFilterInterceptor {
	@Override
	protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
		//获得session中的loginStaff属性
		Object loginStaff =
				ActionContext.getContext().getSession().get("loginStaff");
		if(loginStaff == null){
			//未登录，要重定向到登录页面

			//提示请登录
			Object action = actionInvocation.getAction();
			//一般情况下，action指向的对象都是ActionSupport的子类
			//但是因为POJO类也可以作为aciton使用，所以在强转前最好判断一下
			if(action instanceof ActionSupport){
				ActionSupport as = (ActionSupport) action;
				as.addFieldError("","登录后才能访问其它页面");
			}
			return "login";
		}

		//登录了则放行
		return actionInvocation.invoke();
	}
}
