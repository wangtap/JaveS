package com.wt.study.domain;

import java.util.HashSet;
import java.util.Set;


public class CrmPost {
    private String postId;
    private String postName;

    private CrmDepartment crmDepartment;

    private Set<CrmStaff> staffSet = new HashSet<>();

    public CrmDepartment getCrmDepartment() {
        return crmDepartment;
    }

    public void setCrmDepartment(CrmDepartment crmDepartment) {
        this.crmDepartment = crmDepartment;
    }

    public Set<CrmStaff> getStaffSet() {
        return staffSet;
    }

    public void setStaffSet(Set<CrmStaff> staffSet) {
        this.staffSet = staffSet;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CrmPost crmPost = (CrmPost) o;

        if (postId != null ? !postId.equals(crmPost.postId) : crmPost.postId != null) return false;
        if (postName != null ? !postName.equals(crmPost.postName) : crmPost.postName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = postId != null ? postId.hashCode() : 0;
        result = 31 * result + (postName != null ? postName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CrmPost{" +
                "postId='" + postId + '\'' +
                ", postName='" + postName + '\'' +
                ", crmDepartment=" + crmDepartment +
                ", staffSet=" + staffSet +
                '}';
    }
}
