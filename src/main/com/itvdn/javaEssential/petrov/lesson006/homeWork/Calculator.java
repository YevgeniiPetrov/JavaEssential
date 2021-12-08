/* Задание
Используя IntelliJ IDEA, создайте проект.
Требуется:
Создать класс Calculator, с методами для выполнения основных арифметических операций.
Написать программу, которая выводит на экран основные арифметические операции.*/

package com.itvdn.javaEssential.petrov.lesson006.homeWork;

public class Calculator {
    public static double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double difference(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double multiplay(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        double firstNumber = 2.5;
        double secondNumber = 3.1;
        System.out.println("Основные арифметические операции:");
        System.out.printf("- сложение чисел: %.2f + %.2f = %.2f\n",
                firstNumber, secondNumber, sum(firstNumber, secondNumber));
        System.out.printf("- вычитание чисел: %.2f - %.2f = %.2f\n",
                firstNumber, secondNumber, difference(firstNumber, secondNumber));
        System.out.printf("- умножение чисел: %.2f * %.2f = %.2f\n",
                firstNumber, secondNumber, multiplay(firstNumber, secondNumber));
        System.out.printf("- деление чисел: %.2f / %.2f = %.2f\n",
                firstNumber, secondNumber, divide(firstNumber, secondNumber));
    }
}
