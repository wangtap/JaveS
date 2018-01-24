package com.lanou.jdkproxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

public class JdkProxyTest {
    @Test
    public void jdkTest() throws Exception {
        JdkUserDao jdkUserDao=new JdkUserDaoImpl();
        JdkTransaction jdkTransaction=new JdkTransaction();
        JdkProxy jdkProxy=new JdkProxy(jdkUserDao,jdkTransaction);
        JdkUserDao o = (JdkUserDao) Proxy .newProxyInstance(
                jdkUserDao.getClass().getClassLoader(),//目标 类型的类加载器
                jdkUserDao.getClass().getInterfaces(),//目标类型实现了哪些接口
                jdkProxy//使用哪个InvocationHandler,去创建目标类的代理对象（只在运行时存在）（不会生成字节码 文件）
        );
        o.add();
        o.delete();
        System.out.println(o.getClass().getName());

    }
}