package com.itvdn.javaEssential.petrov.lesson003.homeWork.task001;

public class Landcraft extends Vehicle {
    private int amountWheels; // Количество колес

    public Landcraft(int speed, int amountWheels) {
        super(speed);
        this.amountWheels = amountWheels;
    }

    @Override
    public void info() {
        super.info();
        System.out.printf("Количество колес: %d. ", amountWheels);
    }
}
