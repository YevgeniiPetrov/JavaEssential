package com.itvdn.javaEssential.petrov.lesson008.homeWork.addTask;

import com.itvdn.javaEssential.petrov.lesson008.homeWork.addTask.exception.ArithmeticResultException;
import com.itvdn.javaEssential.petrov.lesson008.homeWork.addTask.exception.DivideByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator {
    @Test
    void testAdd() {
        Assertions.assertEquals(3, Calculator.add(1, 2));
    }

    @Test
    void testSub() {
        Assertions.assertEquals(1, Calculator.sub(2, 1));
    }

    @Test
    void testMul() {
        Assertions.assertEquals(10, Calculator.mul(2, 5));
    }

    @Test
    void testDiv() throws DivideByZeroException {
        Assertions.assertEquals(2, Calculator.div(10, 5));
    }

    @Test
    void testGetArithmeticResult() throws DivideByZeroException, ArithmeticResultException {
        Assertions.assertEquals(15, Calculator.getArithmeticResult(10, 5, "+"));
        Assertions.assertEquals(5, Calculator.getArithmeticResult(10, 5, "-"));
        Assertions.assertEquals(50, Calculator.getArithmeticResult(10, 5, "*"));
        Assertions.assertEquals(2, Calculator.getArithmeticResult(10, 5, "/"));
    }
}
