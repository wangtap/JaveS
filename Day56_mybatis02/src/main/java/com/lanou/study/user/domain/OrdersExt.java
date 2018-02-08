package com.lanou.study.user.domain;

public class OrdersExt  extends Orders{
    private String username;
    private String address;

    @Override
    public String toString() {
        return super.toString()+
                "OrdersExt{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}
