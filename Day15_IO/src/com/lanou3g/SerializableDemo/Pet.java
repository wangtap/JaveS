package com.lanou3g.SerializableDemo;

import java.io.Serializable;

public class Pet  implements Serializable{
    private  String name ;
    private  String gender;


    public Pet() {

    }

    public Pet(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
