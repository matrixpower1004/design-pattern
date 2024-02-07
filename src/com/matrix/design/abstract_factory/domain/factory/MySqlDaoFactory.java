package com.matrix.design.abstract_factory.domain.factory;

import com.matrix.design.abstract_factory.domain.product.dao.ProductDao;
import com.matrix.design.abstract_factory.domain.product.dao.mysql.ProductMySqlDao;
import com.matrix.design.abstract_factory.domain.product.dao.oracle.ProductOracleDao;
import com.matrix.design.abstract_factory.domain.userinfo.dao.UserInfoDao;
import com.matrix.design.abstract_factory.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import com.matrix.design.abstract_factory.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class MySqlDaoFactory implements DaoFactory {

    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMySqlDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductMySqlDao();
    }
}
