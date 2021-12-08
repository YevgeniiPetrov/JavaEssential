package com.itvdn.javaEssential.petrov.lesson003.homeWork.task001;

public class Watercraft extends Vehicle {
    private int anchorDepth; // Глубина якоря

    public Watercraft(int speed, int anchorDepth) {
        super(speed);
        this.anchorDepth = anchorDepth;
    }

    @Override
    public void info() {
        super.info();
        System.out.printf("Глубина якоря: %d. ", anchorDepth);
    }
}
