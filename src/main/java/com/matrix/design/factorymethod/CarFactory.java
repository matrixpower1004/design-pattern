package com.matrix.design.factorymethod;

public abstract class CarFactory {

    public abstract Car createCar(CarType carType);

    public abstract Car returnCar(String name);

    public void numbering() {
        System.out.println("numbering");
    }
    public void washCar() {
        System.out.println("washCar");
    }
    final public void sellCar(CarType carType) {
        numbering();
        createCar(carType);
        washCar();
        System.out.println("Sell car: " + carType.getCarName());
    }
}
