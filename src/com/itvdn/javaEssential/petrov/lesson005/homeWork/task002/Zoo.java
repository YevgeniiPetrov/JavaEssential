/* Задание 2
Используя Intelij IDEA создать проект, пакет.
Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index,
element).
Вывести список в консоль.*/

package com.itvdn.javaEssential.petrov.lesson005.homeWork.task002;

import java.util.ArrayList;

public class Zoo {
    public static ArrayList<String> ANIMALS = new ArrayList<>();

    static {
        ANIMALS.add(0, "Tiger");
        ANIMALS.add(1, "Bear");
        ANIMALS.add(2, "Lion");
        ANIMALS.add(3, "Elephant");
        ANIMALS.add(4, "Zebra");
        ANIMALS.add(5, "Monkey");
        ANIMALS.add(6, "Snake");
        ANIMALS.add(7, "Panda");
    }

    public static void main(String[] args) {
        for (String animal: Zoo.ANIMALS) {
            System.out.println(animal);
        }
    }
}
