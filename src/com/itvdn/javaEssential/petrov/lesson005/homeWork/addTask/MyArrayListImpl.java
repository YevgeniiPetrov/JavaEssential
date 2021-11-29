package com.itvdn.javaEssential.petrov.lesson005.homeWork.addTask;

import java.util.Arrays;

public class MyArrayListImpl implements MyList {
    private final int INITIAL_LENGTH = 10;
    private int previousLength;
    private int size;
    private String[] array;

    public MyArrayListImpl() {
        array = new String[INITIAL_LENGTH];
        previousLength = INITIAL_LENGTH;
    }

    private void increaseArray() {
        previousLength = array.length;
        String[] temp = new String[array.length * 3 / 2 + 1];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }

    private void decreaseArray() {
        String[] temp = new String[(array.length - 1) * 2 / 3 + 1];
        System.arraycopy(array, 0, temp, 0, temp.length);
        array = temp;
        previousLength = temp.length;
    }

    private void showException(int index) {
//        String[] array = new String[size];
//        array[index] = null;
//        Вывод ошибки в красном цвете и выход из программы
        System.out.printf("\u001B[31mException in thread \"main\" java.lang.IndexOutOfBoundsException: Index: %d, Size: %d\u001B[0m", index, size);
        System.exit(1);
    }

//    Реализация в ArrayList для get, set, remove:
//    @HotSpotIntrinsicCandidate
//    public static <X extends RuntimeException>
//    int checkIndex(int index, int length,
//                   BiFunction<String, List<Integer>, X> oobef) {
//        if (index < 0 || index >= length)
//            throw outOfBoundsCheckIndex(oobef, index, length);
//        return index;
//    }
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            showException(index);
        }
    }

//    Реализация в ArrayList для add:
//    /**
//     * A version of rangeCheck used by add and addAll.
//     */
//    private void rangeCheckForAdd(int index) {
//        if (index > size || index < 0)
//            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
//    }
    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size) {
            showException(index);
        }
    }

    @Override
    public void add(String element) {
        add(element, size);
    }

    @Override
    public void add(String element, int index) {
        checkIndexForAdd(index);
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
        if (size == previousLength && size > INITIAL_LENGTH) {
            decreaseArray();
        }
        int i = array.length == index ? 0 : 1;
        System.arraycopy(array, index + i, array, index, array.length - index - i);
        size--;
    }

    @Override
    public void clear() {
        array = new String[INITIAL_LENGTH];
        previousLength = INITIAL_LENGTH;
        size = 0;
    }

    @Override
    public void set(String element, int index) {
        checkIndex(index);
        array[index] = element;
    }

    @Override
    public int indexOf(String element) {
        // return Arrays.asList(array).indexOf(element);
        for (int i = 0; i < size; i++) {
            if ((element == null && array[i] == null) ||
                    (element != null && element.equals(array[i]))) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
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
