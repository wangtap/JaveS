package user.iterceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.apache.struts2.ServletActionContext;

public class Interceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        if (ServletActionContext.getRequest().getSession().getAttribute("user")!=null){
            String invoke=actionInvocation.invoke();//这是放行
        }
        return "fail";
    }
}
