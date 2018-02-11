package com.examples.datastructures.queue;

import java.util.ArrayList;
import java.util.List;

public class QueueExampleUsingArrayList<T> implements Queue<T> {
    private List<T> data;
    private int front;
    private int end;

    public QueueExampleUsingArrayList() {
        data = new ArrayList<T>();
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
        if (size()==0) {
            front++;
            end++;
            data.add(end, item);
        } else {
            end++;
            data.add(end, item);
        }
    }

    public T deQueue() {
        T item;
        if ( size()==0) {
            throw new IllegalStateException("The Queue is empty !!!");
        } else if (front == end ) {
            item = data.get(front);
            front = -1;
            end = -1;
        } else {
            item = data.get(front);
            front++;
        }
        return item;
    }

    public boolean contains(T item) {
        boolean contains = false;

        if ( size() == 0) return contains;

        for (int i=front; i<end; i++) {
            if ( data.get(i) == item) {
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
                return data.get(i);
            }
            index++;
        }
        throw new IllegalStateException("Could not get item at position: "+ position);
    }
}