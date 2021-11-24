package com.itvdn.javaEssential.petrov.lesson005.homeWork.addTask;

public class MyArrayListImpl implements MyList {
    // Изначальный массив должен иметь длину 10
    private final int amountElements = 10;
    private String[] array = new String[amountElements];

    private void initNewArray() {
        String[] temp = new String[size() + 1];
        for (int i = 0; i < size(); i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    @Override
    public void add(String element) {
        initNewArray();
        array[size() - 1] = element;
    }

    @Override
    public void add(String element, int index) {
        if (index > size()) {
            array[index] = element;
        } else if (index == size()) {
            add(element);
            return;
        }
        String[] temp = new String[size() + 1];
        for (int i = 0; i < size(); i++) {
            temp[i < index ? i : i + 1] = array[i];
        }
        temp[index] = element;
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
