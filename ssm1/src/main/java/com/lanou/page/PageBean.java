package com.lanou.page;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PageBean<T> {
    private List<T> data;//分页数据
    //    private int totalPages;//总页数
    private int pageCode;//当前页
    private int totalData;//总数据量
    private int pageSize;//每页显示的数据量
    private int start;
    private int end;

    private int pageData;


//    private  String params;//查询语句参数




    public int getTotalData() {
        return totalData;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getPageData(){

        return pageData;
    }
    public int getPageSize() {
        return pageSize;
    }

    public void setTotalData(int totalData) {
        this.totalData = totalData;
    }



    public int getTotalPages() {
        int ps = totalData / pageSize;
        if (totalData % pageSize>0){
            ps++;
        }
        return ps;
    }



    public int getPageCode() {
        return pageCode;
    }

    public void setPageCode(int pageCode) {
        this.pageCode = pageCode;
    }


    public PageBean() {

    }

    public PageBean(List<T> data, int pageCode, int totalData, int pageSize) {
        this.data = data;
        this.pageCode = pageCode;
        this.totalData = totalData;
        this.pageSize = pageSize;
    }

    public PageBean(int pageCode, int totalData, int pageSize) {
        this.pageData= (pageCode-1)*pageSize;
        this.pageCode = pageCode;
        this.totalData = totalData;
        this.pageSize = pageSize;
        this.start=1;
        this.end=10;
        int ps = totalData / pageSize;
        if (totalData % pageSize>0){
            ps++;
        }
        if (ps<=10){
            this.end=ps;
        }else {
            this.start=this.pageCode-4;
            this.end=this.pageCode+5;
        }
        if (this.start<1){
            this.start=1;
            this.end=10;
        }
        if (this.end>ps){
            this.end=ps;
            this.start=totalData-9;
        }
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "data=" + data +
                ", pageCode=" + pageCode +
                ", totalData=" + totalData +
                ", pageSize=" + pageSize +
                ", start=" + start +
                ", end=" + end +
                ", pageData=" + pageData +
                '}';
    }
}
