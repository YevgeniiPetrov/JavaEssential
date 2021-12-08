package com.itvdn.javaEssential.petrov.lesson004.homeWork.task002;

public class DOCHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("DOCHandler is opened.");
    }

    @Override
    public void create() {
        System.out.println("DOCHandler is created.");
    }

    @Override
    public void change() {
        System.out.println("DOCHandler is changed.");
    }

    @Override
    public void save() {
        System.out.println("DOCHandler is saved.");
    }
}
