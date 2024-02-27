package com.matrix.design.observer.ex02;

import java.util.Random;
import javax.management.openmbean.InvalidOpenTypeException;

public class RandomNumberGenerator extends NumberGenerator {

    private final Random random = new Random();
    private int number;

    @Override
    public int getNumber() {

        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
