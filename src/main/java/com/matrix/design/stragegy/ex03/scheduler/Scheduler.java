package com.matrix.design.stragegy.ex03.scheduler;

public interface Scheduler {

    // 상담원이 콜을 가져온다.
    void getNextCall();

    // 상담원에게 콜을 어떻게 줄것인지 여부
    void sendCallToAgent();
}
