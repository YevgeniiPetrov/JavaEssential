package com.itvdn.javaEssential.petrov.lesson009.homeWork.addTask.task003;

public class SimpleUser extends User {
    private String position;
    private String email;

    public SimpleUser(String name, String login, String password, boolean admin, String position, String email) {
        super(name, login, password, admin);
        this.position = position;
        this.email = email;
    }

    @Override
    public String toString() {
        return "SimpleUser{" +
                "name='" + getName() + '\'' +
                ", admin='" + isAdmin() + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
