package com.github.javabaz;

public class Calculator29 {

    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public int divide(int a, int b) {
        if ( b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            int result = a / b;
            return result;
        }
    }
}

