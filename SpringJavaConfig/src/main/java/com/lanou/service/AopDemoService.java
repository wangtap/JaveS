package com.lanou.service;

import com.lanou.anno.Action;
import org.springframework.stereotype.Service;

@Service//标识这个是一个service，也是Spring中的一个bean
public class AopDemoService {
    @Action(name = "6666")
    public void  showAop(){
        System.out.println("AopDemoService");
    }

}
