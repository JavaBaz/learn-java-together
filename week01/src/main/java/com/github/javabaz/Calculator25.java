package com.github.javabaz;

public class Calculator25 {


    public int add (int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int subtract (int a, int b) {
        int sub = a - b;
        return sub;
    }

    public int multiply (int a, int b) {
        int multi = a * b;
        return multi;
    }

    public double divide (int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            double div = a / b;
            return div;
        }

    }

}

