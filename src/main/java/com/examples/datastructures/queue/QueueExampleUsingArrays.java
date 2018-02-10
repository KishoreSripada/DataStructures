package com.examples.datastructures.queue;

public class QueueExampleUsingArrays<T> {
    private T[] data;
    private int front;
    private int end;

    public QueueExampleUsingArrays() {
        this(1000);
    }

    public QueueExampleUsingArrays(int size) {
        data = (T[]) new Object[size];
        this.front = -1;
        this.end = -1;
    }

    public int size() {

        if ( front == -1 && end == -1) {
            return 0;
        }
        else {
            return this.end - this.front + 1;
        }
    }

    public void enQueue(T item) {
        if ( (end +1)% data.length == front) {
            throw new IllegalStateException("The Queue is full !!!");
        } else if (size()==0) {
            front++;
            end++;
            data[end] = item;
        } else {
            end++;
            data[end]=item;
        }
    }

    public T deQueue() {
        T item;
        if ( size()==0) {
            throw new IllegalStateException("The Queue is empty !!!");
        } else if (front == end ) {
            item = data[front];
            data[front] = null;
            front = -1;
            end = -1;
        } else {
            item = data[front];
            data[front] = null;
            front++;
        }
        return item;
    }

    public boolean contains(T item) {
        boolean contains = false;

        if ( size() == 0) return contains;

        for (int i=front; i<end; i++) {
            if ( data[i] == item) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    public T access(int position) {
        if ( size()==0 || position > size()) {
            throw new IllegalStateException("position is out of range");
        }
        int index=0;
        for ( int i=front; i<end; i++) {
            if ( index == position) {
                return data[i];
            }
            index++;
        }
        throw new IllegalStateException("Could not get item at position: "+ position);
    }
}