package com.wt.study.controller;

import com.wt.study.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FriendsController {


    @RequestMapping("/friends")
    @ResponseBody
    public List<User> friends(){
        List<User> users = new ArrayList<User>();
        users.add(new User(1,"小明","123"));
        users.add(new User(2,"小红","456"));
        return users;
    }
}
