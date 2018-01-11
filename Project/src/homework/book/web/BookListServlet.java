package homework.book.web;

import homework.book.dao.BookDao;
import homework.book.domain.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BookListServlet",urlPatterns = "/bookList")
public class BookListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BookDao bookDao=new BookDao();
        String c = request.getParameter("cid");
        Integer cid = c != null && !c.equals("") ? Integer.parseInt(c) : null;
        List<Book> bookList= null;
        if (cid<0){
            bookList = bookDao.queryAll();
           }else {
             bookList = bookDao.queryBookByCid(cid);
        }
            request.setAttribute("bookList",bookList);
            request.getRequestDispatcher("/jsps/book/list.jsp").forward(request,response);

    }
}
