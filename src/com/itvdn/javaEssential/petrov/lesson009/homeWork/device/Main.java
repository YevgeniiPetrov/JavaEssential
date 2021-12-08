/* Задание 2
Создать классы:
1) Основной класс Device (manufacturer(String), price(float), serialNumber(String));
2) Сабкалсс Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed (int), mac (String));
Добавить методы доступа. Конструктор.
Задание 3
Смотреть задание 2.
В обоих классах переопределить метод toString, что бы вывод был следующим:
Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024
Задание 4
Смотреть задание 2.
Переопределить методы equals & hashCode в каждом классе.
Создать класс Main, в котором создать объекты классов и продемонстрировать переопределенные
методы.*/

package com.itvdn.javaEssential.petrov.lesson009.homeWork.device;

public class Main {
    public static void main(String[] args) {
        Device device1= new Device("Samsung", 120, "AB1234567CD");
        Device device2= new Device("Samsung", 120, "AB1234567CD");
        Monitor monitor1 = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024, 100, "00:cc:bb:aa:11:22");
        Monitor monitor2 = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024, 100, "00:cc:bb:aa:11:22");
        System.out.printf("device1.toString() = %s\n", device1);
        System.out.printf("device2.toString() = %s\n", device2);
        System.out.printf("monitor1.toString() = %s\n", monitor1);
        System.out.printf("monitor2.toString() = %s\n", monitor2);
        System.out.printf("device1.hashCode() = %d\n", device1.hashCode());
        System.out.printf("device2.hashCode() = %d\n", device2.hashCode());
        System.out.printf("monitor1.hashCode() = %d\n", monitor1.hashCode());
        System.out.printf("monitor2.hashCode() = %d\n", monitor2.hashCode());
        System.out.printf("device1.equals(device2) = %b\n", device1.equals(device2));
        System.out.printf("monitor1.equals(monitor2) = %b\n", monitor1.equals(monitor2));
    }
}
