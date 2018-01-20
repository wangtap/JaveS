package com.lanou3g.bean;

import com.lanou3g.bean.manytomany.Role;
import com.lanou3g.bean.manytomany.User;
import com.lanou3g.util.HibernateUtil;
import org.junit.Test;

public class UserTest {

    @Test
    public void get(){
        HibernateUtil.handle(session -> {
            User user = new User();
            user.setUname("张三");
            Role role = new Role();
            role.setRname("管理员");

            role.getUsers().add(user);
            user.getRoles().add(role);

            session.save(user);
                return null;
        });
    }
}
