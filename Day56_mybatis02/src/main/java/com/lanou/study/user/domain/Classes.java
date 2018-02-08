package com.lanou.study.user.domain;

public class Classes {
    private int cid;
    private String name;
    private String sex;

    public Classes() {
    }

    public Classes(int cid, String name, String sex) {
        this.cid = cid;
        this.name = name;
        this.sex = sex;
    }


    public Classes(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
