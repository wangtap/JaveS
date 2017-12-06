package com.lanou3g.today;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {
    public static  <T> T getInstance(Class<T> clazz ) throws IllegalAccessException, InstantiationException {
        T t = clazz.newInstance();
        /*
        ʹ�������clazz������һ������
        �������ָ���˷���T
        ����ζ�ţ�����������ʹ������Ķ�������ͣ�����T
         */
        return t;
    }
    public static Object getInstance(String className ) throws Exception
            {
        //ֻ��Ҫʹ��һ���ַ�����ʽ������
        //���ɻ�ø���������
        Class<?> aClass =
                Class.forName(className);
        //ͨ������󣬻�ȡ�����͵Ķ���
        Object o = aClass.newInstance();
        //ͨ�������ķ�������ø����name����
        Field name = aClass.getDeclaredField("name");
        /*
        ����1��������
        ����2�������б��е�ÿ������������
        ע�����2���յ���һ���ɱ����
        ˵�Կ��Դ������������������
         */

                Method show = aClass.getDeclaredMethod("123", String.class);
                show.setAccessible(true);
                show.invoke(o,"����");
                //����˽��Ȩ�޵�����
        name.setAccessible(true);
        name.set(o,"����");
        /*
        �������Զ���name��set����
        ����1���յ��ǣ�Ҫ���ĸ����������name��ֵ
        ����2���յ��ǣ�Ҫ�����ֵ
         */

        return o;
    }
}
