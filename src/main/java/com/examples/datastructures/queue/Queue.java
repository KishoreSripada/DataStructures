package com.examples.datastructures.queue;

public interface Queue<T> {
    int size();
    void enQueue(T item);
    T deQueue();
    boolean contains(T item);
    T access(int position);
}