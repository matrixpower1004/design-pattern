package com.matrix.design.decorator.ex02;

/**
 * author         : Jason Lee
 * date           : 2023-06-28
 * description    :
 */

import com.matrix.design.decorator.ex02.notification.BasicNotifier;
import com.matrix.design.decorator.ex02.notification.EmailNotifier;
import com.matrix.design.decorator.ex02.notification.Notitier;
import com.matrix.design.decorator.ex02.notification.SmsNotifier;

/**
 * 데코레이터 패턴 (장식하다)
 * (A) - > B(a) - > C(B(A))
 */
public class App {
    public static void main(String[] args) {
        Notitier notifier = new BasicNotifier();
//        notifier.send();
//        System.out.println("__end");

//        Notitier emailNotifier = new EmailNotifier();
//        emailNotifier.send();
//        System.out.println("__end");

        // email 알림만 실행하면 기본 알림도 같이 실행하고 싶다면?
//        Notitier emailNotifier = new EmailNotifier(new BasicNotifier());
//        emailNotifier.send();
//        System.out.println("__end");

//        Notitier smsNotifier = new SmsNotifier(new BasicNotifier());
//        smsNotifier.send();
//        System.out.println("__end");

        // 기본 알림, 문자 알림, Sms 알림을 동시에 보내고 싶다면
        // 1. 전체 알림 (기본알림 -> 문자알림 -> 이메일 알림)
        Notitier allNotifier = new EmailNotifier(new SmsNotifier(new BasicNotifier()));
        allNotifier.send();
        System.out.println("__end");

        // 2. 전체 알림 (기본 알림 -> 이메일 알림 -> 문자 알림)
        Notitier allNotifier2 = new SmsNotifier(new EmailNotifier(new BasicNotifier()));
        allNotifier2.send();
        System.out.println("__end");

        // 3. 전체알림 (기본 알림 ->
        Notitier allNotifier3 = new SmsNotifier(new EmailNotifier(new EmailNotifier((new BasicNotifier()))));
        allNotifier3.send();
        System.out.println("__end");

        // 4. 기본 알림
        Notitier basicNotifier = new BasicNotifier();
        basicNotifier.send();
        System.out.println("__end");

        // 5. 기본 알림 + 문자 알림
        Notitier smsNotifier = new SmsNotifier(new BasicNotifier());
        smsNotifier.send();
        System.out.println("__end");

        // 6. 기본 알림 + 이메일 알림
        Notitier emailNotifier = new EmailNotifier(new BasicNotifier());
        emailNotifier.send();
        System.out.println("__end");

        // 7. 이메일 알림만
        Notitier onlyEmailNotifier = new EmailNotifier();
        onlyEmailNotifier.send(); // notifier가 null이라서 에러가 난다.
        System.out.println("__end");

        // 7. 문자 알림만
        Notitier onlySmsNotifier = new SmsNotifier();
        onlySmsNotifier.send();
        System.out.println("__end");

        // 8. 문자 알림 + 이메일 알림
        Notitier smsAndEmailNotifier = new EmailNotifier(new SmsNotifier());
        smsAndEmailNotifier.send();
        System.out.println("__end");
    }
}
