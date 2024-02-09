package com.matrix.design.singleton.ex02;

/**
 * author         : Jason Lee
 * date           : 2023-06-05
 * description    :
 */
public class AClazz {

    private SocketClient socketClient;

    public AClazz() {
        this.socketClient = SocketClient.getInstance();
//        this.socketClient = new SocketClient();
    }


    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
