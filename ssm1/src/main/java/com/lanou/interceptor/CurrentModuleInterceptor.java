package com.lanou.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CurrentModuleInterceptor implements HandlerInterceptor {
    @Override
    public void afterCompletion(HttpServletRequest arg0,
                                HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
    }
    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
                           Object arg2, ModelAndView arg3) throws Exception {
    }
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object obj) throws Exception {
// 判断当前用户访问的模块
        String url = request.getRequestURL().toString();
        int currentModule = 0; // 默认0是NETCTOSS首页
        if (url.contains("role")) {
            currentModule = 1;
        } else if (url.contains("admin")) {
            currentModule = 2;
        } else if (url.contains("cost")) {
            currentModule = 3;
        } else if (url.contains("account")) {
            currentModule = 4;
        } else if (url.contains("service")) {
            currentModule = 5;
        }
        request.getSession().setAttribute(
                "currentModule", currentModule);
        return true;
    }
}
