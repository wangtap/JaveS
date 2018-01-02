package com.lanou3g.study;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class SecondServlet extends GenericServlet {
    /*
    Servlet在web.xml中的配置内容
    会被抽象成一个ServletConfig的对象
    这个对象会在tomcat帮我们调用
    init（ServletConfig）的时候传入

    GenericServlet帮我们封装好了一步
      this.servletConfig=servletConfig
      init()不是生命周期

     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }
}
