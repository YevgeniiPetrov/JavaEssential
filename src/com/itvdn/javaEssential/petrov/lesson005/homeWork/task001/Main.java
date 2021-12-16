/* Задание
Используя Intelij IDEA создать проект, пакет.
Создать class Main, в нем создать список, добавить учителей, которых вы только сможете вспомнить со
школы. И получить индекс самого лучшего учителя и самого не очень. Вывести список в консоль.*/

package com.itvdn.javaEssential.petrov.lesson005.homeWork.task001;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Ткаченко Светлана Владимировна");
        teachers.add("Василенко Светлана Васильевна");
        teachers.add("Мельник Алина Николаевна");
        teachers.add("Шпак Николай Сергеевич");
        System.out.printf("Индекс самого лучшего учителя: %d.\n", teachers.indexOf("Ткаченко Светлана Владимировна"));
        System.out.printf("Индекс учителя не очень: %d.\n", teachers.indexOf("Мельник Алина Николаевна"));
        for (String teacher: teachers) {
            System.out.println(teacher);
        }
    }
}
