package com.matrix.design.adapter.ex02;

public class Cleaner implements Electronic220V {

    @Override
    public void connect() {
        System.out.println("청소기 220V on");
    }
}
