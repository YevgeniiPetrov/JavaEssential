package com.itvdn.javaEssential.petrov.lesson002.homeWork.car_1;

public class Car {
    private int year;
    private String color;

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, String color) {
        this(year);
        this.color = color;
    }
}
