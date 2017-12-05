package com.company;

/**
 * Created by travelround on 17/5/8.
 */
// 1、定义联系人类Contact�?
// 属�?�变量：姓名、�?�别、电话号码�?�住�?、分组名称�??
// 方法：构造方法（姓名、电话号码）、显示联系人信息
public class Contact {

    private String name;
    private String sex;
    private String phone;
    private String address;
    private String group;

    public Contact(String name, String phone,String sex,  String adress, String group) {
        this.name = name;
        this.sex = sex;
        this.phone = phone;
//        this.address = address;
        this.group = group;
    }
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Contact{}";
    }


    public void info() {
        System.out.print("姓名是：" +name  +  "  电话是： "+ phone );
        if (null != sex) {
            System.out.print("  性别是： "+sex  );
        }
        if (null != address) {
            System.out.print( "  地址是： "+address );
        }
        if (null != group) {
            System.out.print("  分组是： "+group  );
        }
        System.out.println();
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}