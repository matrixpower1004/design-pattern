package com.matrix.design.decorator.ex01;

/**
 * author         : Jason Lee
 * date           : 2023-06-05
 * description    :
 */
public class Audi implements ICar {

    private int price;

    public Audi(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void showPrice() {
        System.out.println("Audi의 가격은 " + this.price + " 원 입니다.");
    }
}
