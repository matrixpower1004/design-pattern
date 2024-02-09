package com.matrix.design.singleton.ex03;

public class ConnectionPool {

    private static ConnectionPool instance = new ConnectionPool();

    private ConnectionPool() {

    }

    public static ConnectionPool getInstance() {
        if (instance == null) {
            return new ConnectionPool();
        }
        return instance;
    }
}
