package com.matrix.design.adapter.ex02;

/**
 * author         : Jason Lee
 * date           : 2023-06-05
 * description    :
 */

// 220V가 들어와서 100V로 나가야 하기 때문에 기본적으로 110V를 상속받아야 한다.
// 자신의 형태는 110V.
public class SocketAdapter implements Electronic110V {

    private Electronic220V electronic220V;

    public SocketAdapter(Electronic220V electronic220V) {
        this.electronic220V = electronic220V;
    }
    @Override
    public void powerOn() {
        // 110V에 220V가 할당이 되었을 때 220V의 connect()를 호출해 준다.
        electronic220V.connect();
    }
}
