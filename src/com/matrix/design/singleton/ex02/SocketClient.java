package com.matrix.design.singleton.ex02;

/**
 * author         : Jason Lee
 * date           : 2023-06-05
 * description    :
 */
public class SocketClient {
    private static SocketClient socketClient = null;

    public SocketClient() {
    }

    public static SocketClient getInstance() {
        if (socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
