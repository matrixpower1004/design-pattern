package com.matrix.design.bridge.list;

import com.matrix.design.bridge.impl.AbstractList;

public class Stack<T> extends List<T> {

    public Stack(AbstractList<T> list) {
        super(list);
        System.out.println("Stack을 구현합니다.");
    }

    public void push(T obj) {
        // push는 맨 앞을 top이라고 생각하고 맨 앞에 넣는다.
        impl.insertElement(obj, 0);
    }

    public T pop() {
        return impl.deleteElement(0);
    }
}
