package com.itvdn.javaEssential.petrov.lesson003.homeWork.vehicle;

public class Plane extends Vehicle {
    private int height;
    private int amountPassengers;

    public Plane(double latitude, double longitude, int price, int speed, int year, int height, int amountPassengers) {
        super(latitude, longitude, price, speed, year);
        this.height = height;
        this.amountPassengers = amountPassengers;
    }

    @Override
    public void info() {
        super.info();
        System.out.printf("Дополнительные параметры: высота - %d; количество пассажиров - %d.",
                height, amountPassengers);
    }
}
