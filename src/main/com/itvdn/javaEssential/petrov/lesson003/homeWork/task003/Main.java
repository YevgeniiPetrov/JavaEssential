/* 3. Создать доп 3 класса
Которые описывают низшую иерархию.
Хишные -> Кошачьи
  |     \
Медвежьи  Псовые

Добавить интерфейс и реализовать для каждого семейства по разному.*/

package com.itvdn.javaEssential.petrov.lesson003.homeWork.task003;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Bear();
        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }
    }
}
