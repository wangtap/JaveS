package com.lanou.config;

import com.lanou.service.AwareService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class AwareConfigTest {
    @Test
    public void name() throws Exception {
        AnnotationConfigApplicationContext context =
                //未指定要加载哪个配置类
                new AnnotationConfigApplicationContext();
        //后置指定
        context.register(AwareConfig.class);
        //刷新容器，一定要刷新!
        context.refresh();
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResource();
    }

}