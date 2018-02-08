package com.wt.crm.staff.service.impl;

import com.opensymphony.xwork2.ActionContext;
import com.wt.crm.staff.dao.StaffDao;
import com.wt.crm.staff.domain.CrmStaff;
import com.wt.crm.staff.service.StaffService;
import com.wt.crm.staff.service.exception.loginexception.LoginException;
import com.wt.crm.utils.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffDao staffDao;

    public StaffDao getStaffDao() {
        return staffDao;
    }

    public void setStaffDao(StaffDao staffDao) {
        this.staffDao = staffDao;
    }

    @Override
    public void login(String name, String password) throws LoginException {
        String loginPwd = StringUtils.getMD5Value(password);

        List<CrmStaff> daoList = staffDao.queryStaffByLoginNameAndLoginPwd(name, loginPwd);
        if (daoList!=null){
            if (daoList.size()==1){
           ServletActionContext.getRequest().getSession().setAttribute("loginStaff",daoList.get(0));
            }else {
                throw new LoginException();
            }
        }else {
            throw new LoginException();
        }
    }

    @Override
    public void queryAllStaff() {
        ActionContext.getContext().put("allStaff", staffDao.queryAllStaff());

    }

    @Override
    public CrmStaff queryStaffBySId(String sId) {
           return staffDao.queryStaffBySId(sId);

    }


    @Override
    public void edit(CrmStaff formCS) {
//        formCS.setLoginPwd(StringUtils.getMD5Value(formCS.getLoginPwd()));
        staffDao.editStaff(formCS);
    }
}
