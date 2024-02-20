package com.matrix.design.adapter.ex03;

public class Banner {

    private final String string;
    public Banner(final String string) {
        this.string = string;
    }

    public void showWithParenthesis() {
        System.out.println("(" + string + ")");
    }

    public void showWithAsterisk() {
        System.out.println("*" + string + "*");
    }
}
