package com.lanou3g.com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.CompoundRoot;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

public class ContextAction extends ActionSupport {


    public String context(){
        //相当于每个action的 上下文
        ActionContext context = ActionContext.getContext();
        context.getApplication().put("test","哈哈");
        context.put("test","哈哈哈哈或");//每次访问context都是不同的 （因为每次访问时 线程是不一样的）
        HttpSession session = ServletActionContext.getRequest().getSession();
        session.setAttribute("p2", "123􀟢􀟢􀟢􀟢");
        return SUCCESS;
    }
    public String value(){
        Object test =ActionContext.getContext().get("test");
        Object t = ActionContext.getContext().getApplication().get("test");
        Object p2 = ActionContext.getContext().getSession().get("p2");
        System.out.println(t);
        System.out.println("p2"+p2);
        return SUCCESS;
    }

    public String vs(){
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        System.out.println("获得了值栈");
        return SUCCESS;
    }

    public String vss(){
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        CompoundRoot root=valueStack.getRoot();
            /*
            向栈中存放一个对象
            也就是压栈
            从栈顶要一个对象进去

             */
        root.push("哈哈哈哈");
        //获取 栈顶对象
        Object peek =root.peek();
        System.out.println(peek);

        //弹栈
        root.pop();
        System.out.println(root.peek());
        return  SUCCESS;

    }

}
