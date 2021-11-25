package com.itvdn.javaEssential.petrov.lesson005.homeWork.addTask;

public class MyArrayListImpl implements MyList {
    // Изначальный массив должен иметь длину 10
    private final int amountElements = 10;
    private String[] array = new String[amountElements];

    private String[] increaseArray(int index) {
        String[] temp = new String[size() + 1];
        for (int i = 0; i < size(); i++) {
            temp[i < index ? i : i + 1] = array[i];
        }
        return temp;
    }

    private String[] decreaseArray(int index) {
        String[] temp = new String[size() - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = array[i < index ? i : i + 1];
        }
        return temp;
    }

    @Override
    public void add(String element) {
        array = increaseArray(size());
        set(element, size() - 1);
    }

    @Override
    public void add(String element, int index) {
        if (index > size()) {
            set(element, index);
        } else if (index == size()) {
            add(element);
            return;
        }
        array = increaseArray(index);
        set(element, index);
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public void remove(String element) {
        remove(indexOf(element));
    }

    @Override
    public void remove(int index) {
        if (index > size()) {
            set(null, index);
        }
        array = decreaseArray(index);
    }

    @Override
    public void clear() {
        array = new String[amountElements];
    }

    @Override
    public void set(String element, int index) {
        array[index] = element;
    }

    @Override
    public int indexOf(String element) {
        for (int i = 0; i < size(); i++) {
            if (element != null && get(i) != null && get(i).equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public String toString() {
        StringBuilder arrayStr = new StringBuilder("[");
        for (int i = 0; i < size(); i++) {
            arrayStr.append(get(i));
            if (i < size() - 1) {
                arrayStr.append(", ");
            }
        }
        return new String(arrayStr.append("]"));
    }
}
