package com.itvdn.javaEssential.petrov.lesson003.homeWork.vehicle;

public class Vehicle {
    private double latitude;
    private double longitude;
    private int price;
    private int speed;
    private int year;

    public Vehicle(double latitude, double longitude, int price, int speed, int year) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public void info() {
        System.out.printf("Основные параметры: широта - %.2f; долгота - %.2f, цена - %d; скорость - %d; год выпуска - %d. ",
                latitude, longitude, price, speed, year);
    }
}
