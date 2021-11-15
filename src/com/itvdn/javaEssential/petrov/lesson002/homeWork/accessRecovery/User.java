package com.itvdn.javaEssential.petrov.lesson002.homeWork.accessRecovery;

public class User {
    private String firstName;
    private String lastName;
    private String birthday;
    private String email;

    public User(String firstName, String lastName, String birthday, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
