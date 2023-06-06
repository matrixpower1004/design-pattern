package com.matrix.design.proxy.ex01;


/**
 * author         : Jason Lee
 * date           : 2023-06-06
 * description    :
 */
// extends 하는 방법도 있고 Composition 하는 방법도 있다.
public class DoorManProxy1 extends DoorMan {
    public void kickOut(Animal a) {
        System.out.println("안녕");
        super.kickOut(a);
    }
}
