package com.matrix.design.iterator;

/**
 * author         : Jason Lee
 * date           : 2023-06-27
 * description    :
 */
public class MainEntry {
    public static void main(String[] args) {
        Item[] items = {
                new Item("CPU", 100),
                new Item("Memory", 200),
                new Item("Mouse", 300),
                new Item("HDD", 50)
        };

        Array array = new Array(items);
        Iterator it = array.iterator();

        while (it.next()) {
            Item item = (Item) it.current();
            System.out.println(item);
        }
    }
}
