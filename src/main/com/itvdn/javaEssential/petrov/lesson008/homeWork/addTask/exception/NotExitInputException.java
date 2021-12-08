package main.com.itvdn.javaEssential.petrov.lesson008.homeWork.addTask.exception;

public class NotExitInputException extends MyException {
    public NotExitInputException() {
        super("Not an exit is inputed");
    }
}
