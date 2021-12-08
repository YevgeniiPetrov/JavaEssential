/* Задание
Используя IntelliJ IDEA, создайте проект.
Требуется:
Создайте класс Printer.
В теле класса создайте метод void print(String value), который выводит на экран значение аргумента.
Реализуйте возможность того, чтобы в случае наследования от данного класса других классов, и вызове
соответствующего метода их экземпляра, строки, переданные в качестве аргументов методов,
выводились разными цветами.
Обязательно используйте приведение типов.*/

package com.itvdn.javaEssential.petrov.lesson003.homeWork.printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("printer = new Printer();");

        HP hp1 = new HP();
        hp1.print("HP hp1 = new HP();");
        Printer hp2 = new HP();
        hp2.print("Printer hp2 = new HP();");
        hp2 = new Printer();
        hp2.print("hp2 = new Printer()");

        Canon canon1 = new Canon();
        canon1.print("Canon canon1 = new Canon();");
        Printer canon2 = new Canon();
        canon2.print("Printer canon2 = new Canon();");
        canon2 = new Printer();
        canon2.print("canon2 = new Printer()");

        Epson epson1 = new Epson();
        epson1.print("Epson epson1 = new Epson();");
        Printer epson2 = new Epson();
        epson2.print("Printer epson2 = new Epson();");
        epson2 = new Printer();
        epson2.print("epson2 = new Printer()");
    }
}
