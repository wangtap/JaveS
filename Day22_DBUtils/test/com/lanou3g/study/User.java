package com.lanou3g.study;

import com.lanou3g.utils.JDBCTool;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class User {
    private  String  uname;
    private  int uid;
    private  String  loc;
    private  int  age;

    public User(String uname, int id, String loc, int age) {
        this.uname = uname;
        this.uid = id;
        this.loc = loc;
        this.age = age;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void queryBean() throws SQLException {
        User user = new WhQueryRunner().query(
                JDBCTool.init(),
                "select*from hw_user",
                new BeanHandler<User>(User.class)
        );

        System.out.println(user);

    }
}
