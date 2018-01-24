package com.lanou.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

    @Component("car1")
public class Car {

//        @Autowired
        @Value("张三")
    private String name;

        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public String getName() {
        return name;
    }
}
