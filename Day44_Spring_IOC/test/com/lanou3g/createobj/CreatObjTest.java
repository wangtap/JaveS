package com.lanou3g.createobj;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class CreatObjTest {
    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        //@Before注解标注的方法
        //会在每个@Test方法前执行

        ///下面语句时在获取ApplicationContext
        //几乎Spring所有的操作，都要获得这个对象
        //这个对象加载配置文件中的信息
        //通过这个对象，我们可以让Sprig帮助我们创建对象
        context=new ClassPathXmlApplicationContext(
                "applicationContext.xml");
    }

    @Test
    public void helloSpring(){
        context.getBean("user");
    }

    @Test
    public  void constructor(){

    }

    @Test
    public void property() throws Exception {
        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("user2");

        System.out.println(user.getName());
        System.out.println(user2.getName());


    }
}