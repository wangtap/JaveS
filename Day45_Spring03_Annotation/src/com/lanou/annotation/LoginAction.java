package com.lanou.annotation;

import org.springframework.stereotype.Controller;

    @Controller
//    控制器
//    struts2中的action
//    使用这个注解
public class LoginAction {

    public String login(){
        return "success";
    }

}
