package homework.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "IndexFilter", urlPatterns = {"/index.jsp","/"})
public class IndexFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request=(HttpServletRequest)req;
        HttpServletResponse response=(HttpServletResponse) resp;
        if (request.getSession().getAttribute("user")!=null){
        chain.doFilter(req, resp);
       }else {
            response.sendRedirect("/login.jsp");

        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
