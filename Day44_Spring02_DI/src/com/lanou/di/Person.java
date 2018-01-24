package com.lanou.di;

import java.util.*;

public class Person {
    private String name;
    private Car car;
    private int age;
    private String gender;
    private List list;
    private Set set;
    private Map map;
    private Properties properties;
    private Object[] objects;

    public Person(String s, Car car) {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                ", objects=" + Arrays.toString(objects) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Object[] getObjects() {
        return objects;
    }

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    public Person(String name, Car car, int age, String gender, List list, Set set, Map map, Properties properties, Object[] objects) {

        this.name = name;
        this.car = car;
        this.age = age;
        this.gender = gender;
        this.list = list;
        this.set = set;
        this.map = map;
        this.properties = properties;
        this.objects = objects;
    }

    public Person() {

    }
}
