package com.itvdn.javaEssential.petrov.lesson003.homeWork.printer;

public class Printer {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public void print(String value) {
        System.out.println(value);
    }
}
