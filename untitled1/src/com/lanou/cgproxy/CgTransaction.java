package com.lanou.cgproxy;

import org.springframework.stereotype.Component;

@Component
public class CgTransaction {
    public void begin(){
        System.out.println("-------begin----");
    }
}
