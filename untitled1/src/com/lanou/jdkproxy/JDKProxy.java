package com.lanou.jdkproxy;

import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
@Component
public class JDKProxy implements InvocationHandler {

    private Object object;
    private JDKTransaction jdkTransaction;

    public JDKProxy(Object object, JDKTransaction jdkTransaction) {
        this.object = object;
        this.jdkTransaction = jdkTransaction;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        jdkTransaction.begin();
        method.invoke(object,args);

        return null;

    }
}
