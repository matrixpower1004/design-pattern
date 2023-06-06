package com.matrix.design.proxy.ex02;

/**
 * author         : Jason Lee
 * date           : 2023-06-05
 * description    :
 */
public class ProxyApp {
    public static void main(String[] args) {
//        Browser browser = new Browser("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();
        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();



    }

}
