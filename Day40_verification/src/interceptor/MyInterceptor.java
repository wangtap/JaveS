package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("我要开始拦截了");
        String invoke=invocation.invoke();//这是放行
        System.out.println("拦截完毕");
        System.out.println(invoke);
        /*
        如果不是登入状态
        不放行
        直接return一个结果视图
        重定向到登入页面即可

         */
        return invoke;
    }
    /*

    自定义拦截器
    要继承AbstractInterceptor
     */



}
