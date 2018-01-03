import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Context2Servlet",urlPatterns = "/context2")
public class Context2Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Object count = getServletContext().getAttribute("count");
        int i = (int) count;
        System.out.println(count+"count2");
//        int i1 = i++;
//        this.getServletContext().removeAttribute("count");
//        this.getServletContext().setAttribute("count",i1);
    }
}