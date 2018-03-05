package com.lanou.cost.domain;


import com.lanou.page.PageBean;

import java.util.List;

public class CostPageBean extends PageBean<Cost> {
    private String column1;
    private String s;

    public CostPageBean() {
        super();
    }

    public CostPageBean(List<Cost> data, int pageCode, int totalData, int pageSize) {
        super(data, pageCode, totalData, pageSize);
    }

    public CostPageBean(int pageCode, int totalData, int pageSize) {
        super(pageCode, totalData, pageSize);
    }

    public String getColumn1() {
        return column1;
    }


    public void setColumn1(String column1) {
        this.column1 = column1;
    }


    public String getS() {
        return s;
    }


    public void setS(String s) {
        this.s = s;
    }
}
