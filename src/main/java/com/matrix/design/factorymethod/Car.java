package com.matrix.design.factorymethod;

public abstract class Car {

    CarType carType;

    public String getCarName() {
        return carType.getCarName();
    }
}
