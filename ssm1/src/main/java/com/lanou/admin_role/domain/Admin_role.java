package com.lanou.admin_role.domain;

public class Admin_role {
    private Integer adminId;

    private Integer roleId;

    public Admin_role(Integer adminId, Integer roleId) {
        this.adminId = adminId;
        this.roleId = roleId;
    }

    public Admin_role() {
        super();
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}