package com.matrix.design.proxy.ex02;

/**
 * author         : Jason Lee
 * date           : 2023-06-05
 * description    :
 */
public class Browser implements IBrowser {

    private String url;

    public Browser(String url) {
        this.url = url;
    }

    @Override
    public Html show() {
        System.out.println("browser loadding html from : " + url);
        return new Html(url);
    }
}
