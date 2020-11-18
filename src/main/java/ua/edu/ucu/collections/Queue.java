package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
    private ImmutableLinkedList list;

    public Queue(Object e) {
        list = new ImmutableLinkedList(e);
    }

    void enqueue(Object e) {
        list = list.addLast(e);
    }

    Object dequeue() {
        Object toBeRemoved = list.getFirst();
        list = list.removeFirst();
        return toBeRemoved;
    }

    Object peek() {
        return list.getFirst();
    }
}
