package com.example.demo.domain;

public class UserQuarm {

    String userName;
    String isAdmin;
    String userStatus;

    public UserQuarm() {
        this.userName = "";
        this.isAdmin = "";
        this.userStatus = "";
    }

    public UserQuarm(String userName, String isAdmin, String userStatus) {
        this.userName = userName;
        this.isAdmin = isAdmin;
        this.userStatus = userStatus;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
}
