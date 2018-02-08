package com.wt.study.dao;

import com.wt.study.domain.CrmDepartment;

import java.util.List;

public interface DepartmentDao {
    List<CrmDepartment> queryDepartment();
}
