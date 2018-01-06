package web;

import util.BaseServlet;

import javax.jws.WebService;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="UserServlet" ,urlPatterns = "/user")
public class UserServlet extends BaseServlet {
    public String login(HttpServletRequest request,HttpServletResponse response){
        System.out.println(1);
        //指定一个路径还得让它的父类BaseServlet能获得
        return "r:/index.jsp";
    }
    public String register(HttpServletRequest request,HttpServletResponse response){
        System.out.println(2);
        //f:表示请求转发
        //r:表示重定向

        return "f:/login.jsp";
    }

}
