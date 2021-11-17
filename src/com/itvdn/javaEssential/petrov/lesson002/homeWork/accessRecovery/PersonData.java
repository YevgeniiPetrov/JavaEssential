package com.itvdn.javaEssential.petrov.lesson002.homeWork.accessRecovery;

public class PersonData {
    private String firstName;
    private String lastName;
    private String birthday;
    private String email;

    public PersonData(String firstName, String lastName, String birthday, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.email = email;
    }

    public boolean checkBirthday(String birthday) {
        return !this.birthday.equals("") &&
                !this.birthday.equals(Storage.NOT) &&
                this.birthday.equals(birthday);
    }

    public boolean checkEmail(String email) {
        return !this.email.equals("") &&
                !this.email.equals(Storage.NOT) &&
                this.email.equals(email);
    }

    public int getPercent(String birthday, String email) {
        return (this.checkBirthday(birthday) ? Storage.BIRTHDAY_PERCENT : Storage.ZERO) +
                (this.checkEmail(email) ? Storage.EMAIL_PERCENT : Storage.ZERO);
    }
}
