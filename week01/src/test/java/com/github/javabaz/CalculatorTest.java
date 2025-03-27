package com.github.javabaz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    private Calculator07 calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator07();
    }

    @Test
    void testAddition() {
        assertEquals(8, calculator.add(5, 3), "5 + 3 should be 8");
        assertEquals(-2, calculator.add(-5, 3), "-5 + 3 should be -2");
        assertEquals(0, calculator.add(0, 0), "0 + 0 should be 0");
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3), "5 - 3 should be 2");
        assertEquals(-8, calculator.subtract(-5, 3), "-5 - 3 should be -8");
        assertEquals(0, calculator.subtract(3, 3), "3 - 3 should be 0");
    }

    @Test
    void testMultiplication() {
        assertEquals(15, calculator.multiply(5, 3), "5 * 3 should be 15");
        assertEquals(-15, calculator.multiply(-5, 3), "-5 * 3 should be -15");
        assertEquals(0, calculator.multiply(0, 3), "0 * 3 should be 0");
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(6, 3), "6 / 3 should be 2");
        assertEquals(-2, calculator.divide(-6, 3), "-6 / 3 should be -2");
        assertEquals(0, calculator.divide(0, 5), "0 / 5 should be 0");
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }


    @Test
    void testPow() {
        assertEquals(8, calculator.power(2, 3), "2 ^ 3 should be 2");
        assertEquals(-8, calculator.power(-2, 3), "-2 ^ 3 should be -2");
        assertEquals(1, calculator.power(10, 0), "10 ^ 0 should be 0");
    }

    @Test
    void testMod() {
        assertEquals(1, calculator.mod(10, 3), "2 ^ 3 should be 2");
        assertEquals(0, calculator.mod(10, 5), "-2 ^ 3 should be -2");
        assertEquals(2, calculator.mod(10, 4), "10 ^ 0 should be 0");
    }

    @Test
    void testsqrt() {
        assertEquals(10, calculator.sqrt(100), "100 should be 10");
        assertEquals(9, calculator.sqrt(81), "81 should be 9");
        assertEquals(8, calculator.sqrt(64), "64 should be 8");
    }


}