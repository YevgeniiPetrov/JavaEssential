/* Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен принимать
целочисленное значение (возраст животного), и содержать перегруженный метод toString(), который
должен возвращать название экземпляра и возраст животного.*/

package com.itvdn.javaEssential.petrov.lesson007.homeWork;

public enum Animals {
    CAT(5), DOG(3), HORSE(7);

    private int age;
    private String name;

    Animals(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s: name - %s, age - %d", super.toString(), name, age);
    }

    public static void main(String[] args) {
        CAT.setName("Murzik");
        DOG.setName("Sharik");
        HORSE.setName("Kashtan");
        System.out.println(CAT);
        System.out.println(DOG);
        System.out.println(HORSE);
    }
}
