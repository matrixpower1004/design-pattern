package com.matrix.design.singleton.ex01;

/**
 * author         : Jason Lee
 * date           : 2023-06-06
 * description    :
 */

/**
 * 문지기를 딱 한명만 만들고 싶어요.
 */
public class DoorMan {

    // 자바에서 static은 main() 메서드를 호출하기 전에 JVM이 읽어서 메모리에 올라가는 친구
    private static DoorMan doorMan = new DoorMan();
    public static DoorMan getInstance() {
        return doorMan;
    }

    private DoorMan() {
    }


    public void kickOut(Animal a) {
        System.out.println(a.getName() + " 쫓아내");
    }
}
