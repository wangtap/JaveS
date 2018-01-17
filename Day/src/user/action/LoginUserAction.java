package user.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import user.domain.User;
import user.service.UserService;

import javax.mail.Session;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.spi.http.HttpContext;

public class LoginUserAction extends ActionSupport {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    UserService userService= new  UserService();



    public String login(){



        int i = userService.login(user.getUsername(), user.getPassword());
        switch (i){
            case 0:  addFieldError("login.username","用户名错误"); break;
            case 1:   addFieldError("login.password","密码错误"); break;
            case 2:  return "fail";
            case 3: ServletActionContext.getRequest().getSession().setAttribute("user",user);  return SUCCESS;
        }
        return "fail";
    }
}
