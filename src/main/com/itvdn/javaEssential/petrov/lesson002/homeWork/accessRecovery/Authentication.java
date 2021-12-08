package com.itvdn.javaEssential.petrov.lesson002.homeWork.accessRecovery;

public class Authentication {
    private String login;
    private String password;

    public Authentication(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean checkLogin(String login) {
        return !this.login.equals("") &&
                !this.login.equals(Storage.NOT)
                && this.login.equals(login);
    }

    public boolean checkPassword(String password) {
        return !this.password.equals("") &&
                !this.password.equals(Storage.NOT)
                && this.password.equals(password);
    }

    public int getPercent(String login, String password) {
        return (this.checkLogin(login) ? Storage.LOGIN_PERCENT : Storage.ZERO) +
                (this.checkPassword(password) ? Storage.PASSWORD_PERCENT : Storage.ZERO);
    }
}
