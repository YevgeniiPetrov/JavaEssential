/* Задание 2
Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle. В теле класса
создать два поля, описывающие длины сторон double side1, double side2. Создать два метода,
вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2) и периметр
прямоугольника – double perimeterCalculator (double side1, double side2). Написать программу, которая
принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и
площадь.*/

package com.itvdn.javaEssential.petrov.lesson001.homeWork;

import java.util.Scanner;

public class Rectangle {
    private double side1;
    private double side2;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double areaCalculator (double side1, double side2) {
        return side1 * side2;
    }

    public double perimeterCalculator (double side1, double side2) {
        return 2 * (side1 + side2);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника: ");
        rectangle.setSide1(sc.nextDouble());
        System.out.println("Введите ширину прямоугольника: ");
        rectangle.setSide2(sc.nextDouble());
        sc.close();
        System.out.printf("Площадь прямоугольника - %.2f; периметр - %.2f.",
                rectangle.areaCalculator(rectangle.getSide1(), rectangle.getSide2()),
                rectangle.perimeterCalculator(rectangle.getSide1(), rectangle.getSide2()));
    }
}
