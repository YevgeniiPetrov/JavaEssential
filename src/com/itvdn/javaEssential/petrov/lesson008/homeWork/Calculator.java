/* Создайте класс Calculator.
В теле класса создайте четыре метода для арифметических действий: (add – сложение, sub – вычитание,
mul – умножение, div – деление).
Метод деления должен делать проверку деления на ноль, если проверка не проходит, сгенерировать
исключение.
Пользователь вводит значения, над которыми хочет произвести операцию и выбрать саму операцию. При
возникновении ошибок должны выбрасываться исключения. */

package com.itvdn.javaEssential.petrov.lesson008.homeWork;

import java.io.DataOutput;
import java.util.Scanner;

public class Calculator {
    public static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double sub(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double mul(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double div(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите первое число:");
                Double firstNumber = sc.nextDouble();
                System.out.println("Введите второе число:");
                Double secondNumber = sc.nextDouble();
                System.out.println("Введите знак арифметической операции:");
                switch (sc.nextLine()) {
                    case "+":
                        System.out.printf("%.2f + %.2f = %.2", firstNumber, secondNumber, add(firstNumber, secondNumber));
                        break;
                    case "-":
                        System.out.printf("%.2f - %.2f = %.2", firstNumber, secondNumber, sub(firstNumber, secondNumber));
                        break;
                    case "*":
                        System.out.printf("%.2f * %.2f = %.2", firstNumber, secondNumber, mul(firstNumber, secondNumber));
                        break;
                    case "/":
                        System.out.printf("%.2f / %.2f = %.2", firstNumber, secondNumber, mul(firstNumber, secondNumber));
                        break;
                    default:
                        System.out.println("Ввод выполнен не верно. Повторите ввод.");
                        continue;
                }
                System.out.printf("Введите 'Да', если хотите повторить ввод.");
                if (!sc.nextLine().equalsIgnoreCase("Да")) {
                    break;
                }
            } catch (Exception e) {
                System.err.println(e);
                break;
            }
        }
        sc.close();
    }
}
