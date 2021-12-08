/* Задание 4
Используя IntelliJ IDEA, создайте проект.
Требуется:
Создайте класс DocumentWorker.
В теле класса создайте три метода openDocument(), editDocument(), saveDocument().
В тело каждого из методов добавьте вывод на экран соответствующих строк: "Документ открыт",
"Редактирование документа доступно в версии Про", "Сохранение документа доступно в версии Про".
Создайте производный класс ProDocumentWorker.
Переопределите соответствующие методы, при переопределении методов выводите следующие строки:
"Документ отредактирован", "Документ сохранен в старом формате, сохранение в остальных форматах
доступно в версии Эксперт".
Создайте производный класс ExpertDocumentWorker от базового класса ProDocumentWorker.
Переопределите соответствующий метод. При вызове данного метода необходимо выводить на экран
"Документ сохранен в новом формате".
В теле метода main() реализуйте возможность приема от пользователя номера ключа доступа pro и exp.
Если пользователь не вводит ключ, он может пользоваться только бесплатной версией (создается
экземпляр базового класса), если пользователь ввел номера ключа доступа pro и exp, то должен создаться
экземпляр соответствующей версии класса, приведенный к базовому – DocumentWorker.*/

package com.itvdn.javaEssential.petrov.lesson003.homeWork.documentWorker;

import java.util.Scanner;

public class Main {
    private static final String KEY_PRO = "12345";
    private static final String KEY_EXP = "67890";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ключ доступа: ");
        String key = sc.nextLine();
        DocumentWorker documentWorker = KEY_EXP.equals(key) ? new ExpertDocumentWorker() :
                KEY_PRO.equals(key) ? new ProDocumentWorker() : new DocumentWorker();
        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();
    }
}
