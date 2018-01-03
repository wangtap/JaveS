import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ForwardServlet",urlPatterns = "/forward")
public class ForwardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //先输出
        System.out.println("我是forward");

       ///设置一个域属性
        request.setAttribute("name","张三");


//        执行请求转发到TargetServlet

        //获得请求分发者，并制定目标路径
        RequestDispatcher dispatcher = request.getRequestDispatcher("/target");

        //forward方法，就表示请求转发
        //include方法，表示请求包含
        dispatcher.include(request,response);
//        dispatcher.forward(request,response);
        System.out.println("已经转发完毕");
        response.getWriter().write("This is forward");
    }
}