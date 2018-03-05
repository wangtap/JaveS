package com.lanou.admin_info.domain;

import com.lanou.page.PageBean;

import java.util.List;

public class Admin_infoPageBean extends PageBean<ExtendAdmin_info> {
    public Admin_infoPageBean() {
        super();
    }

    public Admin_infoPageBean(List<ExtendAdmin_info> data, int pageCode, int totalData, int pageSize) {
        super(data, pageCode, totalData, pageSize);
    }

    public Admin_infoPageBean(int pageCode, int totalData, int pageSize) {
        super(pageCode, totalData, pageSize);
    }
}
