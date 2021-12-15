/* 1. У нас есть 5 правил, которые должен выполнять equals.
Написать по 1 классу, который нарушает 1 правило. Нарушить нужно как минимум 3 правила. Если остальные не дадутся - ничего страшного.*/

package com.itvdn.javaEssential.petrov.lesson009.homeWork.addTask.task001;

import java.util.Objects;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Human human = (Human) new Object(); // Ошибка
        return Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
