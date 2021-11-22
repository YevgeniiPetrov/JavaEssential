package com.itvdn.javaEssential.petrov.lesson003.homeWork.printer;

public class HP extends Printer {
    @Override
    public void print(String value) {
        super.print(Printer.ANSI_YELLOW + value + Printer.ANSI_RESET);
    }
}
