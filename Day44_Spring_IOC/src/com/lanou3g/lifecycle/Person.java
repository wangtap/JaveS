package com.lanou3g.lifecycle;

public class Person {
    public Person() {
        System.out.println("Person#Constructor");
    }

    public void init(){
        System.out.println("可以在这个方法中初始化一些必要数据");

    }

    public void destroy(){
        System.out.println(
                "当对象即将被销毁时" +
                        "可以在这里释放一些资源"
        );
    }
}
