package com.itvdn.javaEssential.petrov.lesson009.homeWork.addTask.task003;

public class Admin extends User {
    private String system;
    private boolean remote;

    public Admin(String name, String login, String password, boolean admin, String system, boolean remote) {
        super(name, login, password, admin);
        this.system = system;
        this.remote = remote;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + getName() + '\'' +
                ", login='" + getLogin() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", admin='" + isAdmin() + '\'' +
                ", system='" + system + '\'' +
                ", remote=" + remote +
                '}';
    }
}
