package com.itvdn.javaEssential.petrov.lesson003.homeWork.classRoom;

public class BadPupil extends Pupil {
    @Override
    public void study() {
        System.out.print("bad study");
    }

    @Override
    public void read() {
        System.out.print("bad read");
    }

    @Override
    public void write() {
        System.out.print("bad write");
    }

    @Override
    public void relax() {
        System.out.print("excelent relax");
    }
}
