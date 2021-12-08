/* Задание 2
Используя IntelliJ IDEA, создайте проект.Требуется:
Создайте класс AbstractHandler.
В теле класса создать методы void open(), void create(), void change(), void save().
Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
Написать программу, которая будет выполнять определение документа и для каждого формата должны
быть методы открытия, создания, редактирования, сохранения определенного формата документа.*/

package com.itvdn.javaEssential.petrov.lesson004.homeWork.task002;

public class Main {
    public static void main(String[] args) {
        AbstractHandler[] abstractHandlers = new AbstractHandler[] {
                new DOCHandler(), new TXTHandler(), new XMLHandler(),
        };
        for (int i = 0; i < abstractHandlers.length; i++) {
            abstractHandlers[i].create();
            abstractHandlers[i].open();
            abstractHandlers[i].change();
            abstractHandlers[i].save();
            System.out.println();
        }
    }
}
