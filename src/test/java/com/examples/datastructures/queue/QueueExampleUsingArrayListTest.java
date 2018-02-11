package com.examples.datastructures.queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class QueueExampleUsingArrayListTest {

    @Mock
    private Queue<String> queue = new QueueExampleUsingArrayList<String>();

    @Before
    public void setup() {
        initializeQueue();
    }

    private void initializeQueue() {
        queue.enQueue("CableCarCabin-1");
        queue.enQueue("CableCarCabin-2");
        queue.enQueue("CableCarCabin-3");
        queue.enQueue("CableCarCabin-4");
        queue.enQueue("CableCarCabin-5");
        queue.enQueue("CableCarCabin-6");
        queue.enQueue("CableCarCabin-7");
        queue.enQueue("CableCarCabin-8");
        queue.enQueue("CableCarCabin-9");
        queue.enQueue("CableCarCabin-10");
    }

    @Test
    public void push_items_to_queue_returns_correct_size() {
        Assert.assertEquals(10, queue.size());
    }

    @Test
    public void check_if_items_are_present_in_queue() {
        Assert.assertEquals(true, queue.contains("CableCarCabin-8"));
        Assert.assertEquals(true, queue.contains("CableCarCabin-5"));
        Assert.assertEquals(true, queue.contains("CableCarCabin-1"));
        Assert.assertEquals(false, queue.contains("CableCarCabin-28"));
    }

    @Test
    public void access_a_specific_card() {
        Assert.assertEquals("CableCarCabin-1", queue.access(0));
        Assert.assertEquals(10, queue.size());
    }

    @Test
    public void pop_few_cards_should_return_correct_size() {
        Assert.assertEquals(10, queue.size());
        queue.deQueue();
        queue.deQueue();
        Assert.assertEquals(8, queue.size());
    }

    @Test
    public void pop_first_card_should_be_last_card_inserted() {
        Assert.assertEquals(10, queue.size());
        // Pop should remove the last pushed item, which is 1
        Assert.assertEquals("CableCarCabin-1", queue.deQueue());
        Assert.assertEquals(9, queue.size());
    }

    public void clearQueue() {
        while(queue.size()>0) queue.deQueue();
    }

    @Test(expected = IllegalStateException.class)
    public void dequeue_when_no_elements_in_queue_should_throw_exception() {
        clearQueue();
        queue.deQueue();
    }

    @Test
    public void contains_when_no_elements_in_queue_should_return_false() {
        clearQueue();
        Assert.assertEquals(false, queue.contains("123"));
    }

    @Test(expected = IllegalStateException.class)
    public void access_when_no_elements_in_queue_should_throw_exception() {
        clearQueue();
        queue.access(150);
    }
}