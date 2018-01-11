package homework.orderitem.web;

import homework.orderitem.dao.OrderItemDao;
import homework.orderitem.domain.OrderItem;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CartShowServlet",urlPatterns = "/cartShow")
public class CartShowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int oid = (int) request.getSession().getAttribute("oid");
        List<OrderItem> orderItems = null;
        OrderItemDao orderItemDao=new OrderItemDao();
        orderItems = orderItemDao.queryAllByoid(oid);
        request.getSession().setAttribute("orderItems",orderItems);
        request.getRequestDispatcher("jsps/cart/list.jsp").forward(request,response);
    }
}
