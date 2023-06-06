package com.matrix.design.decorator;

/**
 * author         : Jason Lee
 * date           : 2023-06-05
 * description    :
 */
public class AudiA3 extends AudiDecorator {

    public AudiA3(ICar iCar, String modelName) {
        super(iCar, modelName, 1000);
    }
}
