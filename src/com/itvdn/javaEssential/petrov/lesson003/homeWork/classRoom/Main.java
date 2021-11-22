/* Задание 2
Используя IntelliJ IDEA, создайте проект.
Требуется:
Создать класс, представляющий учебный класс ClassRoom.
Создайте класс ученик Pupil. В теле класса создайте методы void study(), void read(), void write(), void relax().
Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и
переопределите каждый из методов, в зависимости от успеваемости ученика.
Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента.
Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать,
отдыхать.*/

package com.itvdn.javaEssential.petrov.lesson003.homeWork.classRoom;

public class Main {
    public static void main(String[] args) {
        new ClassRoom(new BadPupil(), new GoodPupil(), new BadPupil(), new ExcelentPupil()).info();
        System.out.println();
        new ClassRoom(new BadPupil(), null, new BadPupil(), new ExcelentPupil()).info();
        System.out.println();
        new ClassRoom(new BadPupil(), new ExcelentPupil()).info();
    }
}
