package homework.user.web;

import homework.cart.domain.CartItem;
import homework.category.domain.Category;
import homework.orderitem.dao.OrderItemDao;
import homework.orders.dao.OrderDao;
import homework.user.domain.User;
import homework.user.service.Check;
import homework.user.service.exeception.LoginException.InvalidEmailException;
import homework.user.service.exeception.LoginException.PasswordException;
import homework.user.service.exeception.LoginException.StateException;
import homework.user.service.exeception.RegisterExcepion.RegisterFormatException.RegisterFormatException;
import homework.user.service.exeception.RegisterExcepion.UserException.EmailException;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebServlet(name = "UserLoginServlet",urlPatterns = "/userLogin")
public class UserLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        User formU = new User();
        Check check=new Check();
        OrderDao orderDao=new OrderDao();
        PrintWriter out = response.getWriter();
        Map<String, String[]> map = request.getParameterMap();
        try {
            BeanUtils.populate(formU,map);
            check.checkFormat(formU);
            User user = check.checkLoginByEmailAndPassword(formU.getEmail(), formU.getPassword());
            if (user!=null){
                Cookie cookie=new Cookie("username",formU.getUsername());
                response.addCookie(cookie);
                request.getSession().setAttribute("user",user);
//                List< CartItem> Cart=new ArrayList< CartItem>();
//                request.getSession().setAttribute("Cart",Cart);
                int oid = (int) ((Math.random() * 9 + 1) * 100000);
                request.getSession().setAttribute("oid",oid);
                orderDao.insertOrderByOidAndUid(oid,user.getUid());
            }
            out.print("SUCCESS");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (StateException e) {
            out.print(e.getMessage());
        } catch (EmailException e) {
            out.print(e.getMessage());
        } catch (PasswordException e) {
            out.print(e.getMessage());
        } catch (RegisterFormatException e) {
            out.print(e.getMessage());
        } catch (InvalidEmailException e) {
            out.print(e.getMessage());
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
