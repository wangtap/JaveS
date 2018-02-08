package com.wt.study.dao;

import com.wt.study.domain.CrmStaff;

import java.util.List;

public interface StaffDao {
    List<CrmStaff> queryStaff();
}
