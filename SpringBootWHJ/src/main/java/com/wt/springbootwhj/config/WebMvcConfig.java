package com.wt.springbootwhj.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //并不会覆盖WebMvcAutoConfiguration中的addViewController方法
        //WebMvcAutoConfiguration中会把/index指向index.html
        registry.addViewController("/index").setViewName("/index");
        registry.addViewController("/pro_list").setViewName("/pro_list");
    }
}
