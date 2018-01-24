package com.lanou.cgproxy;

import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

import static org.junit.Assert.*;

public class CgproxyTest {
    @Test
    public void cgProxy() throws Exception {
        CgUserDao cgUserDao=new CgUserDaoImpl();
        CgTransaction cgTransaction=new CgTransaction();


        //到这一步，基本和jdk动态代理的流程相同
        Cgproxy cgproxy=new Cgproxy(cgUserDao,cgTransaction);

        //代码增强类
        Enhancer enhancer=new Enhancer();

        //指定哪个拦截器来执行intercept方法
        enhancer.setCallback(cgproxy);

        //指定生成 的代理对象的父类
        enhancer.setSuperclass(
                cgUserDao.getClass()
        );

        Object o = enhancer.create();

        CgUserDao cgDao = (CgUserDao) o;
        cgDao.add();
        cgDao.delete();

        System.out.println("代理类"+o.getClass().getName());
        System.out.println("代理类的父类"+o.getClass().getSuperclass().getName());
        Class<?>[] interfaces = o.getClass().getInterfaces();

        for (int i = 0; i < interfaces.length; i++) {
            System.out.println(interfaces[i]);
        }


    }
}