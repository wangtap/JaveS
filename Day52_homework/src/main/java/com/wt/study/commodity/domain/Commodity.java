package com.wt.study.commodity.domain;

public class Commodity {
    private int cid;
    private String cname;
    private int cprice;

    public Commodity(String cname, int cprice) {
        this.cname = cname;
        this.cprice = cprice;
    }

    public Commodity() {
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", cprice=" + cprice +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCprice() {
        return cprice;
    }

    public void setCprice(int cprice) {
        this.cprice = cprice;
    }
}
