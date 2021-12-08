/* Вам поступил заказ.
Вам нужно написать обычный калькулятор с необычными правилами.
Клиент очень сильно не любит число 3(прямо ненавидит), имя Рома(относиться негативно) и число 7 в декабре(относиться негативно).
Ваша задача, написать калькулятор ТОЛЬКО на интах. Пока пользователь не выберет выход из программы, вы должны ВЫВОДИТЬ текст ошибки.
На каждую исключительную ситуацию СВОЮ и только СВОЮ Ошибку. ни 1 java ошибки не Должно быть.
Конечно, вы спросите - Саша, а как же - if(secondNumber == 0) - да, проверять можно, но вызывать ошибку вы должны.
В конце программы, вам нужно указать сколько было ошибок:
1. Критических.
2. Средних.
3. Мало интересных.
А также вывести список ошибок.*/

package com.itvdn.javaEssential.petrov.lesson008.homeWork.addTask;

import com.itvdn.javaEssential.petrov.lesson008.homeWork.addTask.exception.*;
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

    public static int div(int firstNumber, int secondNumber) throws DivideByZeroException {
        if (secondNumber == 0) {
            throw new DivideByZeroException();
        }
        return firstNumber / secondNumber;
    }

    public static int getArithmeticResult(int firstNumber, int secondNumber, String sign) throws ArithmeticResultException, DivideByZeroException {
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
                throw new ArithmeticResultException();
        }
        return result;
    }

    public static void checkNumber(int number) throws ThreeNumberException {
        if (number == 3) {
            throw new ThreeNumberException();
        }
    }

    public static String getInputString(Scanner sc, String message) {
        System.out.println(message);
        return sc.next();
    }

    public static int getInputNumber(Scanner sc, String message) throws NotIntInputException {
        try {
            return Integer.parseInt(getInputString(sc, message));
        } catch (NumberFormatException e) {
            throw new NotIntInputException();
        }
    }

    public static void main(String[] args) {
        final String EXIT = "exit";
        int amountHardExceptions = 0;
        int amountMediumExceptions = 0;
        int amountEasyExceptions = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int firstNumber = getInputNumber(sc, "Введите первое число:");
                checkNumber(firstNumber);
                int secondNumber = getInputNumber(sc, "Введите второе число:");
                checkNumber(secondNumber);
                String sign = getInputString(sc, "Введите знак арифметической операции:");
                int result = getArithmeticResult(firstNumber, secondNumber, sign);
                System.out.printf("%d %s %d = %d\n", firstNumber, sign, secondNumber, result);
                checkNumber(result);
            } catch (NotIntInputException | ArithmeticResultException e) {
                System.err.println(e);
                amountMediumExceptions++;
            } catch (ThreeNumberException | DivideByZeroException e) {
                System.err.println(e);
                amountHardExceptions++;
            }
            try {
                String exit = getInputString(sc, String.format("Введите '%s', если хотите завершить выпонение программы.", EXIT));
                if (exit.equalsIgnoreCase(EXIT)) {
                    break;
                } else {
                    throw new NotExitInputException();
                }
            } catch (Exception e) {
                System.err.println(e);
                amountEasyExceptions++;
            }
        }
        sc.close();
        System.out.printf("Количество ошибок:\n - критических: %d\n - средних: %d\n - мало интересных: %d\n",
                amountHardExceptions, amountMediumExceptions, amountEasyExceptions);
    }
}