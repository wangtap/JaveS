package com.wt.study.domain;

public class UserCustom extends User {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
