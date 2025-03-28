package com.github.javabaz;

public class Calculator23 {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public int pow(int num, int power) {
        if (power == 0)
            return 1;
        return multiply(num, pow(num, power - 1));
    }

    public int mod(int firstInput, int secondInput) {
        return firstInput % secondInput;
    }

    public double sqrt(int number) {
        double result;
        if (number < 0) {
            result = Double.NaN;
        } else {
            double daronyabiNum = number / 2.0;
            double epsilon = 1e-6;
            while(Math.abs(daronyabiNum * daronyabiNum - number) > epsilon){
                daronyabiNum = (daronyabiNum + number / daronyabiNum) / 2.0;
            }
            result =  daronyabiNum;
        }
        return result;
    }
}

