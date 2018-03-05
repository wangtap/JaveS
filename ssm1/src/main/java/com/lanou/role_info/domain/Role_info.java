package com.lanou.role_info.domain;

public class Role_info {
    private Integer roleId;

    private String name;

    public Role_info(Integer roleId, String name) {
        this.roleId = roleId;
        this.name = name;
    }

    public Role_info() {
        super();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}