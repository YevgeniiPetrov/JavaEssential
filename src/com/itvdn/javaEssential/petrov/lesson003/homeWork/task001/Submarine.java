package com.itvdn.javaEssential.petrov.lesson003.homeWork.task001;

public class Submarine extends Watercraft {
    private int immersionDepth;

    public Submarine(int speed, int anchorDepth, int immersionDepth) {
        super(speed, anchorDepth);
        this.immersionDepth = immersionDepth;
    }

    @Override
    public void info() {
        super.info();
        System.out.printf("Глубина погружения: %d.", immersionDepth);
    }
}
