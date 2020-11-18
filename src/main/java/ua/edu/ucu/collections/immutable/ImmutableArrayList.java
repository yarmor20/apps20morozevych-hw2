package ua.edu.ucu.collections.immutable;

import java.util.Arrays;

public class ImmutableArrayList implements ImmutableList {
    private Object[] array;
    private int length;

    public ImmutableArrayList(Object[] arr) {
        array = arr;
        length = arr.length;
    }

    private Object[] newArray(int len) {
        return Arrays.copyOf(array, len);
    }

    @Override
    public ImmutableList add(Object e) {
        Object[] newArray = newArray(length + 1);
        newArray[length] = e;
        return new ImmutableArrayList(newArray);
    }

    @Override
    public ImmutableList add(int index, Object e) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index out of range!");
        }

        Object[] newArray = newArray(length + 1);
        newArray[index] = e;

        for (int i = index; i < length; i++) {
            newArray[i + 1] = array[i];
        }
        return new ImmutableArrayList(newArray);
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        Object[] newArray = newArray(length + c.length);

        int j = 0;
        for(int i = length; i < length + c.length; i++) {
            newArray[i] = c[j];
            j++;
        }
        return new ImmutableArrayList(newArray);
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index out of range!");
        }

        Object[] newArray = newArray(length + c.length);
        for (int i = 0; i < c.length; i++) {
            newArray[index + i] = c[i];
        }

        for (int i = index; i < length; i++) {
            newArray[i + c.length] = array[i];
        }
        return new ImmutableArrayList(newArray);
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index out of range!");
        }
        return array[index];
    }

    @Override
    public ImmutableList remove(int index) {
        Object[] newArray = new Object[length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index + 1; i < length; i++) {
            newArray[i - 1] = array[i];
        }
        return new ImmutableArrayList(newArray);
    }

    @Override
    public ImmutableList set(int index, Object e) {
        Object[] newArray = newArray(length);
        newArray[index] = e;
        return new ImmutableArrayList(newArray);
    }

    @Override
    public int indexOf(Object e) {
        for (int i = 0; i < length; i++) {
            if (array[i] == e) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public ImmutableList clear() {
        return new ImmutableArrayList(new Object[0]);
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public Object[] toArray() {
        return array;
    }
}
