package com.matrix.design.iterator;

/**
 * author         : Jason Lee
 * date           : 2023-06-27
 * description    :
 */
public class Item {
    private String name;
    private int cost;

    public Item(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
