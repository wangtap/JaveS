package user.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.apache.struts2.ServletActionContext;

public class Interceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {

        System.out.println("拦截");
        if ( ServletActionContext.getRequest().getSession().getAttribute("user")!=null){
        String invoke=invocation.invoke();//这是放行
        System.out.println(invoke);
        }
        return "fail";
    }
}
