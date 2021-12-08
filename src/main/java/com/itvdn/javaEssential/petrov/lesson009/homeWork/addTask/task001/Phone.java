/* 1. У нас есть 5 правил, которые должен выполнять equals.
Написать по 1 классу, который нарушает 1 правило. Нарушить нужно как минимум 3 правила. Если остальные не дадутся - ничего страшного.*/

package com.itvdn.javaEssential.petrov.lesson009.homeWork.addTask.task001;

import java.util.Objects;

public class Phone {
    private int number;

    public Phone(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Phone phone = (Phone) obj;
        return phone.number == (int) Math.random() * 1_000_000; // Ошибка
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
