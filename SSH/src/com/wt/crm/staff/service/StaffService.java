package com.wt.crm.staff.service;

import com.wt.crm.staff.domain.CrmStaff;
import com.wt.crm.staff.service.exception.loginexception.LoginException;

public interface StaffService {
    void login(String name,String password) throws LoginException;

    void queryAllStaff();

    CrmStaff queryStaffBySId(String sId);

    void edit(CrmStaff formCS);
}
