package com.itvdn.javaEssential.petrov.lesson004.homeWork.task002;

public class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("TXTHandler is opened.");
    }

    @Override
    public void create() {
        System.out.println("TXTHandler is created.");
    }

    @Override
    public void change() {
        System.out.println("TXTHandler is changed.");
    }

    @Override
    public void save() {
        System.out.println("TXTHandler is saved.");
    }
}
