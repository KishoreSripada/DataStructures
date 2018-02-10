package com.examples.datastructures.stack;

import java.util.ArrayList;

public class StackExampleUsingArrayList<T> implements Stack<T> {

    private ArrayList<T> stackData;
    private int stackPointer;

    public StackExampleUsingArrayList() {
        stackData = new ArrayList<T>();
        stackPointer = 0;
    }

    public void push(T newItem)
    {
        stackData.add(newItem);
        stackPointer++;
    }

    public T pop() {
        if ( stackPointer == 0) {
            throw new IllegalStateException("No more items on stack");
        }
        return stackData.remove(--stackPointer);
    }

    public boolean contains(T item) {
        boolean contains = false;

        for ( int i =0 ; i < stackData.size(); i++)
            if (stackData.get(i).equals(item)) {
                contains = true;
                break;
            }
        return contains;
    }

    public T access(T item) {
        while(!stackData.isEmpty()) {
            T tmpItem = pop();
            if(item.equals(tmpItem)) {
                return tmpItem;
            }
        }

        throw new IllegalArgumentException("Could not find item on stack manager");
    }

    public int size() {
        return stackData.size();
    }
}