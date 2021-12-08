package com.itvdn.javaEssential.petrov.lesson008.homeWork.addTask.exception;

public class ArithmeticResultException extends MyException {
    public ArithmeticResultException() {
        super("The specified arithmetic operation is absent or not provided");
    }
}
