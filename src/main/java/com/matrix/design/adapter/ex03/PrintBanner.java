package com.matrix.design.adapter.ex03;

public class PrintBanner implements Print {

    private final Banner banner;

    public PrintBanner(final String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeek() {
        banner.showWithParenthesis();
    }

    @Override
    public void printStrong() {
        banner.showWithAsterisk();
    }
}
