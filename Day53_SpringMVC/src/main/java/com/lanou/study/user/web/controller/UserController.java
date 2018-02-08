package com.lanou.study.user.web.controller;

import com.lanou.study.user.domain.User;
import com.lanou.study.user.service.Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    private String SUCCESS="success";
    Service servlec=new Service();
    @RequestMapping("/l")
    public String login(User user){
        System.out.println(user);
        return    servlec.login(user);
    }

    @RequestMapping("/r")
    public String register(User user){
        servlec.register(user);
        return "login";
    }
}
