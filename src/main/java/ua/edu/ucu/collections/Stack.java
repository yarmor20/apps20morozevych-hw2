package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList list;

    public Stack(Object e) {
        list = new ImmutableLinkedList(e);
    }

    void push(Object e) {
        list = list.addLast(e);
    }

    Object pop() {
        Object toBePopped = list.getLast();
        list = list.removeLast();
        return toBePopped;
    }

    Object peek() {
        return list.getLast();
    }
}
