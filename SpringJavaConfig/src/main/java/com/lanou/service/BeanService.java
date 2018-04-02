package com.lanou.service;

public class BeanService {
    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanService() {
        System.out.println("初始化构造方法-BeanService");
    }

    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }

}
