package com.lanou3g.factory;

import com.lanou3g.createobj.User;

public class UserFactory extends AbstractFactory {

    public  User getInstance(){
        return new User();
    }

}
