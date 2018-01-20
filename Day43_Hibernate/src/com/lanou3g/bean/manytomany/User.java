package com.lanou3g.bean.manytomany;

import java.util.HashSet;
import java.util.Set;

public class User {
    private String uid;
    private String uname;
    private  Set<Role> roles=new HashSet<>();

    public User() {
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (uid != null ? !uid.equals(user.uid) : user.uid != null) return false;
        if (uname != null ? !uname.equals(user.uname) : user.uname != null) return false;
        return roles != null ? roles.equals(user.roles) : user.roles == null;
    }



    public String getUid() {

        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public User(String uid, String uname, Set<Role> roles) {

        this.uid = uid;
        this.uname = uname;
        this.roles = roles;
    }
}

