import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private static final long serialVersionUID = 5282197184219501014L;
    private User user;
    public String login(){
        if(user.getUsername().equals("zoey")){
            System.out.println(getText("login.success"));
            return Action.SUCCESS;
        }
        System.out.println(getText("login.error"));
        return Action.ERROR;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
