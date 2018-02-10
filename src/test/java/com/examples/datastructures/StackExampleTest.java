package com.examples.datastructures;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class StackExampleTest {

    @Mock
    private StackExample stack = new StackExample(3);

    @Before
    public void setup() {
        initializeStack();
    }

    private void initializeStack() {
        stack.push("1");
        stack.push("2");
        stack.push("3");
    }

    @Test
    public void push_items_to_stack_returns_correct_size() {
        Assert.assertEquals(3, stack.size());
    }

    @Test
    public void pop_returns_items_in_last_in_first_out_order() {
        Assert.assertEquals("3", stack.pop());
        Assert.assertEquals("2", stack.pop());
        Assert.assertEquals("1", stack.pop());
    }
}