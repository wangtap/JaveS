package homework.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet",urlPatterns = "/main")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object nickname = getServletContext().getAttribute("nickname");
        Object username = getServletContext().getAttribute("username");
        Object password = getServletContext().getAttribute("password");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("昵称"+(String) nickname);
        response.getWriter().write("用户名"+(String) username);
        response.getWriter().write("密码"+(String) password);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
