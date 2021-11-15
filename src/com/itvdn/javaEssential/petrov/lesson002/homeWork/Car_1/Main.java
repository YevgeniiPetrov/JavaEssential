/*Задание 2
Используя Intelij IDEA создать проект, пакет.
Создать класс Машина с полями год(int), цвет(String).
Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
Создать класс Main в котором создать экземпляры вызывая разные конструкторы.*/

package com.itvdn.javaEssential.petrov.lesson002.homeWork.Car_1;

public class Main {
    public static void main(String[] args) {
        new Car(2000);
        new Car(2000, "Black");
    }
}
