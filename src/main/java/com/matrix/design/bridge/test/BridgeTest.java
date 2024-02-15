package com.matrix.design.bridge.test;

import com.matrix.design.bridge.impl.ArrayImpl;
import com.matrix.design.bridge.impl.LinkedListImpl;
import com.matrix.design.bridge.list.Queue;
import com.matrix.design.bridge.list.Stack;

public class BridgeTest {

    public static void main(String[] args) {

        Stack<String> linkedListStack = new Stack<String>(new LinkedListImpl<String>());
        linkedListStack.push("aaa");
        linkedListStack.push("bbb");
        linkedListStack.push("ccc");

        System.out.println(linkedListStack);
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());
        System.out.println("===============================================");

        Stack<String> arrayStack = new Stack<String>(new ArrayImpl<String>());
        arrayStack.add(("aaa"));
        arrayStack.add(("bbb"));
        arrayStack.add(("ccc"));

        System.out.println(arrayStack);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println("===============================================");

        Queue<String> arrayQueue = new Queue<String>(new ArrayImpl<String>());
        arrayQueue.enQueue("aaa");
        arrayQueue.enQueue("bbb");
        arrayQueue.enQueue("ccc");

        System.out.println(arrayQueue.deQueue());
        System.out.println(arrayQueue.deQueue());
        System.out.println(arrayQueue.deQueue());
        System.out.println("=========================");

        Queue<String> linkedQueue = new Queue<String>(new LinkedListImpl<String>());
        linkedQueue.enQueue("aaa");
        linkedQueue.enQueue("bbb");
        linkedQueue.enQueue("ccc");

        System.out.println(linkedQueue.deQueue());
        System.out.println(linkedQueue.deQueue());
        System.out.println(linkedQueue.deQueue());
        System.out.println("=========================");

    }
}
