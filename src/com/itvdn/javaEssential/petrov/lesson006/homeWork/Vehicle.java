/* Задание 2
Создайте проект, используя IntelliJ IDEA.
Требуется:
Создать класс Vehicle с методом print. В классе Vehicle, создайте внутренний класс Wheel и Door, которые
также должны содержать метод print. Создайте экземпляры классов Wheel и Door.*/

package com.itvdn.javaEssential.petrov.lesson006.homeWork;

public class Vehicle {
    class Wheel {
        public void print() {
            System.out.println("Wheel");
        }
    }

    class Door {
        public void print() {
            System.out.println("Door");
        }
    }

    public void print() {
        System.out.println("Vehicle");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.new Door().print();
        vehicle.new Wheel().print();
    }
}
