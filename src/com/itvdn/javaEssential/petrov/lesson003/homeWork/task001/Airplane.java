package com.itvdn.javaEssential.petrov.lesson003.homeWork.task001;

public class Airplane extends Aircraft {
    private int wingLength;

    public Airplane(int speed, int flightAltitude, int wingLength) {
        super(speed, flightAltitude);
        this.wingLength = wingLength;
    }

    @Override
    public void info() {
        super.info();
        System.out.printf("Длина крильев: %d. ", wingLength);
    }
}
