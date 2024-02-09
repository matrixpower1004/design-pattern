package com.matrix.design.decorator.ex01;

/**
 * author         : Jason Lee
 * date           : 2023-06-05
 * description    :
 */
public class AudiA5 extends AudiDecorator {

    public AudiA5(ICar iCar, String modelName) {
        super(iCar, modelName, 3000);
    }
}
