package com.itvdn.javaEssential.petrov.lesson009.homeWork.addTask.task002;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTask002 {
    @Test
    void testBicycle() {
        Bicycle bicycle1 = new Bicycle("Start", 20);
        Bicycle bicycle2 = new Bicycle("Start", 20);
        Assertions.assertEquals(true, bicycle1.equals(bicycle2));
    }
}
