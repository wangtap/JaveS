package com.lanou3g.study;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet{
    /*
    Tomcat 就相当 于一个简易版的服务器



    那么我们创建

    来找到我们程序中对应的执行单元呢？

    比如192.168.20.122:8080/day16/ten
    这里这个day16就是要访问部署到Tomcat上的名为day16的应用程序
     ten表示，要访问day16这个应用程序的哪个文件.
     这里这个文件，实际上就是我们自己写的类
     就是我们自定义的HttpServlet的子类
     也就是说，每次网络请求，实际上在访问Servlet


     B/S 系统 Browser  Server
     C/S系统 Client  Server
     */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
//        /*
        /*
       Request和Response
       Request：请求。包含这次请求的所有数据
       Response 响应，将这次请求还给请求方
         */
        //使用req，获得请求参数
        //方法中传入的参数为：参数名
        ////根据参数名获得参数值（类似键值对）
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("用户名："+username+"\n密码：" + password);
        System.out.println("已经访问到了Servlet");

        //使用resp，将请求的结果返回给请求方
        resp.getWriter().write("<h1>SUCCESS</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        //500或500+表示服务器出错了
        //404表示未找到资源
        //也就是你访问的路径，在服务器中不存在

        //获得请求参数
        String username = req.getParameter("username");
        String gender = req.getParameter("gender");
        System.out.println("username:-----"+username);
        System.out.println("gender:------"+gender);
        //使用jdbc将数据插入到数据库
        //给用户一个结果
        resp.getWriter().write("INSERT SUCCESS");

    }
}
