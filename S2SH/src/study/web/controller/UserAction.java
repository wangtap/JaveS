package study.web.controller;

import com.opensymphony.xwork2.ActionSupport;
import study.service.UserServiceImpl;

public class UserAction extends ActionSupport {
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public UserServiceImpl getUserService() {
        return userService;
    }

    public String register(){
     userService.register();
        System.out.println("-----userAction----");
        return SUCCESS;
    }
}
