package com.itvdn.javaEssential.petrov.lesson004.homeWork.task002;

public class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("XMLHandler is opened.");
    }

    @Override
    public void create() {
        System.out.println("XMLHandler is created.");
    }

    @Override
    public void change() {
        System.out.println("XMLHandler is changed.");
    }

    @Override
    public void save() {
        System.out.println("XMLHandler is saved.");
    }
}
