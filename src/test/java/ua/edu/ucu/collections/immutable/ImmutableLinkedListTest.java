package ua.edu.ucu.collections.immutable;

import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableLinkedListTest {
    
    @Test
    public void testAdd() {
        int val = 1;
        ImmutableList linkedList = new ImmutableLinkedList(val);
        ImmutableList newLinkedList = linkedList.add(12);

        Object[] expectedResult = {1, 12};
        assertArrayEquals(expectedResult, newLinkedList.toArray());
    }

    @Test
    public void testAddByIndex() {
        int val = 1;
        ImmutableList linkedList = new ImmutableLinkedList(val);
        ImmutableList newLinkedList = linkedList.add(12);
        ImmutableList newLinkedList2 = newLinkedList.add(1, 15);

        Object[] expectedResult = {1, 15, 12};
        assertArrayEquals(expectedResult, newLinkedList2.toArray());
    }

    @Test
    public void testAddAll() {
        int val = 1;
        ImmutableList linkedList = new ImmutableLinkedList(val);
        ImmutableList newLinkedList = linkedList.add(12);
        Object[] array =  {9, 2, 5};
        newLinkedList = newLinkedList.addAll(array);

        Object[] expectedResult = {1, 12, 9, 2, 5};
        assertArrayEquals(expectedResult, newLinkedList.toArray());

        Object[] expectedResult2 = {1, 12, 9, 2, 5, 6};
        newLinkedList = newLinkedList.add(6);
        assertArrayEquals(expectedResult2, newLinkedList.toArray());
    }

    @Test
    public void testAddAllByIndex() {
        int val = 1;
        ImmutableList linkedList = new ImmutableLinkedList(val);
        ImmutableList newLinkedList = linkedList.add(12);
        Object[] array =  {9, 2, 5};
        newLinkedList = newLinkedList.addAll(0, array);

        Object[] expectedResult = {9, 2, 5, 1, 12};
        assertArrayEquals(expectedResult, newLinkedList.toArray());

        Object[] expectedResult2 = {9, 2, 5, 1, 12, 6};
        newLinkedList = newLinkedList.add(6);
        assertArrayEquals(expectedResult2, newLinkedList.toArray());
    }

    @Test
    public void testGet() {
        int val = 1;
        ImmutableList linkedList = new ImmutableLinkedList(val);
        ImmutableList newLinkedList = linkedList.add(12);
        Object[] array =  {9, 2, 5};
        newLinkedList = newLinkedList.addAll(0, array);

        assertEquals(1, newLinkedList.get(3));
    }

    @Test
    public void testRemove() {
        int val = 1;
        ImmutableList linkedList = new ImmutableLinkedList(val);
        ImmutableList newLinkedList = linkedList.add(12);
        Object[] array =  {9, 2, 5};
        newLinkedList = newLinkedList.addAll(1, array);

        Object[] expectedResult = {1, 9, 2, 12};
        assertArrayEquals(expectedResult, newLinkedList.remove(3).toArray());
    }

    @Test
    public void testSet() {
        int val = 1;
        ImmutableList linkedList = new ImmutableLinkedList(val);
        ImmutableList newLinkedList = linkedList.add(12);
        Object[] array =  {9, 2, 5};
        newLinkedList = newLinkedList.addAll(1, array);

        Object[] expectedResult = {8, 9, 2, 5, 12};
        assertArrayEquals(expectedResult, newLinkedList.set(0, 8).toArray());
    }

    @Test
    public void testIndexOf() {
        int val = 1;
        ImmutableList linkedList = new ImmutableLinkedList(val);
        ImmutableList newLinkedList = linkedList.add(12);
        Object[] array =  {9, 2, 5};
        newLinkedList = newLinkedList.addAll(1, array);

        assertEquals(3, newLinkedList.indexOf(5));
    }

    @Test
    public void testSize() {
        int val = 1;
        ImmutableList linkedList = new ImmutableLinkedList(val);
        ImmutableList newLinkedList = linkedList.add(12);
        Object[] array =  {9, 2, 5};
        newLinkedList = newLinkedList.addAll(1, array);

        assertEquals(5, newLinkedList.size());
    }

    @Test
    public void testClear() {
        int val = 1;
        ImmutableList linkedList = new ImmutableLinkedList(val);
        ImmutableList newLinkedList = linkedList.add(12);
        Object[] array =  {9, 2, 5};
        newLinkedList = newLinkedList.addAll(1, array);

        assertEquals(0, newLinkedList.clear().size());
    }

    @Test
    public void testIsEmpty() {
        int val = 1;
        ImmutableList linkedList = new ImmutableLinkedList(val);
        ImmutableList newLinkedList = linkedList.add(12);
        Object[] array =  {9, 2, 5};
        newLinkedList = newLinkedList.addAll(1, array);

        assertFalse(newLinkedList.isEmpty());
    }

    @Test
    public void testAddFirst() {
        ImmutableLinkedList linkedList = new ImmutableLinkedList(1);
        ImmutableLinkedList newLinkedList = linkedList.addFirst(12);
        Object[] array =  {12, 1};

        assertArrayEquals(array, newLinkedList.toArray());
    }

    @Test
    public void testAddLast() {
        ImmutableLinkedList linkedList = new ImmutableLinkedList(1);
        ImmutableLinkedList newLinkedList = linkedList.addFirst(12);
        newLinkedList = newLinkedList.addLast(5);
        Object[] array =  {12, 1, 5};

        assertArrayEquals(array, newLinkedList.toArray());
    }

    @Test
    public void testGetFirst() {
        ImmutableLinkedList linkedList = new ImmutableLinkedList(1);
        ImmutableLinkedList newLinkedList = linkedList.addFirst(12);

        assertEquals(12, newLinkedList.getFirst());
    }

    @Test
    public void testGetLast() {
        ImmutableLinkedList linkedList = new ImmutableLinkedList(1);
        ImmutableLinkedList newLinkedList = linkedList.addFirst(12);
        newLinkedList = newLinkedList.addLast(5);

        assertEquals(5, newLinkedList.getLast());
    }

    @Test
    public void testRemoveFirst() {
        ImmutableLinkedList linkedList = new ImmutableLinkedList(1);
        ImmutableLinkedList newLinkedList = linkedList.addFirst(12);
        newLinkedList = newLinkedList.addLast(5);

        Object[] array =  {1, 5};
        assertArrayEquals(array, newLinkedList.removeFirst().toArray());
    }

    @Test
    public void testRemoveFLast() {
        ImmutableLinkedList linkedList = new ImmutableLinkedList(1);
        ImmutableLinkedList newLinkedList = linkedList.addFirst(12);
        newLinkedList = newLinkedList.addLast(5);

        Object[] array =  {12, 1};
        assertArrayEquals(array, newLinkedList.removeLast().toArray());
    }
}
