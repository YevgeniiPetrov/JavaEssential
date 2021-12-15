/* 2. Создайте класс и переопределите метод equals так чтоб сначала проверялся хеш код, а потом только equals.
Написать текстом, почему этот вариант работает лучше чем стандартный equals*/

package com.itvdn.javaEssential.petrov.lesson009.homeWork.addTask.task002;

import java.util.Objects;

public class Bicycle {
    private String model;
    private int speed;

    public Bicycle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public boolean equals(Object obj) {
        if (hashCode() == obj.hashCode() || this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Bicycle bicycle = (Bicycle) obj;
        return speed == bicycle.speed && Objects.equals(model, bicycle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, speed);
    }
}

/* На мой взгляд, преимущество сравненния через hashCode() в сравнени с equals() сотоит в том, что hashCode() работает
сразу с переменными объекта (без дополнительных проверок), а equals() выполняет сначала ряд проверок, например,
getClass() != obj.getClass(), а после уже выполняет операции с переменными. */