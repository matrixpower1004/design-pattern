package com.matrix.design.abstract_factory.domain.factory;

import com.matrix.design.abstract_factory.domain.product.dao.ProductDao;
import com.matrix.design.abstract_factory.domain.userinfo.dao.UserInfoDao;

public interface DaoFactory {
    UserInfoDao createUserInfoDao();

    ProductDao createProductDao();
}
