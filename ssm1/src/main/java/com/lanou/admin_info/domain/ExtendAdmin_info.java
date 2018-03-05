package com.lanou.admin_info.domain;

import com.lanou.role_info.domain.Role_info;

import java.util.List;

public class ExtendAdmin_info extends Admin_info {
    private List<Role_info> roleInfos;

    private List<Integer> roleIds;

    public List<Role_info> getRoleInfos() {
        return roleInfos;
    }

    public void setRoleInfos(List<Role_info> roleInfos) {
        this.roleInfos = roleInfos;
    }

    public List<Integer> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Integer> roleIds) {
        this.roleIds = roleIds;
    }

    @Override
    public String toString() {
        return "ExtendAdmin_info{" +
                "roleInfos=" + roleInfos +
                ", roleIds=" + roleIds +
                '}';
    }
}
