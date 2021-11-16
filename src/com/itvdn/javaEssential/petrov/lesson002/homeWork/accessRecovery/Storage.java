package com.itvdn.javaEssential.petrov.lesson002.homeWork.accessRecovery;

public class Storage {
    public static final String NOT = "not";
    public static final int ZERO = 0;
    public static final int LOGIN_PERCENT = 25;
    public static final int PASSWORD_PERCENT = 25;
    public static final int BIRTHDAY_PERCENT = 15;
    public static final int EMAIL_PERCENT = 15;
    public static final int SECRET_QUESTION_PERCENT = 20;
    public static final int SECRET_ANSWER_PERCENT = 20;
    public static final int ORDER_PERCENT = 10;
    public static final int CORRECT_ANSWERS_PERCENT= 60;
    public static Client CLIENT;

    public static void initClient() {
        CLIENT = new Client("Ivan", "Ivanov", "30.03.1990",
                "ivanov.ivan@gmail.com", "ivanov.ivan", "qwerty12345");
        CLIENT.setSecret(new Secret("What is your favorite sport?", "Football"));
        CLIENT.addOrder(1112222);
        CLIENT.addOrder(3333444);
    }
}
