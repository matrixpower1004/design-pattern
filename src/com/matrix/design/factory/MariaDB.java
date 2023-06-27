package com.matrix.design.factory;

/**
 * author         : Jason Lee
 * date           : 2023-06-28
 * description    :
 */
public class MariaDB implements DB {

    private String url;

    // 1. 쿼리 실행 매서드
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

    // 2. URL 세팅 메서드
    public void setUrl(String url) {
        this.url = url;
    }

}
