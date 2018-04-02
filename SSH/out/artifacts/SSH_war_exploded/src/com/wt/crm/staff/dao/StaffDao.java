package com.wt.crm.staff.dao;

import com.wt.crm.post.domain.CrmPost;
import com.wt.crm.staff.domain.CrmStaff;

import java.util.List;

public interface StaffDao {
    List<CrmStaff> queryStaffByLoginNameAndLoginPwd(String loginName, String loginPwd);

    List<CrmStaff> queryAllStaff();

    CrmStaff queryStaffBySId(String sId);

    void editStaff(CrmStaff formCS);




}
