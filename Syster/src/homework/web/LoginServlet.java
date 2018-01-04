package homework.web;

import homework.bean.Book;
import homework.bean.User;
import homework.dao.BookDao;
import homework.dao.Userdao;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
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
        if (nickname!=null){
            BookDao bookDao = new BookDao();
            List<Book> bookList = bookDao.queryAllBook();
        request.getSession().setAttribute("username1",user);
            request.setAttribute("bookList",bookList);

            request.getSession().setAttribute("username",user.getUsername());
            request.getRequestDispatcher("/index.jsp")
                    .forward(request,response);
        }else {
            response.sendRedirect("http://localhost:8080/login.jsp");
            }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(1);
    }
}
