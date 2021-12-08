package com.itvdn.javaEssential.petrov.lesson003.homeWork.printer;

public class Epson extends Printer {
    @Override
    public void print(String value) {
        super.print(Printer.ANSI_GREEN + value + Printer.ANSI_RESET);
    }
}
