/* Создайте класс MyClass<T>, содержащий статический фабричный метод - T factoryMethod(), который
будет порождать экземпляры типа, указанного в качестве параметра типа (указателя места заполнения
типом – Т).*/

package com.itvdn.javaEssential.petrov.lesson010.homeWork;

public class MyClass<T> {
    private T field;

    private MyClass(T field) {
        this.field = field;
    }

    private T getField() {
        return field;
    }

    public static <T> T factoryMethod(T field) {
        return new MyClass<T>(field).getField();
    }

    public static void main(String[] args) {
        String string = MyClass.factoryMethod("test");
        Integer integer = MyClass.factoryMethod(10);
        System.out.println(string);
        System.out.println(string.getClass());
        System.out.println(integer);
        System.out.println(integer.getClass());
    }
}
