/* Создайте класс MyList<T>. Реализуйте в простейшем приближении возможность использования его
экземпляра аналогично экземпляру класса List<T>. Минимально требуемый интерфейс взаимодействия с
экземпляром, должен включать метод добавления элемента, индексатор для получения значения
элемента по указанному индексу и свойство только для чтения для получения общего количества
элементов.*/

package com.itvdn.javaEssential.petrov.lesson010.homeWork;

import java.util.Arrays;

public class MyList<T> {
    private T[] list;
    private final int INITIAL_LENGTH = 10;
    private int size;

    public MyList() {
        this.list = (T[]) new Object[INITIAL_LENGTH];
    }

    public void add(T value) {
        if (size == list.length) {
            list = Arrays.copyOf(list, list.length * 3 / 2 + 1);
        }
        list[size++] = value;
    }

    public T get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return list[index];
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("test1");
        list.add("test2");
        System.out.println(list.get(21));
        System.out.println(list.size());
    }
}
