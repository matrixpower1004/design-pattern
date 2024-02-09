package com.matrix.design.abstract_factory.domain.userinfo;

public class UserInfo {

    private String userId;
    private String password;
    private String userName;

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public UserInfo() {
    }

    public UserInfo(
        String userId,
        String password,
        String userName
    ) {
        this.userId = userId;
        this.password = password;
        this.userName = userName;
    }
}
