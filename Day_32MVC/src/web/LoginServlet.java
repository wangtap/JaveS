package web;

import domain.User;
import service.UserService;
import service.exceptiom.LoginExection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    private UserService loginservice=new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //formU表示从表单提交上来的
        //formDb表示从数据库提交上来的
        User formU=new User(username,password);
        try {
            User user = loginservice.login(formU);
            request.getSession().setAttribute("user",user);
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        } catch (LoginExection e){
            request.setAttribute("errorMsg",e.getMessage());
        }
            request.getRequestDispatcher("/login.jsp").forward(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
