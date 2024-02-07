package com.matrix.design.abstract_factory.domain.userinfo.dao.mysql;

import com.matrix.design.abstract_factory.domain.userinfo.UserInfo;
import com.matrix.design.abstract_factory.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into MYSQL DB userId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into MYSQL DB userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete into MYSQL DB userId = " + userInfo.getUserId());
    }
}
