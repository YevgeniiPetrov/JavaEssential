/* 1. У нас есть 5 правил, которые должен выполнять equals.
Написать по 1 классу, который нарушает 1 правило. Нарушить нужно как минимум 3 правила. Если остальные не дадутся - ничего страшного.*/

package com.itvdn.javaEssential.petrov.lesson009.homeWork.addTask.task001;

import java.util.Objects;

public class Dog {
    private int age;

    public Dog(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null || obj.getClass() != this.getClass()) { // Ошибка (obj != null)
            return false;
        }
        Dog dog = (Dog) obj;
        return age == dog.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
