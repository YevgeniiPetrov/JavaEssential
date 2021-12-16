/* Задание 2
Используя Intelij IDEA создать проект, пакет.
Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index,
element).
Вывести список в консоль.*/

package com.itvdn.javaEssential.petrov.lesson005.homeWork.task002;

import java.util.ArrayList;

public class Zoo {
    public static ArrayList<String> animals = new ArrayList<>();

    static {
        animals.add(0, "Tiger");
        animals.add(1, "Bear");
        animals.add(2, "Lion");
        animals.add(3, "Elephant");
        animals.add(4, "Zebra");
        animals.add(5, "Monkey");
        animals.add(6, "Snake");
        animals.add(7, "Panda");
    }

    public static void main(String[] args) {
        for (String animal: Zoo.animals) {
            System.out.println(animal);
        }
    }
}
