package com.itvdn.javaEssential.petrov.lesson003.homeWork.printer;

public class Canon extends Printer {
    @Override
    public void print(String value) {
        super.print(Printer.ANSI_RED + value + Printer.ANSI_RESET);
    }
}
