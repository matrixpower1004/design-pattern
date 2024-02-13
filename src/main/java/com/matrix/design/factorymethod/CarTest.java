package com.matrix.design.factorymethod;

public class CarTest {

    public static void main(String[] args) {

        CarFactory factory = new HyundaiCarFactory();
        Car newCar = factory.createCar(CarType.SONATA);

        System.out.println(newCar.getCarName());

        Car myCar = factory.returnCar("Tomas");
        Car hisCar = factory.returnCar("Tomas");
        System.out.println(myCar == hisCar);

        factory.sellCar(CarType.SONATA);
    }
}
