import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "PicFilter",urlPatterns = "/pic")
//这里这个urlPatterns是要拦截的路径
public class PicFilter implements Filter {
    public void destroy() {
    }

    /**
     * 当用户访问PicServlet时
     * 会先访问到PicFilter
     * 执行doFilter的方法
     * 在该方法中，存在参数的doFilter方法可以选择放行
     * 如果不执行chain.doFilter方法，那么会拦截该请求
     *
     * 可以在Filter#doFilter中
     * 对request或response做某些配置
     * （比如，可以设置编码）
     * @param req
     * @param resp
     * @param chain
     * @throws ServletException
     * @throws IOException
     */
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String user = req.getParameter("user");
        if (user!=null){
        chain.doFilter(req, resp);
        return;
        }
        resp.getWriter().write("there is no user");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
