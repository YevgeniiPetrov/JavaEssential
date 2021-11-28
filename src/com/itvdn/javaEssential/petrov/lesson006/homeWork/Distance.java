/* Задание 3
Создайте проект, используя IntelliJ IDEA.
Требуется:
Создать класс Distance с полем distance типа double и методом print. В классе Distance, создайте
статический класс Converter с методами, которые будут конвертировать расстояние в разные единицы
измерения (к примеру, из метров в километры, из километров в мили, и так далее).*/

package com.itvdn.javaEssential.petrov.lesson006.homeWork;

public class Distance {
    private double distance;

    public void print(String message) {
        System.out.println(message);
    }

    static class Converter {
        public static double millimetersToMeters(double millimeter) {
            return millimeter / 1000;
        }

        public static double metersToKilometers(double meters) {
            return meters / 1000;
        }

        public static double kilometersToMiles(double kilometers) {
            return kilometers * 0.6;
        }
    }

    public static void main(String[] args) {
        System.out.println(Distance.Converter.kilometersToMiles(20));
        System.out.println(Distance.Converter.millimetersToMeters(3500));
        System.out.println(Distance.Converter.metersToKilometers(300));
    }
}
