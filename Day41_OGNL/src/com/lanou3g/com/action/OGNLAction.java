package com.lanou3g.com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;

public class OGNLAction extends ActionSupport implements ServletRequestAware {
    private String hello="abc";
    private  String name="李小璐";

//    public String getName() {
//        return name;
//    }



    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }


    public String hello(){
        System.out.println("hello");
            return SUCCESS;
        }


    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        hello="123";
            httpServletRequest.setAttribute("hello",hello);
            httpServletRequest.getSession().setAttribute("hello","hello");

    }

    public  String show(){
        ActionContext context = ActionContext.getContext();
        context.put("show","获得ActionContext中的值");
        return  SUCCESS;
    }

    public String el(){

//        ActionContext.getContext().put("name","PGOne");
        ActionContext.getContext().getSession().put("name","凉凉");


        return SUCCESS;
    }

}
