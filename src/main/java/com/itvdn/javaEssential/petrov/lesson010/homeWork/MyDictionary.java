/* Создайте класс MyDictionary<TKey,TValue>. Реализуйте в простейшем приближении возможность
использования его экземпляра. Минимально требуемый интерфейс взаимодействия с экземпляром,
должен включать метод добавления пар элементов, индексатор для получения значения элемента по
указанному индексу и свойство только для чтения для получения общего количества пар элементов.*/

package com.itvdn.javaEssential.petrov.lesson010.homeWork;

import java.util.HashMap;

public class MyDictionary<TKey,TValue> {
    private HashMap<TKey,TValue> dictionary;

    public MyDictionary() {
        this.dictionary = new HashMap<>();
    }

    public void add(TKey key,TValue value) {
        dictionary.put(key, value);
    }

    public TValue get(TKey key) {
        return dictionary.get(key);
    }

    public int size() {
        return dictionary.size();
    }

    public static void main(String[] args) {
        MyDictionary<String, Integer> dictionary = new MyDictionary<>();
        dictionary.add("test1", 1);
        dictionary.add("test2", 2);
        System.out.println(dictionary.get("test2"));
        System.out.println(dictionary.size());
    }
}
