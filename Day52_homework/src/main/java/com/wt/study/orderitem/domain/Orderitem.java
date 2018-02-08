package com.wt.study.orderitem.domain;

public class Orderitem {
    private int iid;
    private  int oid;
    private  int cid;
    private int count;
    private int subtotal;


    public Orderitem(int oid, int userid, int count, int subtotal) {
        this.oid = oid;
        this.cid = userid;
        this.count = count;
        this.subtotal = subtotal;
    }

    public Orderitem() {

    }

    @Override
    public String toString() {
        return "Orderitem{" +
                "iid=" + iid +
                ", oid=" + oid +
                ", cid=" + cid +
                ", count=" + count +
                ", subtotal=" + subtotal +
                '}';
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
}
