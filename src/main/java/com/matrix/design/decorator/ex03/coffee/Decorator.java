package com.matrix.design.decorator.ex03.coffee;

// new 해서 쓸일이 없다. abstract로 생성.
public abstract class Decorator extends Coffee {

    // 혼자 동작하지 못하기 때문에 Coffee 객체를 가지고 있어야 한다.
    Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
