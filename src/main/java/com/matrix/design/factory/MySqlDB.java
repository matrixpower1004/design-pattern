package com.matrix.design.factory;

/**
 * author         : Jason Lee
 * date           : 2023-06-28
 * description    :
 */
public class MySqlDB implements DB {

    private String url;

    @Override
    public int execute(String sql) {
        if (url == null) {
            throw new NullPointerException("db driver not found exception");
        }

        if (sql.equals("select") && url != null) {
            System.out.println("query execute : " + url + sql);
            return 1;
        } else {
            System.out.println("query failed : syntax error");
            return -1;
        }
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }
}
