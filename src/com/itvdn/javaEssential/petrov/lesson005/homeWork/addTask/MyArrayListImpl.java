package com.itvdn.javaEssential.petrov.lesson005.homeWork.addTask;

import java.util.Arrays;

public class MyArrayListImpl implements MyList {
    private final int AMOUNT_ELEMENTS = 10;
    private int previousAmountElements;
    private int size;
    private String[] array;

    public MyArrayListImpl() {
        array = new String[AMOUNT_ELEMENTS];
        previousAmountElements = AMOUNT_ELEMENTS;
    }

    private void increaseArray() {
        previousAmountElements = array.length;
        String[] temp = new String[array.length * 3 / 2 + 1];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }

    private void decreaseArray() {
        String[] temp = new String[(array.length - 1) * 2 / 3 + 1];
        System.arraycopy(array, 0, temp, 0, temp.length);
        array = temp;
        previousAmountElements = (array.length - 1) * 2 / 3 + 1;
    }

    private void showException(int index) {
        String[] array = new String[size];
        array[index] = null;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            showException(index);
        }
    }

    @Override
    public void add(String element) {
        add(element, size);
    }

    @Override
    public void add(String element, int index) {
        if (index < 0 || index > size) {
            showException(index);
        }
        if (size == array.length) {
            increaseArray();
        }
        System.arraycopy(array, index, array, index + 1, array.length - index - 1);
        array[index] = element;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(String element) {
        int index = indexOf(element);
        if (index == -1) {
            return false;
        } else {
            remove(index);
            return true;
        }
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        if (size == previousAmountElements && size > AMOUNT_ELEMENTS) {
            decreaseArray();
        }
        int i = array.length == index ? 0 : 1;
        System.arraycopy(array, index + i, array, index, array.length - index - i);
        size--;
    }

    @Override
    public void clear() {
        array = new String[AMOUNT_ELEMENTS];
        previousAmountElements = AMOUNT_ELEMENTS;
        size = 0;
    }

    @Override
    public void set(String element, int index) {
        checkIndex(index);
        array[index] = element;
    }

    @Override
    public int indexOf(String element) {
        return Arrays.asList(array).indexOf(element);
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public String toString() {
        String[] temp = new String[size];
        System.arraycopy(array, 0, temp, 0, size);
        return Arrays.toString(temp);
    }
}
