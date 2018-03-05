package com.lanou.service.domain;

import com.lanou.page.PageBean;

import java.util.List;

public class ServicePageBean extends PageBean<ExtendService> {
    public ServicePageBean() {
        super();
    }

    public ServicePageBean(List<ExtendService> data, int pageCode, int totalData, int pageSize) {
        super(data, pageCode, totalData, pageSize);
    }

    public ServicePageBean(int pageCode, int totalData, int pageSize) {
        super(pageCode, totalData, pageSize);
    }
}
