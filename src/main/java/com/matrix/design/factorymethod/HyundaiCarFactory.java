package com.matrix.design.factorymethod;

import java.util.HashMap;

public class HyundaiCarFactory extends CarFactory {

    HashMap<String, Car> carMap = new HashMap<String, Car>();

    @Override
    public Car createCar(CarType carType) {
        return carType.makeCar.get();
    }

    public Car returnCar(String name) {
        Car car = carMap.get(name);
        if (car != null) {
            return car;
        }
        if (name.equals("Tomas")) {
            car = new Sonata();
        } else if (name.equals("James")) {
            car = new Santafe();
        }
        carMap.put(name, car);
        return car;
    }
}
