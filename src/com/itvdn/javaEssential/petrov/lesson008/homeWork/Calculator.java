/* Создайте класс Calculator.
В теле класса создайте четыре метода для арифметических действий: (add – сложение, sub – вычитание,
mul – умножение, div – деление).
Метод деления должен делать проверку деления на ноль, если проверка не проходит, сгенерировать
исключение.
Пользователь вводит значения, над которыми хочет произвести операцию и выбрать саму операцию. При
возникновении ошибок должны выбрасываться исключения. */

package com.itvdn.javaEssential.petrov.lesson008.homeWork;

import java.util.Scanner;

public class Calculator {
    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public static int getArithmeticResult(int firstNumber, int secondNumber, String sign) throws Exception {
        int result;
        switch (sign) {
            case "+":
                result = add(firstNumber, secondNumber);
                break;
            case "-":
                result = sub(firstNumber, secondNumber);
                break;
            case "*":
                result = mul(firstNumber, secondNumber);
                break;
            case "/":
                result = div(firstNumber, secondNumber);
                break;
            default:
                throw new Exception("Указанной арифметической операции нет или не предусмотрено.");
        }
        return result;
    }

    public static String getInputString(Scanner sc, String message) {
        System.out.println(message);
        return sc.next();
    }

    public static int getInputNumber(Scanner sc, String message) {
        return Integer.parseInt(getInputString(sc, message));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int firstNumber = getInputNumber(sc, "Введите первое число:");
                int secondNumber = getInputNumber(sc, "Введите второе число:");
                String sign = getInputString(sc, "Введите знак арифметической операции:");
                System.out.printf("%d %s %d = %d\n",
                        firstNumber, sign, secondNumber, getArithmeticResult(firstNumber, secondNumber, sign));
                if (!getInputString(sc, "Введите 'Да', если хотите повторить ввод.").equalsIgnoreCase("Да")) {
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
