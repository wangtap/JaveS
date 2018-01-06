package util;

import domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
//@WebServlet(name = "BaseServlet",urlPatterns = "/base")
public class BaseServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //我们自己定义一个叫做method的请求参数
        //根据这个请求参数的值
        //来确定到底要执行什么方法
        //获得请求参数method
        String methodname=req.getParameter("method");
        //要获得当前这个类的类型，应该怎么写？？
        Class<? extends BaseServlet> servlet = this.getClass();

        //servlet的类型是class
        //这是一个类对象
        ///通过类 的getMessage的方法
        //可以获得该类的方法
        Method method=null;
        try {
             method = servlet.getMethod(
                    methodname,
                    HttpServletRequest.class,
                    HttpServletResponse.class
            );
        } catch (NoSuchMethodException e) {
            //运行时异常，就是希望在运行时抛出
            throw  new RuntimeException(methodname+
                    "----------sorry,there is not a method which name is ");
        }
        try {
            String result = (String) method.invoke(this, req, resp);
            String[] split = result.split(":");
            String type=split[0];
            String path=split[1];
            if (type.equals("f")){
                //说明请求转发
                req.getRequestDispatcher(path).forward(req,resp);
            }
            if (type.equals("r")){
                //说明重定向
                resp.sendRedirect(req.getContextPath()+path);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
