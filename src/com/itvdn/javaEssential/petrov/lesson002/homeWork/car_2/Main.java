/*Задание 3
Используя Intelij IDEA создать проект, пакет.
(Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
Перегрузить конструкторы.
Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.*/

package com.itvdn.javaEssential.petrov.lesson002.homeWork.Car_2;

public class Main {
    public static void main(String[] args) {
        new Car(2000);
        new Car(2000, 200.5);
        new Car(2000, 200.5, 2000);
        new Car(2000, 200.5, 2000, "Black");
    }
}
