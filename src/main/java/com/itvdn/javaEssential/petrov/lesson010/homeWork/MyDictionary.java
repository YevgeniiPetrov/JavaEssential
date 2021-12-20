/* Создайте класс MyDictionary<TKey,TValue>. Реализуйте в простейшем приближении возможность
использования его экземпляра. Минимально требуемый интерфейс взаимодействия с экземпляром,
должен включать метод добавления пар элементов, индексатор для получения значения элемента по
указанному индексу и свойство только для чтения для получения общего количества пар элементов.*/

package com.itvdn.javaEssential.petrov.lesson010.homeWork;

import java.util.Arrays;

class Bucket<TKey,TValue> {
    private TKey key;
    private TValue value;

    public Bucket(TKey key, TValue value) {
        this.key = key;
        this.value = value;
    }

    public TKey getKey() {
        return key;
    }

    public TValue getValue() {
        return value;
    }

    public void setValue(TValue value) {
        this.value = value;
    }
}

public class MyDictionary<TKey,TValue> {
    private Bucket[] dictionary;
    private final int INITIAL_LENGTH = 10;
    private int size;

    public MyDictionary() {
        this.dictionary = new Bucket[INITIAL_LENGTH];
    }

    public void add(TKey key, TValue value) {
        for (int i = 0; i < size; i++) {
            if (key == dictionary[i].getKey() || (key != null && key.equals(dictionary[i].getKey()))) {
                dictionary[i].setValue(value);
                return;
            }
        }
        if (size == dictionary.length) {
            dictionary = Arrays.copyOf(dictionary, dictionary.length * 3 / 2 + 1);
        }
        dictionary[size++] = new Bucket(key, value);
    }

    public TValue get(TKey key) {
        for (int i = 0; i < size; i++) {
            if (key == dictionary[i].getKey() || (key != null && key.equals(dictionary[i].getKey()))) {
                return (TValue) dictionary[i].getValue();
            }
        }
        return null;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyDictionary<String, Integer> dictionary = new MyDictionary<>();
        dictionary.add("test1", 1);
        dictionary.add("test2", 2);
        System.out.println(dictionary.get("test1"));
        System.out.println(dictionary.size());
    }
}
