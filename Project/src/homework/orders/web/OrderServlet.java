package homework.orders.web;

import homework.orders.dao.OrderDao;
import homework.orders.domain.Orders;
import homework.user.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@WebServlet(name = "OrderServlet",urlPatterns = "/order")
public class OrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OrderDao orderDao=new OrderDao();
        User user = (User) request.getSession().getAttribute("user");
        int uid = user.getUid();
        List<Orders> ordersList = orderDao.queryOrderByUid(uid);
        request.setAttribute("ordersList",ordersList);
        request.getRequestDispatcher("jsps/order/list.jsp").forward(request,response);

    }
}
