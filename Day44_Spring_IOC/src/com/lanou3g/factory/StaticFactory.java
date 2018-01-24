package com.lanou3g.factory;

import com.lanou3g.createobj.User;

public class StaticFactory {

    //静态工厂
    public static User getInstance(){

        return new User();
    }

    //
}
