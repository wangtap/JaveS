package servletapi;

import bean.User;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import java.util.ArrayList;
import java.util.List;

public class ApiAction extends ActionSupport {
    public String api(){
        List<User> users=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            User user=new User("名字"+i,i);
            users.add(user);

        }
        ServletActionContext.getRequest().setAttribute("users",users);
        return SUCCESS;
    }
}
