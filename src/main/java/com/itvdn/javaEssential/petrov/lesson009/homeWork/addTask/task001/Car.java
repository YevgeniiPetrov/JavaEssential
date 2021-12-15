/* 1. У нас есть 5 правил, которые должен выполнять equals.
Написать по 1 классу, который нарушает 1 правило. Нарушить нужно как минимум 3 правила. Если остальные не дадутся - ничего страшного.*/

package com.itvdn.javaEssential.petrov.lesson009.homeWork.addTask.task001;

import java.util.Objects;

public class Car {
    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == Double.valueOf(Math.random() * 1_000_000)) { // Ошибка
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return speed == car.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
