package com.matrix.design.factory;

/**
 * author         : Jason Lee
 * date           : 2023-06-28
 * description    :
 */
public interface DB {

    public int execute(String sql);
    public void setUrl(String url);
}
