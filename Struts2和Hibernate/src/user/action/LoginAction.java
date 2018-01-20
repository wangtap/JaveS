package user.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import user.domain.User;
import user.service.UserService;
import user.service.exceptiom.loginexception.LoginException;

public class LoginAction extends ActionSupport {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    UserService userService= new UserService();
    public String login(){
        try {
            User login = userService.login(user);
            ServletActionContext.getRequest().getSession().setAttribute("user",login);
                 return SUCCESS;
        } catch (LoginException e) {
            e.getMessage();
            return "faili";
        }
    }
}
