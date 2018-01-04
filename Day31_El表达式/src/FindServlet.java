import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FindServlet" ,urlPatterns = "/find")
public class FindServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setAttribute("name","request");//一次请求销毁
            request.getSession().setAttribute("name","session");//一次会话后销毁（生成的cookie（sessionID）关闭浏览器时销毁），保存在服务器中
            request.getServletContext().setAttribute("name","ServletContext");//重启服务器销毁
            request.getRequestDispatcher("/1_hello.jsp").forward(request,response);
    }
}
