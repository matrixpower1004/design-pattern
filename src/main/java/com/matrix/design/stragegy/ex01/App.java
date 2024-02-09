package com.matrix.design.stragegy.ex01;

/**
 * author         : Jason Lee
 * date           : 2023-06-06
 * description    :
 */
public class App {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        DoorMan dm = new DoorMan();

        dm.kickOut(m);
        dm.kickOut(c);
    }
}
