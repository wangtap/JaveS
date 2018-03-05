package com.lanou.interceptor;


import com.lanou.module_info.domain.Module_info;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class CheckModuleInterceptor implements HandlerInterceptor {
    @Override
    public void afterCompletion(HttpServletRequest arg0,
                                HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
    }
    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
                           Object arg2, ModelAndView arg3) throws Exception {
    }
    @SuppressWarnings("unchecked")
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object obj) throws Exception {
//获取登录用户有权限的所有模块
        List<Module_info> modules = (List<Module_info>)
                request.getSession().getAttribute("allModules");
//获取用户当前要访问的模块
        int currentModule = (Integer)
                request.getSession().getAttribute("currentModule");
//判断用户有权限的模块是否包含当前模块
        for (Module_info module : modules) {
            if (module.getModuleId() == currentModule) {
//有当前访问模块的权限
                return true;
            }}
//没有当前访问模块的权限
        response.sendRedirect(
                request.getContextPath() + "/login/nopower");
        return false;
    }
}

