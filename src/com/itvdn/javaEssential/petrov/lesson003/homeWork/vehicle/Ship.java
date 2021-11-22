package com.itvdn.javaEssential.petrov.lesson003.homeWork.vehicle;

public class Ship extends Vehicle {
    private String port;
    private int amountPassengers;

    public Ship(double latitude, double longitude, int price, int speed, int year, String port, int amountPassengers) {
        super(latitude, longitude, price, speed, year);
        this.port = port;
        this.amountPassengers = amountPassengers;
    }

    @Override
    public void info() {
        super.info();
        System.out.printf("Дополнительные параметры: количество пассажиров - %d; порт приписки - %s.",
                amountPassengers, port);
    }
}
