package com.lanou.user.action;

import com.lanou.user.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class UserAction {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService.userservice().getName());

    }
public void useraction (){
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    UserService userService = (UserService) context.getBean("userService");
    System.out.println(userService.userservice().getName());

}
}
