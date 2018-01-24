package com.lanou.annotation;

public class Student extends People {
    public Student() {
        super();
    }

    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
