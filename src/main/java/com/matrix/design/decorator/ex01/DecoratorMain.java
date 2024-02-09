package com.matrix.design.decorator.ex01;

/**
 * author         : Jason Lee
 * date           : 2023-06-05
 * description    :
 */
public class DecoratorMain {
    public static void main(String[] args) {
        ICar audi = new Audi(1000);
        audi.showPrice();

        // a3
        ICar audiA3 = new AudiA3(audi, "A3");
        audiA3.showPrice();

        // a4
        ICar audiA4 = new AudiA4(audi, "A4");
        audiA4.showPrice();

        // a5
        ICar audiA5 = new AudiA5(audi, "A5");
        audiA5.showPrice();
    }
}
