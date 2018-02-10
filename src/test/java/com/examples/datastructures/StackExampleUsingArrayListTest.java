package com.examples.datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;

public class StackExampleUsingArrayListTest {

    @Mock
    private StackExampleUsingArrayList<String> stack = new StackExampleUsingArrayList<String>();

    @Before
    public void setup() {
        initializeStack();
    }

    private void initializeStack() {
        stack.push("Ace");
        stack.push("King");
        stack.push("Queen");
        stack.push("Jackie");
        stack.push("10");
        stack.push("9");
        stack.push("8");
        stack.push("7");
        stack.push("6");
        stack.push("5");
        stack.push("4");
        stack.push("3");
        stack.push("2");
        stack.push("1");
    }

    @Test
    public void push_items_to_stack_returns_correct_size() {
        Assert.assertEquals(14, stack.size());
    }

    @Test
    public void check_if_items_are_present_in_stack() {
        Assert.assertEquals(true, stack.contains("3"));
        Assert.assertEquals(true, stack.contains("Jackie"));
        Assert.assertEquals(true, stack.contains("Ace"));
        Assert.assertEquals(false, stack.contains("Joker"));
    }

    @Test
    public void access_a_specific_card() {
        Assert.assertEquals("3", stack.access("3"));
        Assert.assertEquals(11, stack.size());
    }

    @Test
    public void pop_few_cards_should_return_correct_size() {
        Assert.assertEquals(14, stack.size());
        stack.pop();
        stack.pop();
        Assert.assertEquals(12, stack.size());
    }

    @Test
    public void pop_first_card_should_be_last_card_inserted() {
        Assert.assertEquals(14, stack.size());
        // Pop should remove the last pushed item, which is 1
        Assert.assertEquals("1", stack.pop());
        Assert.assertEquals(13, stack.size());
    }

}