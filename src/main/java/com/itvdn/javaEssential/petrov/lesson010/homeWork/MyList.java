/* Создайте класс MyList<T>. Реализуйте в простейшем приближении возможность использования его
экземпляра аналогично экземпляру класса List<T>. Минимально требуемый интерфейс взаимодействия с
экземпляром, должен включать метод добавления элемента, индексатор для получения значения
элемента по указанному индексу и свойство только для чтения для получения общего количества
элементов.*/

package com.itvdn.javaEssential.petrov.lesson010.homeWork;

import java.util.ArrayList;

public class MyList<T> {
    ArrayList<T> list;

    public MyList() {
        this.list = new ArrayList<>();
    }

    public void add(T value) {
        list.add(value);
    }

    public T get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("test1");
        list.add("test2");
        System.out.println(list.get(1));
        System.out.println(list.size());
    }
}
