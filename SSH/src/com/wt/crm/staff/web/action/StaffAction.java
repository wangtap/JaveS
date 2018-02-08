package com.wt.crm.staff.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wt.crm.department.domain.CrmDepartment;
import com.wt.crm.department.service.DpmServiceImpl;
import com.wt.crm.staff.domain.CrmStaff;
import com.wt.crm.staff.service.exception.loginexception.LoginException;
import com.wt.crm.staff.service.impl.StaffServiceImpl;
import com.wt.crm.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Controller
public class StaffAction extends ActionSupport {
    @Autowired
    private StaffServiceImpl staffService;
    @Autowired(required = false)
    private CrmStaff staff;
    @Autowired
    private DpmServiceImpl dpmService;

    public DpmServiceImpl getDpmService() {
        return dpmService;
    }

    public void setDpmService(DpmServiceImpl dpmService) {
        this.dpmService = dpmService;
    }

    @Qualifier("staffId")
    private String   staffId;

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public CrmStaff getStaff() {
        return staff;
    }

    public void setStaff(CrmStaff staff) {
        this.staff = staff;
    }

    public StaffServiceImpl getStaffService() {
        return staffService;
    }

    public void setStaffService(StaffServiceImpl staffService) {
        this.staffService = staffService;
    }

    public String login(){
        try {
            staffService.login(staff.getLoginName(),staff.getLoginPwd());
        } catch (LoginException e) {
            addFieldError("","用户名或密码错误");
            return "fail";
        }
        return SUCCESS;
    }

    public String queryAllStaff(){
        staffService.queryAllStaff();
        return "queryAllStaff";
    }

    public String editPre(){
        CrmStaff crmStaff = staffService.queryStaffBySId(staffId);
        List<CrmDepartment> listDpm = dpmService.queryAllDpm();
        ActionContext context = ActionContext.getContext();
        context.getValueStack().push(crmStaff);
        context.put("allDpm",listDpm);
        return "editPre";
    }

    public String edit(){
        System.out.println(staff);
        if (staff.getStaffId()==null|| Objects.equals(staff.getStaffId(), "")){
           staff.setStaffId( StringUtils.getMD5Value(StringUtils.getUUID()));
        }
        System.out.println(staff.getStaffId());
        staffService.edit(staff);
        return "edit";
    }


}
