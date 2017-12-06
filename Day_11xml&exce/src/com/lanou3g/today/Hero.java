package com.lanou3g.today;

public class Hero {
    private  String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
    public void skill(){
        System.out.println("ghgh");
    }
    private  void show (String what){
        System.out.println(what);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                '}';
    }
}
