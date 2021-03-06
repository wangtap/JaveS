package homework.web;

import homework.domain.User;
import homework.dao.UserDao;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet(name ="RegisterServlet",urlPatterns ="/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userdao = new UserDao();
        Map<String, String[]> map = request.getParameterMap();
            User user = new User();
            try {
                BeanUtils.populate(user,map);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        String insert = userdao.insert(user);
            if (insert=="SUCCESS"){
                response.sendRedirect("http://localhost:8080/login.jsp");
                }else {
                response.sendRedirect("http://localhost:8080/register.html");
            }
        }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
