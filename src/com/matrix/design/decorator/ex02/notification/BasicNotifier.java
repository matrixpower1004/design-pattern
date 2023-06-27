package com.matrix.design.decorator.ex02.notification;

/**
 * author         : Jason Lee
 * date           : 2023-06-28
 * description    :
 */

// 래퍼가 없는 데코레이터
public class BasicNotifier implements Notitier {

    // 이 친구는 뭔가를 의존하면 안 된다.
    // 데코레이터 패턴에서 가장 핵심은 의존하지 않는 친구가 하나 있어야 한다는 것이다.
    // 그러나 굳이 이렇게 만들 필요는 없다. 빈 생성자를 만들어서 if()로 처리해도 되기 때문.

    @Override
    public void send() {
        System.out.println("기본 알림");
    }
}
