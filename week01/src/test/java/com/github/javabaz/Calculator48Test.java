package com.github.javabaz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Calculator48Test {

    private Calculator48 calculator48;

    @BeforeEach
    public void setUp() {
        calculator48 = new Calculator48();
    }

    @Test
    void testCalculateSum() {
        assertEquals(9, calculator48.sum(5, 4), "5 + 4 should be 9");
        assertEquals(100, calculator48.sum(99, 1), "99 + 1 should be 100");
        assertEquals(-1, calculator48.sum(-3, 2), "-3 + 2 should be -1");
    }

    @Test
    void testCalculateSubtract() {
        assertEquals(1, calculator48.subtract(5, 4), "5 - 4 should be 1");
        assertEquals(0, calculator48.subtract(99, 99), "99 - 99 should be 0");
        assertEquals(-5, calculator48.subtract(5, 10), "5 - 10 should be -5");
    }

    @Test
    void testCalculateMultiply() {
        assertEquals(20, calculator48.multiply(5, 4), "5 * 4 should be 20");
        assertEquals(100, calculator48.multiply(10, 10), "10 * 10 should be 100");
        assertEquals(0, calculator48.multiply(0, 10), "0 * 10 should be 0");
        assertEquals(-15, calculator48.multiply(3, -5), "3 * -5 should be -15");
    }

    @Test
    void testCalculateDivide() {
        assertEquals(6.0f, calculator48.divide(24, 4), 0.0001, "24 / 4 should be 6.0");
        assertEquals(2.5f, calculator48.divide(5, 2), 0.0001, "5 / 2 should be 2.5");
        assertEquals(-2.0f, calculator48.divide(-4, 2), 0.0001, "-4 / 2 should be -2.0");
    }

    @Test
    void testCalculateDivideByZero() {
        assertEquals(Float.NaN, calculator48.divide(5, 0), "Division by zero should return NaN");
        assertEquals(ArithmeticException.class, calculator48.divide(5,0), "Division by zero should throw ArithmeticException");
    }

    @Test
    void testCalculateModulus() {
        assertEquals(0, calculator48.modulus(24, 4), "24 % 4 should be 0");
        assertEquals(1, calculator48.modulus(5, 2), "5 % 2 should be 1");
        assertEquals(2, calculator48.modulus(11, 3), "11 % 3 should be 2");
    }

    @Test
    void testCalculateAverage() {
        assertEquals(4.5, calculator48.average(5, 4), 0.0001, "Average of 5 and 4 should be 4.5");
        assertEquals(50.0, calculator48.average(0, 100), 0.0001, "Average of 0 and 100 should be 50.0");
        assertEquals(-1.5, calculator48.average(-3, 0), 0.0001, "Average of -3 and 0 should be -1.5");
    }

    @Test
    void testCalculatePower() {
        assertEquals(8.0, calculator48.power(2, 3), 0.0001, "2^3 should be 8.0");
        assertEquals(1.0, calculator48.power(5, 0), 0.0001, "5^0 should be 1.0");
        assertEquals(0.25, calculator48.power(2, -2), 0.0001, "2^-2 should be 0.25");
    }
}
