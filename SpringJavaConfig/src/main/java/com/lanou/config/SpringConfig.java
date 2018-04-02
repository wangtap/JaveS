package com.lanou.config;

import com.lanou.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//表示单前类是一个配置类
public class SpringConfig {
    /**
     * 通过Bean指定下面方法的返回值是一个Bean
     * @return
     */
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }

}
