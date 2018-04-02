package com.lanou.config;

import com.lanou.service.BeanService;
import com.lanou.service.JSR250Service;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;



public class InitDesConfigTest {
    @Test
    public void name() throws Exception {


    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(InitDesConfig.class);

    JSR250Service jsr250Service = context.getBean(JSR250Service.class);
    BeanService beanService = context.getBean(BeanService.class);
}

    }

