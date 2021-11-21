/* 1. Придумать и создать иерархию минимум из 3-ех классов в логической иерархии.
Пример откуда берется это все (https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.calc.ru%2FTsarstvo-Zhivotnyye.html&psig=AOvVaw2mjmcQS9qZseY8RHx4wWnb&ust=1637310832660000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCJDM_KXAofQCFQAAAAAdAAAAABAD)
Например (из 4-ех классов):
Животное
Млекопитающие
Хищные
Кошачьи

В каждом классе должно быть минимум 1 поле, которое выделяет этот класс.*/

package com.itvdn.javaEssential.petrov.lesson003.homeWork.task001;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(150, 4, "AA1234");
        vehicles[1] = new Airplane(300, 3000, 25);
        vehicles[2] = new Submarine(200, 1000, 2000);
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].info();
            System.out.println();
        }
    }
}
