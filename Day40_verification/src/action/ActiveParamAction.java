package action;

import com.opensymphony.xwork2.ActionSupport;

public class ActiveParamAction extends ActionSupport {
    private String username;
    private String password;

    @Override
    public String execute() throws Exception {
        System.out.println("username--"+username);
        System.out.println("password--"+password);
        return super.execute();
    }

    public void setUsername(String username) {
//        System.out.println(username+"===");
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
//        System.out.println(password+"===");
        this.password = password;
    }

    public String getPassword() {
        return password;
    }





}
