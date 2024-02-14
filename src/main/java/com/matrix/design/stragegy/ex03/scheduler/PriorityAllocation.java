package com.matrix.design.stragegy.ex03.scheduler;

public class PriorityAllocation implements Scheduler  {

    @Override
    public void getNextCall() {
        System.out.println("등급이 높은 고객의 전화를 먼저 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 스킬이 높은 상담원에게 우선적으로 배분합니다.");
    }
}
