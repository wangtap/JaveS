import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//注解
@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
        //name就是这个Servlet 名字，生成时默认使用类名
        //urlPatterns就是访问这个Servlet时使用的路径
        ///
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取用户传递的参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username.equals("zhangSan")&&password.equals("123")){
            //T0D0 跳转主页，表示登入成功
            //设置状态码表示重定向
            response.setStatus(302);
            //add是添加，head是头
            //add和set的区别
            //set是给某一个头，设置头
            //add是给某个头添加内容
            //也就是说多个ADD。那么该头有多个内容
            //这里就是添加响应头
//            response.setHeader("location","http://localhost:8080/index.jsp");
            //从定向的快捷写法，直接一条语句就可以
            response.sendRedirect("http://localhost:8080/index.jsp");

        }else {
            //设置头ContentType的内容为....
            response.setContentType("text/html;charset=utf-8");
            //T0D0 跳转错误页面提示失败
            response.getWriter().write("失败了");
//            response.setStatus(302);
//            response.addHeader("location","http://localhost:8080/error.html");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String referer = request.getHeader("Referer");
        System.out.println(referer);

    }
}
