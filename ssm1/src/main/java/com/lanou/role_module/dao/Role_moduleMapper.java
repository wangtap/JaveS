package com.lanou.role_module.dao;

import com.lanou.role_module.domain.Role_module;

public interface Role_moduleMapper {
    int insert(Role_module record);

    int insertSelective(Role_module record);
}