package ua.edu.ucu.collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    
    @Test
    public void testQueue() {
        Queue queue = new Queue(5);
        queue.enqueue(6);
        queue.dequeue();
        queue.enqueue(4);
        assertEquals(6, queue.peek());
    }
    
}
