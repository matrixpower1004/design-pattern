package com.matrix.design.decorator.ex02.notification;

/**
 * author         : Jason Lee
 * date           : 2023-06-28
 * description    :
 */
public class EmailNotifier implements Notitier{

    // composition 받기
    private Notitier notifier;

    public EmailNotifier() {
    }

    public EmailNotifier(Notitier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        if (notifier != null){ notifier.send();}
        System.out.println("이메일 알림");
    }
}
