package com.wt.crm.staff.domain;

import com.wt.crm.post.domain.CrmPost;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class CrmStaff {
    private String staffId;
    private String loginName;
    private String loginPwd;
    private String staffName;
    private String gender;
    private Timestamp onDutyDate;
    private CrmPost post;
    private String postid;

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    @Override
    public String toString() {
        return "CrmStaff{" +
                "staffId='" + staffId + '\'' +
                ", loginName='" + loginName + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", staffName='" + staffName + '\'' +
                ", gender='" + gender + '\'' +
                ", onDutyDate=" + onDutyDate +
                ", post=" + post +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CrmStaff crmStaff = (CrmStaff) o;

        if (staffId != null ? !staffId.equals(crmStaff.staffId) : crmStaff.staffId != null) return false;
        if (loginName != null ? !loginName.equals(crmStaff.loginName) : crmStaff.loginName != null) return false;
        if (loginPwd != null ? !loginPwd.equals(crmStaff.loginPwd) : crmStaff.loginPwd != null) return false;
        if (staffName != null ? !staffName.equals(crmStaff.staffName) : crmStaff.staffName != null) return false;
        if (gender != null ? !gender.equals(crmStaff.gender) : crmStaff.gender != null) return false;
        if (onDutyDate != null ? !onDutyDate.equals(crmStaff.onDutyDate) : crmStaff.onDutyDate != null) return false;
        return post != null ? post.equals(crmStaff.post) : crmStaff.post == null;
    }

    @Override
    public int hashCode() {
        int result = staffId != null ? staffId.hashCode() : 0;
        result = 31 * result + (loginName != null ? loginName.hashCode() : 0);
        result = 31 * result + (loginPwd != null ? loginPwd.hashCode() : 0);
        result = 31 * result + (staffName != null ? staffName.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (onDutyDate != null ? onDutyDate.hashCode() : 0);
        result = 31 * result + (post != null ? post.hashCode() : 0);
        return result;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Timestamp getOnDutyDate() {
        return onDutyDate;
    }

    public void setOnDutyDate(Timestamp onDutyDate) {
        this.onDutyDate = onDutyDate;
    }

    public CrmPost getPost() {
        return post;
    }

    public void setPost(CrmPost post) {
        this.post = post;
    }

    public CrmStaff() {
    }
}
