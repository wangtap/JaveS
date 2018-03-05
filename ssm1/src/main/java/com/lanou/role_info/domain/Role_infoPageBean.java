package com.lanou.role_info.domain;

import com.lanou.page.PageBean;

import java.util.List;

public class Role_infoPageBean extends PageBean<ExtendRole_info> {
    public Role_infoPageBean() {
        super();
    }

    public Role_infoPageBean(List<ExtendRole_info> data, int pageCode, int totalData, int pageSize) {
        super(data, pageCode, totalData, pageSize);
    }

    public Role_infoPageBean(int pageCode, int totalData, int pageSize) {
        super(pageCode, totalData, pageSize);
    }


}
