/* Задание 2
Создайте проект, используя IntelliJ IDEA.
Требуется:
Описать класс с именем Worker, содержащую следующие поля:
 фамилия и инициалы работника;
 название занимаемой должности;
 год поступления на работу.
Написать программу, выполняющую следующие действия:
 ввод с клавиатуры данных в массив, состоящий из пяти элементов типа Worker (записи должны
быть упорядочены по алфавиту);
 если значение года введено не в соответствующем формате выдает исключение.
 вывод на экран фамилии работника, стаж работы которого превышает введенное значение.*/

package com.itvdn.javaEssential.petrov.lesson008.homeWork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Worker {
    private String surname;
    private String name;
    private String middleName;
    private String position;
    private int year;

    public Worker(String surname, String name, String middleName, String position, int year) throws Exception {
        if (year < 2000 || year > 2021) {
            throw new Exception("Год поступления на работу указан неверно.");
        }
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.position = position;
        this.year = year;
    }

    public String getFullName() {
        return String.format("%s %s %s", surname, name, middleName);
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public static String getInputString(Scanner sc, String message) {
        System.out.println(message);
        return sc.next();
    }

    public static int getInputNumber(Scanner sc, String message) {
        return Integer.parseInt(getInputString(sc, message));
    }

    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 0; i < workers.length; i++) {
                System.out.printf("Введите данные работника №%d:\n", i + 1);
                workers[i] = new Worker(
                        getInputString(sc, "- ведите фамилию:"),
                        getInputString(sc, "- ведите имя:"),
                        getInputString(sc, "- ведите отчество:"),
                        getInputString(sc, "- ведите должность:"),
                        getInputNumber(sc, "- ведите год поступления на работу:")
                );
            }
            Arrays.sort(workers, new Comparator<Worker>() {
                @Override
                public int compare(Worker worker1, Worker worker2) {
                    return worker1.getFullName().compareTo(worker2.getFullName());
                }
            });
            int workExperience = getInputNumber(sc, "Введите стаж работы:");
            for (Worker worker: workers) {
                if (2021 - worker.getYear() > workExperience) {
                    System.out.printf("У работника с фамилией %s стаж превышает %d год(-а).\n",
                            worker.getSurname(), workExperience);
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        sc.close();
    }
}
