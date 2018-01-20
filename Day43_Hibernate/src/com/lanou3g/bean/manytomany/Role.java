package com.lanou3g.bean.manytomany;

import java.util.HashSet;
import java.util.Set;

public class Role {
    private String  rid;
    private String rname;
        //显示初始化
    private Set<User> users= new HashSet<>();


    public Role() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (rid != null ? !rid.equals(role.rid) : role.rid != null) return false;
        if (rname != null ? !rname.equals(role.rname) : role.rname != null) return false;
        return users != null ? users.equals(role.users) : role.users == null;
    }

    @Override
    public int hashCode() {
        int result = rid != null ? rid.hashCode() : 0;
        result = 31 * result + (rname != null ? rname.hashCode() : 0);
        result = 31 * result + (users != null ? users.hashCode() : 0);
        return result;
    }


    public Role(String rid, String rname, Set<User> users) {
        this.rid = rid;
        this.rname = rname;
        this.users = users;
    }

    public String getRid() {

        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
