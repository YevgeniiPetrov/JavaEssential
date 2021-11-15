/* Задание 4
Используя IDEA, создайте проект с пакетом. Создать класс Computer, создать массив объектов
Computers размером 5. Далее руками создать 5 экземпляров этого класса и записать в компьютер
(используя loop)*/

package com.itvdn.javaEssential.petrov.lesson001.homeWork;

public class Computer {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer();
        }
    }
}
