package com.itvdn.javaEssential.petrov.lesson003.homeWork.task001;

public class Aircraft extends Vehicle {
    private int flightAltitude; // Высота полета

    public Aircraft(int speed, int flightAltitude) {
        super(speed);
        this.flightAltitude = flightAltitude;
    }

    @Override
    public void info() {
        super.info();
        System.out.printf("Высота полета: %d. ", flightAltitude);
    }
}
