package com.itvdn.javaEssential.petrov.lesson003.homeWork.task001;

public class Vehicle {
    private int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public void info() {
        System.out.printf("Скорость: %d. ", speed);
    }
}
