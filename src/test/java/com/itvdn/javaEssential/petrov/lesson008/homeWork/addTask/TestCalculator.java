package com.itvdn.javaEssential.petrov.lesson008.homeWork.addTask;

import com.itvdn.javaEssential.petrov.lesson008.homeWork.addTask.exception.ArithmeticResultException;
import com.itvdn.javaEssential.petrov.lesson008.homeWork.addTask.exception.DivideByZeroException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {
    @Test
    void testAdd() {
        assertEquals(3, com.itvdn.javaEssential.petrov.lesson008.homeWork.addTask.Calculator.add(1, 2));
    }

    @Test
    void testSub() {
        assertEquals(1, Calculator.sub(2, 1));
    }

    @Test
    void testMul() {
        assertEquals(10, Calculator.mul(2, 5));
    }

    @Test
    void testDiv() throws DivideByZeroException {
        assertEquals(2, Calculator.div(10, 5));
    }

    @Test
    void testDivThrowsDivideByZeroException() {
        Exception exception = assertThrows(DivideByZeroException.class, () -> {
            Calculator.getArithmeticResult(10, 0, "/");
        });
        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    void testGetArithmeticResult() throws DivideByZeroException, ArithmeticResultException {
        assertEquals(15, Calculator.getArithmeticResult(10, 5, "+"));
        assertEquals(5, Calculator.getArithmeticResult(10, 5, "-"));
        assertEquals(50, Calculator.getArithmeticResult(10, 5, "*"));
        assertEquals(2, Calculator.getArithmeticResult(10, 5, "/"));
    }

    @Test
    void testGetArithmeticResultThrowsArithmeticResultException() {
        Exception exception = assertThrows(ArithmeticResultException.class, () -> {
            Calculator.getArithmeticResult(10, 5, "&");
        });
        assertEquals("The specified arithmetic operation is absent or not provided", exception.getMessage());
    }

    @Test
    void testGetArithmeticResultThrowsDivideByZeroException() {
        Exception exception = assertThrows(DivideByZeroException.class, () -> {
            Calculator.getArithmeticResult(10, 0, "/");
        });
        assertEquals("/ by zero", exception.getMessage());
    }
}
