package com.itvdn.javaEssential.petrov.lesson009.homeWork.addTask.task003;

public class Main {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("Pasha", "pasha", "12345", false,"specialist", "pasha@company.orh");
        Admin admin = new Admin("Ivan", "ivan", "67890", true, "Linux", true);
        System.out.println(simpleUser);
        System.out.println(admin);
    }
}
