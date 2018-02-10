package com.examples.datastructures;

public class StackExample<T> {

    private T[] stackData;
    private int stackPointer;

    public StackExample() {
        stackData = (T[]) new Object[1000];
        stackPointer = 0;
    }

    public StackExample(int testDataSize) {
        stackData = (T[]) new Object[testDataSize];
        stackPointer = 0;
    }

    public void push(T newItem) {
        stackData[stackPointer++] = newItem;
    }

    public T pop() {
        if ( stackPointer == 0) {
            throw new IllegalStateException("No more items on stack");
        }
        return stackData[--stackPointer];
    }

    public boolean contains(T item) {
        boolean contains = false;

        for ( int i =0 ; i < stackData.length; i++)
            if (stackData[i] == item) {
                contains = true;
                break;
            }
        return contains;
    }

    public T access(T item) {
        T returnItem = null;
        while ( stackPointer > 0 ) {
            T tmpItem = pop();
            if(item.equals(tmpItem)) {
                return tmpItem;
            }
        }
        throw new IllegalArgumentException("Could not find item on stack manager");
    }

    public static void main(String[] args) {

    }

    public int size() {
        return stackPointer;
    }
}