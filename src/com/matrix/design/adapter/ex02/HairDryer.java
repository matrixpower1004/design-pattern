package com.matrix.design.adapter.ex02;

/**
 * author         : Jason Lee
 * date           : 2023-06-05
 * description    :
 */
public class HairDryer implements Electronic110V {

    @Override
    public void powerOn() {
        System.out.println("헤어 드라이기 110v on");
    }
}
