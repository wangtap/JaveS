package com.lanou.admin_role.dao;

import com.lanou.admin_role.domain.Admin_role;

public interface Admin_roleMapper {
    int insert(Admin_role record);

    int insertSelective(Admin_role record);
}