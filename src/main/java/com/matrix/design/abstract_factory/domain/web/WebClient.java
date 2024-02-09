package com.matrix.design.abstract_factory.domain.web;

import com.matrix.design.abstract_factory.domain.factory.DaoFactory;
import com.matrix.design.abstract_factory.domain.factory.MySqlDaoFactory;
import com.matrix.design.abstract_factory.domain.factory.OracleDaoFactory;
import com.matrix.design.abstract_factory.domain.product.Product;
import com.matrix.design.abstract_factory.domain.product.dao.ProductDao;
import com.matrix.design.abstract_factory.domain.userinfo.UserInfo;
import com.matrix.design.abstract_factory.domain.userinfo.dao.UserInfoDao;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WebClient {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/com/matrix/design/abstract_factory/db.properties");
        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");
        System.out.println("DB Type: " + dbType);
        UserInfo userInfo = new UserInfo("12345", "!@#$%", "이순신");
        Product product = new Product("0011AA", "TV");

        DaoFactory daoFactory = null;
        if (dbType.equals("MYSQL")) {
            daoFactory = new MySqlDaoFactory();
        } else if (dbType.equals("ORACLE")) {
            daoFactory = new OracleDaoFactory();
        } else {
            System.out.println("error");
        }

        UserInfoDao userInfoDao = daoFactory.createUserInfoDao();
        System.out.println("==== UserInfo TRANSACTION ===");
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

        ProductDao productDao = daoFactory.createProductDao();
        System.out.println("=== Product TRANSACTION ===");
        productDao.insertProduct(product);
        productDao.updateProduct(product);
        productDao.deleteProduct(product);

    }
}
