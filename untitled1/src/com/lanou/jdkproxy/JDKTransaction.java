package com.lanou.jdkproxy;

import org.springframework.stereotype.Component;

@Component
public class JDKTransaction {
    public void begin(){
        System.out.println("-------begin----");
    }
}
