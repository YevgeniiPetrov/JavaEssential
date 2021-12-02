/* Создайте перечислительный тип (enum) Vehicles, содержащий конструктор, который должен принимать
целочисленное значение (стоимость автомобиля), содержать метод getColor(), который возвращает
строку с цветом автомобиля, и содержать перегруженный метод toString(), который должен возвращать
строку с названием экземпляра, цветом и стоимостью автомобиля.*/

package com.itvdn.javaEssential.petrov.lesson007.homeWork;

public enum Vehicles {
    BMW(9000), AUDI(10000), MERCEDES(12000);

    private int price;
    private String color;

    Vehicles(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s: color - %s, price - %d", super.toString(), color, price);
    }

    public static void main(String[] args) {
        BMW.setColor("black");
        AUDI.setColor("red");
        MERCEDES.setColor("white");
        System.out.println(BMW);
        System.out.println(AUDI);
        System.out.println(MERCEDES);
    }
}
