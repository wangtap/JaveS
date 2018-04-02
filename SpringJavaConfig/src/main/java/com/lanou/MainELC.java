package com.lanou;

import com.lanou.config.ELConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainELC {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ELConfig.class);
        ELConfig bean = context.getBean(ELConfig.class);
        bean.outputResource();

        context.close();
    }
}
