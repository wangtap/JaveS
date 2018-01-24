package com.lanou.annotation;

public class People {
    protected String name;

    public People() {
    }

    public People(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
