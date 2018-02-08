package com.lanou.cgproxy;


import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Cgproxy  implements MethodInterceptor {
    private CgTransaction cgTransaction;
    private CgUserDaoImpl cgUserDao;

    public Cgproxy(CgTransaction cgTransaction, CgUserDaoImpl cgUserDao) {
        this.cgTransaction = cgTransaction;
        this.cgUserDao = cgUserDao;
    }



    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        cgTransaction.begin();
        method.invoke(cgUserDao,objects);
        return null;
    }
}
