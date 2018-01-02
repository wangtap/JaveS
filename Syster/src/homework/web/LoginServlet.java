package homework.web;

import homework.bean.User;
import homework.dao.Userdao;
import net.sf.json.JSONArray;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;

//注解
@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Userdao userdao = new Userdao();
        Map<String, String[]> map = request.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
            String nickname = userdao.login(user);
        System.out.println(nickname);
        if (nickname!=null){
            getServletContext().setAttribute("nickname",nickname);
            getServletContext().setAttribute("username",user.getUsername());
            getServletContext().setAttribute("password",user.getPassword());
            JSONArray jsonArray = JSONArray.fromObject(user);
            response.getWriter().write(jsonArray.toString());
            response.setStatus(302);
            response.sendRedirect("http://localhost:8080/main.html");
        }else {
            response.setStatus(302);
            response.sendRedirect("http://localhost:8080/login.html");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
