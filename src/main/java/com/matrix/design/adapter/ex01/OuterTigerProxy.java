package com.matrix.design.adapter.ex01;

/**
 * author         : Jason Lee
 * date           : 2023-06-06
 * description    :
 */
// 아직 OuterTiger가 만들어지지 않았을 때 가짜호랑이로 대체
public class OuterTigerProxy extends Animal {

    private String fullName = "가짜호랑이";

    @Override
    public String getName() {
        return fullName;
    }
}
