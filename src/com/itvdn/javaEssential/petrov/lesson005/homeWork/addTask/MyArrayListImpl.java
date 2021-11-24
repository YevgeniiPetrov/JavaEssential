package com.itvdn.javaEssential.petrov.lesson005.homeWork.addTask;

public class MyArrayListImpl implements MyList {
    // Изначальный массив должен иметь длину 10
    private final int amountElements = 10;
    private String[] array = new String[amountElements];
    private int currentIndex = 0;

    private void initNewArray() {
        String[] temp = new String[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    @Override
    public void add(String element) {
        if (currentIndex < array.length) {
            array[currentIndex++] = element;
        } else {
            initNewArray();
            add(element);
        }
    }

    @Override
    public void add(String element, int index) {
        if (index > currentIndex) {
            array[index] = element;
        } else if (index == currentIndex) {
            add(element);
            return;
        }
        String[] temp = new String[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            temp[i] = i == index ? element : array[i];
        }
        array = temp;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public void remove(String element) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void clear() {

    }

    @Override
    public void set(String element, int index) {

    }

    @Override
    public int indexOf(String element) {
        return 0;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder arrayStr = new StringBuilder();
        arrayStr.append("[");
        for (int i = 0; i < array.length; i++) {
            arrayStr.append(array[i]);
            if (i < array.length - 1) {
                arrayStr.append(", ");
            }
        }
        arrayStr.append("]");
        return new String(arrayStr);
    }
}
