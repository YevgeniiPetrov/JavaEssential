/* Задание 4
Используя Intelij IDEA создать проект, пакет.
Создать класс Main, создать список целых чисел и используя ListIterator пройтись по списку и увеличить
значения на 1;*/

package com.itvdn.javaEssential.petrov.lesson005.homeWork.task004;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        ListIterator<Integer> list = numbers.listIterator();
        while (list.hasNext()) {
            numbers.set(list.nextIndex(), list.next() + 1);
        }
        for (Integer number: numbers) {
            System.out.println(number);
        }
    }
}
