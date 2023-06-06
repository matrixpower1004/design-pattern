package com.matrix.design.proxy.ex01;


/**
 * author         : Jason Lee
 * date           : 2023-06-06
 * description    :
 */
public class DoorManProxy2 {

    // Composition
    private DoorMan doorMan;

    public DoorManProxy2(DoorMan doorMan) {
        this.doorMan = doorMan;
    }

    public void kickOut(Animal a) {
        System.out.println("안녕");
        doorMan.kickOut(a);
    }
}
