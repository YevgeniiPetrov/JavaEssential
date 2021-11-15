/* Создать класс MyArea, в нем объявить константу PI = 3.14 и статический метод areaOfCircle, который
должен принимать радиус и используя PI посчитать площадь круга.
Создать класс Main, где запустить данный метод.*/

package com.itvdn.javaEssential.petrov.lesson002.homeWork.MyArea;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Радиус круга: %.2f", MyArea.areaOfCircle(2.5));
    }
}
