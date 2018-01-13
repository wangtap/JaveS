import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ShowServlet",urlPatterns = "/show")
public class ShowServlet extends HttpServlet {

    private List<Book> books;

    @Override
    public void init(ServletConfig config) throws ServletException {
        //limit  ?,?    (?,? ]
        books = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Book book=new Book("白眉大侠"+i,"吴承恩",""+ i,"武侠小说");
            books.add(book);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ///获得前端给我的页码参数
        //pc=pageCode
        //(pc-1)*pageSize
        //(pc-1)*pageSize
        int p = Integer.parseInt(request.getParameter("pc"));
        PageBean pageBean=new PageBean();
        pageBean.setTotalData(20);
        pageBean.setPageCode(p);
        int begin=(p -1)*pageBean.getPageSize();
        int end= p *pageBean.getPageSize();
        List<Book> bookList = this.books.subList(begin,end);
        pageBean.setBooks(bookList);
        request.setAttribute("pageBean", pageBean);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
