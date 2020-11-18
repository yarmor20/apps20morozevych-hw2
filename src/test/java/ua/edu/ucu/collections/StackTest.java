package ua.edu.ucu.collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    
    @Test
    public void testStack() {
        Stack stack = new Stack(3);
        stack.push(4);
        stack.push(5);

        assertEquals(5, stack.peek());
        assertEquals(5, stack.pop());
        assertNotEquals(5, stack.peek());
        assertEquals(4, stack.pop());
        assertEquals(3, stack.pop());
    }
    
}
