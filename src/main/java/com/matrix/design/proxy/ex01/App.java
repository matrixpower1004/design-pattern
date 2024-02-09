package com.matrix.design.proxy.ex01;

/**
 * author         : Jason Lee
 * date           : 2023-06-06
 * description    :
 */
public class App {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
//        DoorMan dm = new DoorManProxy1(); // extends 를 이용

        DoorManProxy2 dm = new DoorManProxy2(new DoorMan()); // Composition
        dm.kickOut(m);
        dm.kickOut(c);
    }
}
