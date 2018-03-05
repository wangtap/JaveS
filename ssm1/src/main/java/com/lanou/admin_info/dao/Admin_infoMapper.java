package com.lanou.admin_info.dao;

import com.lanou.admin_info.domain.Admin_info;
import com.lanou.admin_info.domain.ExtendAdmin_info;
import com.lanou.base.dao.BaseMapper;
import com.lanou.module_info.domain.Module_info;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface Admin_infoMapper extends BaseMapper<ExtendAdmin_info>{

    void updatePassword(Map<String, Object> param);

    Admin_info  findByCode(String adminInfoCode);

    List<Module_info> findModulesByAdmin(int adminId);

    void insertAdminRole(ExtendAdmin_info extendRoleInfo);

    void deleteAdminRole(Integer adminId);
}