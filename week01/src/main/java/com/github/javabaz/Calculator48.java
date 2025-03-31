package com.github.javabaz;

/**
 * This class provides basic arithmetic operations such as addition, subtraction, multiplication, etc.
 * Each method takes two numbers as input and returns the result of the operation.
 */
public class Calculator48 {

    //Calculates and returns the sum of two numbers.
    public int sum(int a, int b) {
        return a + b;
    }

    //Calculates and returns to subtract of two numbers.
    public int subtract(int a, int b) {
        return a - b;
    }

    // Calculates and returns the multiply of two numbers.
    public int multiply(int a, int b) {
        return a * b;
    }

    //  Calculates and returns the Divide of two numbers.
    // Throws ArithmeticException if attempting to divide by zero.
    public double divide(double a, double b) {
        if (b == 0f) {
            //    return Float.NaN; // Division by zero
            throw new ArithmeticException("Divide by zero");
        }
        return a / b;
    }

    // Calculates and returns the remainder of modulus between two numbers.
    public int modulus(int a, int b) {
        return a % b;
    }

    // Calculates and returns the average of two numbers.
    public double average(double a, double b) {
        return (a + b) / 2; // Optimized formula
    }

    //Calculates and returns the result of a raised to the power of b.
    public double power(int a, int b) {
        return Math.pow(a, b);
    }

}
