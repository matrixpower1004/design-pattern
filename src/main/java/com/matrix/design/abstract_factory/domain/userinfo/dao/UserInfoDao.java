package com.matrix.design.abstract_factory.domain.userinfo.dao;

import com.matrix.design.abstract_factory.domain.userinfo.UserInfo;

public interface UserInfoDao {

    void insertUserInfo(UserInfo userInfo);

    void updateUserInfo(UserInfo userInfo);

    void deleteUserInfo(UserInfo userInfo);

}
