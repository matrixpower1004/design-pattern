package com.matrix.design.factorymethod;

import java.util.function.Supplier;
import lombok.Getter;

@Getter
public enum CarType {
    SONATA("Sonata", () -> {
        return new Sonata();
    }),
    SANTAFE("Santafe", () -> {
        return new Santafe();
    });

    final String carName;
    final Supplier<Car> makeCar;

    CarType(String carName, Supplier<Car> makeCar) {
        this.carName = carName;
        this.makeCar = makeCar;
    }
}
