package com.lanou3g.today;
import com.lanou3g.yesterDay.One.Student;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * 文档注释
 */
public class Main {
    @Test
        //添加的是java的测试包
    // 使用这个包中的@Test注解就可以单独运行t1的方法
  /*
        递归
        递归就是自己调自己
         */
    public  void t1(){
        practice(1);


    }
    private  int i =0;
     public void show(){
         System.out.println("第"+(++i)+"次调用");
         if (i<9){ show();}
         System.out.println("第"+i+"次调用结束");
    }
    int result=0;
     int j=0;
    public  void add99(){
        j+=1;
        System.out.println(result);
        result=j*j;
        if (j<=9){add99();}

    }
    public void practice(int num){
        for (int k = num; k >=1 ; k--) {
            System.out.println(k+"*"+num+"="+(k*num));
//            System.out.println("\t");
         }
//        System.out.println();
        num++;
        if(num==10){return;}
        practice(num);

    }
    @Test
    public  void t2() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        /*
        反射是用来干什么的？
        反射可以帮我们在没有对象的情况下
        仅仅只有类的情况下，调用非静态的方法
        调用私有方法或者属性
         */
//        类对象
//        Instance 实例
//        就是称呼不同，一个Hero类的实例
//        就是一个Hero的对象
        Object obj = Hero.class.newInstance();
        Hero heres = Hero.class.newInstance();
//        方法对象
        Method skill = Hero.class.getMethod("skill");
        skill.invoke(heres);


    }
    @Test
        public void t3(){
//        showName("张三");
//        showName("张三","李四");

        String[] ns={"张三1","李四1","王五1"};
        /*
        可以给多个字符串
        也可以给单个数组
        但是不能给字符串和数组一起给
         */
//        showName(ns);


    }
    public void showName(String... names){
//            在方法体中，将参数names看成一个数组
//        数组的类型为String
        for (String name : names) {
            System.out.println(name+"\t");
            System.out.println();

        }
    }
    @Test
    public  void t4() throws Exception {
        Student student = Demo.getInstance(Student.class);
        Object o = Demo.getInstance("com.lanou3g.today.Hero");
        System.out.println(o.toString());
    }
}

