package com.matrix.design.aop;

import com.matrix.design.proxy.ex02.IBrowser;

import java.util.concurrent.atomic.AtomicLong;

/**
 * author         : Jason Lee
 * date           : 2023-06-05
 * description    :
 */
public class AopMain {
    public static void main(String[] args) {

        // 동시성 문제 때문에 Atomic을 사용.
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
        );

        aopBrowser.show();
        System.out.println("loading time : " + end.get());

        // 두번째 호출했을 때는 어떻게 되는지 확인해 보자.
        aopBrowser.show();
        System.out.println("loading time : " + end.get());
    }
}
