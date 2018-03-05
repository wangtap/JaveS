package com.lanou.role_module.domain;

public class Role_module {
    private Integer roleId;

    private Integer moduleId;

    public Role_module(Integer roleId, Integer moduleId) {
        this.roleId = roleId;
        this.moduleId = moduleId;
    }

    public Role_module() {
        super();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    @Override
    public String toString() {
        return "Role_module{" +
                "roleId=" + roleId +
                ", moduleId=" + moduleId +
                '}';
    }
}