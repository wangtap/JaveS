package com.lanou.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("p")
//一般就是不知道这个类型有什么具体的作用时使用这个注解
public class Person {
    @Qualifier("car1")//按名字自动装配
    @Autowired(required = false)//按类型自动装配(找不到就算了)
    private Car car;

    @Value("王二麻子")
    private String name;
    @Value("男")
    private String gender;

    @PostConstruct
    public  void showPost(){
        System.out.println("初始化");
    }

    @PreDestroy
    public void showPre(){
        System.out.println("销毁");
    }

    @Value("女")
    @Required//@Required注解应用于Bean属性的setter方法
    public void setGender(String gender) {
        this.gender = gender;
    }



    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "car=" + car +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Car getCar() {

        return car;
    }
}
