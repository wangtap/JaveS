package com.wt.study.domain;

public class Order extends CrmStaff {

    private String postName;
    private String postId;

    @Override
    public String toString() {
         return "Order{" +
                "postName='" + postName + '\'' +
                ", postId='" + postId + '\'' +
                '}';
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }
}
