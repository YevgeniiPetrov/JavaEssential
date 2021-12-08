package com.itvdn.javaEssential.petrov.lesson002.homeWork.accessRecovery;

import java.util.Scanner;

public class AccessRecovery {
    private static final String LOGIN_ATTR = "логин";
    private static final String PASSWORD_ATTR = "пароль";
    private static boolean FORGOT_LOGIN;

    private static void forgotLogin(Scanner sc) {
        String forgotAttr = "";
        while (!forgotAttr.equals(LOGIN_ATTR) && !forgotAttr.equals(PASSWORD_ATTR)) {
            System.out.printf("Введите \"%s\", если забыли %s, или введите \"%s\", если забыли %s: ",
                    LOGIN_ATTR, LOGIN_ATTR, PASSWORD_ATTR, PASSWORD_ATTR);
            forgotAttr = sc.nextLine();
        }
        FORGOT_LOGIN = forgotAttr.equals(LOGIN_ATTR);
    }

    private static String getStringValue(Scanner sc, String message) {
        System.out.printf("%s (если не помните, введите \"%s\" для текстовых данных, \"%d\" - для числовых данных): ",
                message, Storage.NOT, Storage.ZERO);
        return sc.nextLine();
    }

    private static int getIntValue(Scanner sc, String message) {
        String value = getStringValue(sc, message);
        return value.trim().equals("") ? Storage.ZERO : Integer.parseInt(value);
    }

    public static void run(Client client) {
        Scanner sc = new Scanner(System.in);
        forgotLogin(sc);
        System.out.println("Необходимо ввести данные для восстановления доступа.");
        String login = FORGOT_LOGIN ? "" : getStringValue(sc, "Введите " + LOGIN_ATTR);
        String password = FORGOT_LOGIN ? getStringValue(sc, "Введите " + PASSWORD_ATTR) : "";
        String birthday = getStringValue(sc, "Введите дату рождения");
        String email = getStringValue(sc, "Введите email");
        String question = client.getSecret() == null ? "" : getStringValue(sc, "Введите кодовый вопрос");
        String answer = client.getSecret() == null ? "" : getStringValue(sc, "Введите кодовый ответ");
        int order = client.getOrders() == null ? Storage.ZERO : getIntValue(sc, "Введите номер последнего заказа");
        sc.close();
        boolean checkRecovery = client.recoveryCheck(login, password, birthday, email, question, answer, order);
        System.out.println(checkRecovery ?
                "Мы вышлем Вам данные для восстановления." : "Данных для восстановления недостаточно.");
    }
}
