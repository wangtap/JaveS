package com.lanou.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//表示该注解用在方法上
@Target(value = ElementType.METHOD)
//表示会在保存时运行（就是会保存在字节码文件中）
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Action {
    String name();
}
