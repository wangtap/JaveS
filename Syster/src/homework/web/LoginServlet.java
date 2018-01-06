package homework.web;

import homework.domain.Book;
import homework.domain.User;
import homework.dao.BookDao;
import homework.service.UserService;
import homework.service.exeception.LoginExection;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    private UserService us=new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> map = request.getParameterMap();
        User formU = new User();
             BookDao bookDao = new BookDao();
        User user = null;
        try {
            BeanUtils.populate(formU,map);
             List<Book> bookList = bookDao.queryAllBook();
             request.setAttribute("bookList",bookList);
            user = us.login(formU);
            Cookie cookie=new Cookie("username",user.getUsername());
            request.getSession().setAttribute("user",user);
           response.addCookie(cookie);
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        } catch (LoginExection loginExection) {
            request.setAttribute("errorMsg",loginExection.getMessage());
             response.sendRedirect("/login.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
