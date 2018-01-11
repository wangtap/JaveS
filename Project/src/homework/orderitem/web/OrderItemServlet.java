package homework.orderitem.web;

import homework.orderitem.dao.OrderItemDao;
import homework.orderitem.domain.OrderItem;
import homework.orders.dao.OrderDao;
import homework.orders.domain.Orders;
import homework.user.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@WebServlet(name = "OrderItemServlet",urlPatterns = "/orderItem")
public class OrderItemServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OrderDao orderDao=new OrderDao();
        int  oid = (int) request.getSession().getAttribute("oid");
        Date currDate = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sdf.format(currDate);
        orderDao.updateOrderByOidAndTime(oid,dateTime);
        Orders orders = orderDao.queryOrderByOid(oid);
        request.setAttribute("orders",orders);
        List<OrderItem> orderItems = OrderItemDao.queryAllByoid(oid);
        int newoid = (int) ((Math.random() * 9 + 1) * 100000);
        request.getSession().setAttribute("oid",newoid);
        try {
            User user = (User) request.getSession().getAttribute("user");
            orderDao.insertOrderByOidAndUid(newoid,user.getUid());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("orderItems",orderItems);
        request.getRequestDispatcher("jsps/order/desc.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int oid = Integer.valueOf(request.getParameter("oid")).intValue();
        OrderDao orderDao=new OrderDao();
        Orders orders = orderDao.queryOrderByOid(oid);
        request.setAttribute("orders",orders);
        List<OrderItem> orderItems = OrderItemDao.queryAllByoid(oid);
        request.setAttribute("orderItems",orderItems);
        request.getRequestDispatcher("/jsps/order/desc.jsp").forward(request,response);
    }
}
