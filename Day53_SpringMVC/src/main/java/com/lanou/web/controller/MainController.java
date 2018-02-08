package com.lanou.web.controller;


import com.lanou.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class MainController {


    private String SUCCESS="success";

    @RequestMapping(value = "/hello")
    public String  hello(){
        System.out.println("______你好---------");
        return "success";
//      success  表示要展示jsp页面 的名字
    }

    @RequestMapping(value = "/login")
    public String  login(String  username,String password){
        System.out.println("username----"+username);
        System.out.println("password----"+password);
        return SUCCESS;
    }

    @RequestMapping(value = "login2")
    public String login2(User user){
        System.out.println(user);
        return SUCCESS;
    }

  @RequestMapping(value = "login3")
    public String  login3(UserWrap userWrap) {
        System.out.println(userWrap);

        return SUCCESS;
    }

    @RequestMapping(value = "login4")
    public String login4(User user , Model model){
//        相当于application域
      model.addAttribute("user",user);
      return SUCCESS;
    }

    @RequestMapping("updateById/{uid}" )
    public String updateById(@PathVariable int uid){
        System.out.println(uid);
        return SUCCESS;
    }

    @RequestMapping("/redirect")
    public String redirect (){
        return "redirect:success";
    }

//    加/表示要访问的是控制器而不是jsp页面
    @RequestMapping("/rtc")
    public String redirectToController(){
        return "redirect:/updateById/3";

    }


    @RequestMapping("/register1")
    public  @ResponseBody UserWrap register(User user){
//        200表示访问成功
//        SUCCESS表示提示信息
//        user才是真正的数据
        System.out.println(user);
        UserWrap userWrap=new UserWrap(200,SUCCESS,user);
        System.out.println(userWrap);
//        后端在传给前端json数据时
//        都会遵从上面的格式
//        code：响应码，如果出错设置对应的响应码
//        message：成功success  出错：异常信息
//       也就是说，只要传给前端json数据，都需要将
//        真正的javabean包装一下
        return userWrap;
    }
}
