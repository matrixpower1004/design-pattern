package com.matrix.design.singleton.ex01;

/**
 * author         : Jason Lee
 * date           : 2023-06-06
 * description    :
 */
public class App {
    public static void main(String[] args) {
        DoorMan doorMan = DoorMan.getInstance();
        doorMan.kickOut(new Cat());
    }
}
