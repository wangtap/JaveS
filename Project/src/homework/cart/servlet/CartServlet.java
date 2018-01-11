package homework.cart.servlet;

import homework.cart.domain.CartItem;
import homework.book.dao.BookDao;
import homework.book.domain.Book;
import homework.orderitem.dao.OrderItemDao;
import homework.orderitem.domain.OrderItem;
import homework.orders.dao.OrderDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CartServlet",urlPatterns = "/cart")
public class CartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int bid = Integer.valueOf(request.getParameter("bid")).intValue();
        int count=Integer.valueOf(request.getParameter("count")).intValue();
        BookDao bookDao =new BookDao();
        OrderItemDao orderItemDao=new OrderItemDao();
        Book book = bookDao.queryByBid(bid);
//        CartItem cartItem=new CartItem(count,book);
        int subtatal= (int) (book.getPrice()*count);
        int iid = (int) ((Math.random() * 9 + 1) * 100000);
        int oid = (int) request.getSession().getAttribute("oid");
        try {
            orderItemDao.insert(iid,count,subtatal,oid,bid);
            List<OrderItem> orderItems = orderItemDao.queryAllByoid(oid);
//             List< CartItem> cart = (List<CartItem>) request.getSession().getAttribute("Cart");
//             cart.add(cartItem);
//             request.getSession().setAttribute("Cart",cart);
              request.getSession().setAttribute("orderItems",orderItems);
              request.getRequestDispatcher("jsps/cart/list.jsp").forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //        List< CartItem> cart = (List<CartItem>) request.getSession().getAttribute("Cart");
        int iid = Integer.valueOf(request.getParameter("iid")).intValue();
        int oid = (int) request.getSession().getAttribute("oid");
        List<OrderItem> orderItems = null;
        OrderItemDao orderItemDao=new OrderItemDao();
        if(iid<0){
           orderItemDao.deleteByoid(oid);
        }else {
            orderItemDao.deleteByiid(iid);
        }
            orderItems = orderItemDao.queryAllByoid(oid);
        request.getSession().setAttribute("orderItems",orderItems);
        request.getRequestDispatcher("jsps/cart/list.jsp").forward(request,response);

}
}
