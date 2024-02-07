package com.matrix.design.abstract_factory.domain.product.dao.mysql;

import com.matrix.design.abstract_factory.domain.product.Product;
import com.matrix.design.abstract_factory.domain.product.dao.ProductDao;

public class ProductMySqlDao implements ProductDao {

    @Override
    public void insertProduct(Product product) {
        System.out.println("insert into MySQL DB productId = " + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("update into MySQL DB productId = " + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("delete into MySQL DB productId = " + product.getProductId());
    }
}
