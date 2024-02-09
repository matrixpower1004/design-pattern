package com.matrix.design.decorator.ex01;

/**
 * author         : Jason Lee
 * date           : 2023-06-05
 * description    :
 */
public class AudiA4 extends AudiDecorator {

    public AudiA4(ICar iCar, String modelName) {
        super(iCar, modelName, 2000);
    }
}
