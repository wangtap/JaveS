package homework.book.web;

import homework.book.dao.BookDao;
import homework.book.domain.Book;
import homework.book.service.BookListService;
import homework.page.domain.Page;

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
        response.setContentType("text/xml; charset=UTF-8");
        Page page = new Page();
        BookListService bookListService = new BookListService();
        String parameter = request.getParameter("pc");
        String c = request.getParameter("cid");
        if (parameter==null||parameter.equals("")){
            parameter="1";
        }
        int cid = Integer.parseInt(c);
        int pc = Integer.parseInt(parameter);
        int begin=(pc-1)*page.getPageSize();
        int end=0;
//        Integer cid = c != null && !c.equals("") ? Integer.parseInt(c) : null;
        List<Book> allbooks = bookListService.queryBookListByCid(cid);
        if (page.getPageSize()<allbooks.size()){
            end =pc*page.getPageSize();
        }else {
            end=allbooks.size();
        }
        page.setPageCode(pc);
        Object totalData=null;
        if (cid!=-1){
        totalData= bookListService.queryTotalDataByCid(cid);
        }else {
            totalData= bookListService.queryTotalData();
        }

        page.setTotalData((int)(long)totalData);
        List<Book> bookList=allbooks.subList(begin,end);
        page.setBooks(bookList);
        page.setCid(cid);
        request.setAttribute("page",page);
        request.getRequestDispatcher("/jsps/book/list.jsp").forward(request,response);
    }
 }
