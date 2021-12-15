package com.itvdn.javaEssential.petrov.lesson009.homeWork.addTask.task001;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTask001 {
    @Test
    void testCar() {
        Car car1 = new Car(100);
        Car car2 = new Car(100);
        Assertions.assertEquals(true, car1.equals(car2));
    }

    @Test
    void testDog() {
        Dog dog1 = new Dog(3);
        Dog dog2 = new Dog(3);
        Assertions.assertEquals(false, dog1.equals(dog2));
    }

    @Test
    void testCat() {
        Cat cat1 = new Cat(4);
        Cat cat2 = new Cat(4);
        Assertions.assertEquals(false, cat1.equals(cat2));
    }

    @Test
    void testHuman() {
        Human human1 =new Human("Mike");
        Human human2 =new Human("Mike");
        Exception exception = Assertions.assertThrows(ClassCastException.class, () -> {
            human1.equals(human2);
        });
        Assertions.assertNotNull(exception);
    }

    @Test
    void testPhone() {
        Phone phone1 = new Phone(11111);
        Phone phone2 = new Phone(11111);
        Assertions.assertEquals(false, phone1.equals(phone2));
    }
}
