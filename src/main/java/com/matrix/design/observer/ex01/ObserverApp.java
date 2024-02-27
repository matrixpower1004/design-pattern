package com.matrix.design.observer.ex01;

/**
 * author         : Jason Lee
 * date           : 2023-06-06
 * description    :
 */
public class ObserverApp {
    public static void main(String[] args) {
        Button button = new Button("버튼");
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });

        button.click("메시지 전달 : click");
        button.click("메시지 전달 : click2");
        button.click("메시지 전달 : click3");
        button.click("메시지 전달 : click4");
    }
}
