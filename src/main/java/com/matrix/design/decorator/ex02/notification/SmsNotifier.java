package com.matrix.design.decorator.ex02.notification;

/**
 * author         : Jason Lee
 * date           : 2023-06-28
 * description    :
 */
public class SmsNotifier implements Notitier {

    private Notitier notifier;

    public SmsNotifier() {
    }

    public SmsNotifier(Notitier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        if (notifier != null){ notifier.send();}
        System.out.println("문자 알림");
    }
}
