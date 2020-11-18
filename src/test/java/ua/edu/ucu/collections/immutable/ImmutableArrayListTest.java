package ua.edu.ucu.collections.immutable;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

public class ImmutableArrayListTest {
    
    @Test
    public void testAdd() {
        Object[] arr = {2, 4, 7, 2};
        ImmutableList array = new ImmutableArrayList(arr);
        ImmutableList array2 = array.add(9);

        Object[] expectedResult = {2, 4, 7, 2, 9};
        assertArrayEquals(expectedResult, array2.toArray());
        assertArrayEquals(arr, array.toArray());
    }

    @Test
    public void testAddByIndex() {
        Object[] arr = {2, 4, 7, 2};
        ImmutableList array = new ImmutableArrayList(arr);
        ImmutableList array2 = array.add(1, 10);

        Object[] expectedResult = {2, 10, 4, 7, 2};
        assertArrayEquals(expectedResult, array2.toArray());
        assertArrayEquals(arr, array.toArray());
    }

    @Test
    public void testAddAll() {
        Object[] arr = {2, 4, 7, 2};
        ImmutableList array = new ImmutableArrayList(arr);
        Object[] arr2 = {9, 5, 7};
        ImmutableList array2 = array.addAll(arr2);

        Object[] expectedResult = {2, 4, 7, 2, 9, 5, 7};
        assertArrayEquals(expectedResult, array2.toArray());
        assertArrayEquals(arr, array.toArray());
    }

    @Test
    public void testAddAllByIndex() {
        Object[] arr = {2, 4, 7, 2};
        ImmutableList array = new ImmutableArrayList(arr);
        Object[] arr2 = {9, 5, 7};
        ImmutableList array2 = array.addAll(2, arr2);

        Object[] expectedResult = {2, 4, 9, 5, 7, 7, 2};
        assertArrayEquals(expectedResult, array2.toArray());
        assertArrayEquals(arr, array.toArray());
    }

    @Test
    public void testGet() {
        Object[] arr = {2, 4, 7, 2};
        ImmutableList array = new ImmutableArrayList(arr);
        Object[] arr2 = {9, 5, 7};
        ImmutableList array2 = array.addAll(2, arr2);

        assertEquals(5, array2.get(3));
    }

    @Test
    public void testRemove() {
        Object[] arr = {2, 4, 7, 2};
        ImmutableList array = new ImmutableArrayList(arr);
        Object[] arr2 = {9, 5, 7};
        ImmutableList array2 = array.addAll(2, arr2);

        Object[] expectedResult = {2, 4, 9, 5, 7, 2};
        assertArrayEquals(expectedResult, array2.remove(4).toArray());
        assertArrayEquals(arr, array.toArray());
    }

    @Test
    public void testSet() {
        Object[] arr = {2, 4, 7, 2};
        ImmutableList array = new ImmutableArrayList(arr);
        Object[] arr2 = {9, 5, 7};
        ImmutableList array2 = array.addAll(2, arr2);

        Object[] expectedResult = {2, 4, 9, 5, 18, 7, 2};
        assertArrayEquals(expectedResult, array2.set(4, 18).toArray());
        assertArrayEquals(arr, array.toArray());
    }

    @Test
    public void testIndexOf() {
        Object[] arr = {2, 4, 7, 2};
        ImmutableList array = new ImmutableArrayList(arr);
        Object[] arr2 = {9, 5, 7};
        ImmutableList array2 = array.addAll(2, arr2);

        assertEquals(-1, array2.indexOf(18));
        assertEquals(4, array2.indexOf(7));
    }

    @Test
    public void testClear() {
        Object[] arr = {2, 4, 7, 2};
        ImmutableList array = new ImmutableArrayList(arr);
        Object[] arr2 = {9, 5, 7};
        ImmutableList array2 = array.addAll(2, arr2);

        Object[] expectedResult = {};
        assertArrayEquals(expectedResult, array2.clear().toArray());
        assertArrayEquals(arr, array.toArray());
    }

    @Test
    public void testIsEmpty() {
        Object[] arr = {2, 4, 7, 2};
        ImmutableList array = new ImmutableArrayList(arr);
        Object[] arr2 = {9, 5, 7};
        ImmutableList array2 = array.addAll(2, arr2);

        ImmutableList array3 = array2.clear();
        assertTrue(array3.isEmpty());

        Object[] expectedResult = {2, 4, 9, 5, 7, 7, 2};
        assertArrayEquals(expectedResult, array2.toArray());
    }
}
