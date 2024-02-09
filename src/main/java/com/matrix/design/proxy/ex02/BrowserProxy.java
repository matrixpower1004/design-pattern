package com.matrix.design.proxy.ex02;

/**
 * author         : Jason Lee
 * date           : 2023-06-05
 * description    :
 */
public class BrowserProxy implements IBrowser {

    private String url;
    private Html html; // Html 캐싱

    public BrowserProxy(String url) {
        this.url = url;
    }

    @Override
    public Html show() {

        if (html == null) {
            this.html = new Html(url);
            System.out.println("BrowserProxy loading html from : " + url);
        }
        System.out.println("BrowserProxy use cached html : " + url);
        return html;
    }
}
