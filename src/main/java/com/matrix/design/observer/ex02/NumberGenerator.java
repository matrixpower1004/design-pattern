package com.matrix.design.observer.ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Observer를 관리하는 역할
public abstract class NumberGenerator {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator<Observer> ir = observers.iterator();
        while (ir.hasNext()) {
            Observer observer = ir.next();
            observer.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();

}
