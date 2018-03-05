package com.lanou.role_info.dao;

import com.lanou.base.dao.BaseMapper;
import com.lanou.role_info.domain.ExtendRole_info;
import com.lanou.role_info.domain.Role_info;
import com.lanou.role_module.domain.Role_module;
import org.springframework.stereotype.Repository;

@Repository
public interface Role_infoMapper extends BaseMapper<ExtendRole_info>{

    void updateByRoleModule(Integer roleId,Integer moduleId);

    void deleteRoleMOdule(Integer roleId);

    void insertroleInfo(ExtendRole_info extendRoleInfo);
    void insertRoleModule(ExtendRole_info extendRoleInfo);
}