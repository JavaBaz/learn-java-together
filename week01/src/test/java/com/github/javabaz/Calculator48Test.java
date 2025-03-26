package com.github.javabaz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator48Test {

    private Calculator48 calculator48;

    @BeforeEach
    public void setUp() {
        calculator48 = new Calculator48();
    }

    @Test
    void testAdd() {
        assertEquals(9,calculator48.printSum(5,4),"should be 9");
        assertEquals(100,calculator48.printSum(99,1),"should be 100");
    }

    @Test
    void testSubtract() {
        assertEquals(1,calculator48.printSubtract(5,4),"should be 1");
        assertEquals(0,calculator48.printSubtract(99,99),"should be 0");
    }

    @Test
    void testMultiply() {
        assertEquals(20,calculator48.printMultiply(5,4),"should be 20");
        assertEquals(100,calculator48.printMultiply(10,10),"should be 100");
    }

    @Test
    void testDivide() {
        assertEquals(6,calculator48.printDivide(24,4),"should be 6");
        assertEquals(2.5,calculator48.printDivide(5,2),"should be 2.5");
    }
}
