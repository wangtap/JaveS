package homework.user.web;

import com.sun.deploy.net.HttpRequest;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebFilter(filterName = "UserFilter",urlPatterns ={ "*"})
public class UserFilter implements Filter {
    private List<String> list = new ArrayList<String>();
    public void destroy() {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request= (HttpServletRequest) req;
        String path = request.getServletPath();
        if(list!=null && list.contains(path)){
            //如果页面中获取的访问连接于定义的可放行的连接一致，则放行
            chain.doFilter(req, resp);
            return;
        }
        if (request.getSession().getAttribute("user")!=null){
        chain.doFilter(req, resp);
        }else {
            HttpServletResponse response= (HttpServletResponse) resp;
            response.sendRedirect("http://localhost:8080/jsps/user/login.jsp");
        }

    }

    public void init(FilterConfig config) throws ServletException {
             //定义不被拦截的页面
        list.add("/jsps/user/login.jsp");
        list.add("/jsps/user/register.jsp");

    }

}
