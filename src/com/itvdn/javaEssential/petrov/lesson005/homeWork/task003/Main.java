/* Задание 3
Используя Intelij IDEA создать проект, пакет.
Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль.*/

package com.itvdn.javaEssential.petrov.lesson005.homeWork.task003;

import com.itvdn.javaEssential.petrov.lesson005.homeWork.task002.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo.ANIMALS.remove(7);
        Zoo.ANIMALS.remove(5);
        Zoo.ANIMALS.remove(3);
        System.out.printf("Размер списка: %d.", Zoo.ANIMALS.size());
    }
}
