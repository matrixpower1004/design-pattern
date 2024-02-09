package com.matrix.design.abstract_factory.domain.factory;

import com.matrix.design.abstract_factory.domain.product.dao.ProductDao;
import com.matrix.design.abstract_factory.domain.product.dao.oracle.ProductOracleDao;
import com.matrix.design.abstract_factory.domain.userinfo.dao.UserInfoDao;
import com.matrix.design.abstract_factory.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class OracleDaoFactory implements DaoFactory {

    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoOracleDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductOracleDao();
    }
}
