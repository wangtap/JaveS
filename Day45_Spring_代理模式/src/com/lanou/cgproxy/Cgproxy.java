package com.lanou.cgproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Cgproxy implements MethodInterceptor {
    private Object target;
    private CgTransaction cgTransaction;

    public Cgproxy(Object target, CgTransaction cgTransaction) {
        this.target = target;
        this.cgTransaction = cgTransaction;
    }



        public CgTransaction getCgTransaction() {
        this.target=target;
        this.cgTransaction=cgTransaction;
        return cgTransaction;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        cgTransaction.begin();

        method.invoke(target,objects);

        cgTransaction.commit();

        return null;
    }
}
