package com.lanou.study.web.controll;

import com.lanou.study.sesrvice.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
    private UserService userService;
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String register(){
        userService.register();
        return SUCCESS;
    }
}
