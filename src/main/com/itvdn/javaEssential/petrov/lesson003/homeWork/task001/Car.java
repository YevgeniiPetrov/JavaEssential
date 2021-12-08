package com.itvdn.javaEssential.petrov.lesson003.homeWork.task001;

public class Car extends Landcraft {
    private String number;

    public Car(int speed, int amountWheels, String number) {
        super(speed, amountWheels);
        this.number = number;
    }

    @Override
    public void info() {
        super.info();
        System.out.printf("Номер: %s. ", number);
    }
}
