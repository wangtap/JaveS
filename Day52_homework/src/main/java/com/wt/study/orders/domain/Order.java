package com.wt.study.orders.domain;

public class Order {
    private int oid;
    private String  oname;
    private int userid;

    public Order() {
    }

    public Order(String oname, int userid) {
        this.oname = oname;
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", oname='" + oname + '\'' +
                ", userid=" + userid +
                '}';
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
