package com.lanou.interceptor;

import com.lanou.admin_info.domain.Admin_info;
import com.lanou.admin_role.domain.Admin_role;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {

    }

    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
                           Object arg2, ModelAndView arg3) throws Exception {

    }

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object obj) throws Exception {
        Admin_info admin = (Admin_info) request.getSession().getAttribute("admin");
        System.out.println(admin.toString());
        if(admin == null) {
            response.sendRedirect(
                    request.getContextPath() + "/login/toLogin");
            return false;
        } else {
            return true;
        }
    }

}

