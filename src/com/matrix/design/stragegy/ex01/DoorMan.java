package com.matrix.design.stragegy.ex01;

/**
 * author         : Jason Lee
 * date           : 2023-06-06
 * description    :
 */
public class DoorMan {

    public void kickOut(Animal a) {
        // 쫓아 내기 전에 뭔가 하나의 일을 더 하고 싶다면?
//        System.out.println("안녕 ㅎㅎ"); // 이렇게 하면 OCP 원칙을 지키지 못한 것.
        // 기존 코드를 수정하지 않고 메시지를 추가하고 싶은 것.

        System.out.println(a.getName() + " 쫓아내");
    }
}
