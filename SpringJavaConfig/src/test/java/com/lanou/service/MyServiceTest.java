package com.lanou.service;

import com.lanou.config.MyConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class MyServiceTest {
    @Test
    public void name() throws Exception {

            AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(MyConfig.class);
            MyService myService = context.getBean(MyService.class);

            myService.output();

            context.close();

    }
}