/* Задание 3
Используя IntelliJ IDEA, создайте проект.
Требуется:
Создать класс Vehicle.
В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год
выпуска).
Создайте 3 производных класса Plane, Саг и Ship.
Для класса Plane должна быть определена высота и количество пассажиров.
Для класса Ship – количество пассажиров и порт приписки.
Написать программу, которая выводит на экран информацию о каждом средстве передвижения.*/

package com.itvdn.javaEssential.petrov.lesson003.homeWork.vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[] {
                new Plane(11.34, 15.57, 30000, 500, 2015, 3000, 150),
                new Саг(7.67, 9.56, 5000, 120, 2010),
                new Ship(8.45, 12.87, 50000, 200, 2020, "Одесса", 120)
        };
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].info();
            System.out.println();
        }
    }
}
