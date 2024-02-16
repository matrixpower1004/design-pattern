package com.matrix.design.decorator.ex03.coffee;

public class CoffeeTest {

    public static void main(String[] args) {

        Coffee keynaCoffee = new KenyaAmericano();
        keynaCoffee.brewing();
        System.out.println();

        Coffee kenyaLatte = new Latte(keynaCoffee);
        kenyaLatte.brewing();
        System.out.println();

        Coffee mochaKenya = new MochaCoffee(new Latte(new KenyaAmericano()));
        mochaKenya.brewing();
        System.out.println();

        Coffee ehiopiaCoffee = new MochaCoffee(new Latte(new EthiopiaAmericano()));
        ehiopiaCoffee.brewing();
    }

}
