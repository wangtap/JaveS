package com.lanou.account.domain;

import com.lanou.page.PageBean;

import java.util.List;

public class AccountPageBean extends PageBean<Account> {
    private String idcardNo;
    private String realName;
    private String loginName;
    private String status;

    public AccountPageBean() {
        super();
    }

    public AccountPageBean(List<Account> data, int pageCode, int totalData, int pageSize) {
        super(data, pageCode, totalData, pageSize);
    }

    public AccountPageBean(int pageCode, int totalData, int pageSize) {
        super(pageCode, totalData, pageSize);
    }

    public String getIdcardNo() {
        return idcardNo;
    }

    public void setIdcardNo(String idcardNo) {
        this.idcardNo = idcardNo;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AccountPageBean{" +
                "idcardNo='" + idcardNo + '\'' +
                ", realName='" + realName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
