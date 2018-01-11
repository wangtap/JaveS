package homework.book.web;

import homework.book.dao.BookDao;
import homework.book.domain.Book;
import homework.category.dao.CategoryDao;
import org.apache.commons.dbutils.QueryRunner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "DescBookServlet",urlPatterns = "/descBook")
public class DescBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BookDao bookDao=new BookDao();
        String queryString = request.getQueryString();
        int bid = Integer.valueOf(queryString).intValue();
            Book book = bookDao.queryByBid(bid);
            request.setAttribute("book",book);
            request.getRequestDispatcher("/jsps/book/desc.jsp").forward(request,response);
//            response.sendRedirect("/jsps/book/desc.jsp");

    }
}
