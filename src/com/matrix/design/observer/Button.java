package com.matrix.design.observer;

/**
 * author         : Jason Lee
 * date           : 2023-06-06
 * description    :
 */
public class Button {

    private String name;
    private IButtonListener buttonListener;

    public Button(String name) {
        this.name = name;
    }

    public void click(String message) {
        buttonListener.clickEvent(message);
    }

    public void addListener(IButtonListener buttonListener) {
        this.buttonListener = buttonListener;
    }
}
