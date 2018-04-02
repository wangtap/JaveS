package com.wt.springbootwhj.controller;


import com.wt.springbootwhj.domain.User;
import com.wt.springbootwhj.service.WYJService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
public class UserController {
    @Autowired
    @Qualifier("wyjService")
    private WYJService wyjService;

    @RequestMapping(value="/selectUser")

    public User selectUser(@RequestParam("user_name") String user_name){
        // 调用业务逻辑组件判断用户是否可以登录
        System.out.println(user_name);
        User user = wyjService.selectUser(user_name);
        System.out.println(user);
        return user;
    }

    @RequestMapping(value="/selectUserByLogin")
    public User selectUserByLogin(User user){
        System.out.println(user.getPhone());
        System.out.println(user.getPassword());
        User user1 = wyjService.selectUserByLogin(user);
        return user1;
    }

    @RequestMapping(value="/selectUserByPhone")
    public int selectUserByPhone(User user){
        int i = wyjService.selectUserByPhone(user);
        return i;
    }

    @RequestMapping(value="/insertUser")
    public void insertUser(User user){
        wyjService.insertUser(user);
    }

    @RequestMapping(value = "/isExit")
    public User isExit(User user){
       User user1=wyjService.isExist(user);
       return user1;
    }

    @RequestMapping(value = "/update")
    public Boolean updataUser(User user){
        Boolean up = wyjService.updataUser(user);
        return up;
    }

}
