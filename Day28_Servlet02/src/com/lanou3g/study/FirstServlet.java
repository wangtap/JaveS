package com.lanou3g.study;

import javax.servlet.*;
import java.io.IOException;

public class FirstServlet  implements Servlet{
    /*
    当第一次被访问时
    会执行init的方法
    @param servletConfig

     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("看我们什么时候被执行----我出生了");
    }

    /*
    需要获得servletConfig时，手动调用

     */
    @Override
    public ServletConfig getServletConfig() {
        System.out.println("getServletConfig------");
        return null;
    }

    /*
    每次被访问时，会执行
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("service------");
    }
    /*

    基本没啥用
     */

    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo------");
        return null;
    }

    /*
    当服务器关闭时，会调用这个方法，可以用来释放一些资源
     */
    @Override
    public void destroy() {
        System.out.println("destroy------");
    }
    /*
    刚刚设置的：context path =day28
    就是设置了我们当前应用 的项目名
    也就是说：
    ContextPath就是项目名

    最原始的创建Servlet的方法
    实现 Servlet的接口
     */
}
