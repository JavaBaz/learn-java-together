package com.github.javabaz;

import java.util.Scanner;

public class Calculator48 {

    public int printSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int printSubtract(int a, int b) {
        int subtract = a - b;
        return subtract;
    }

    public int printMultiply(int a, int b) {
        int multiply = a * b;
        return multiply;
    }

    public float printDivide(float a, float b) {
        if (b == 0f) {
            return Float.NaN; //division by zero
            // throw new ArithmeticException("Divide by zero");
        }
        float divide = a / b;
        return divide;
    }

    public int printModulus(int a, int b) {
        return a % b;
    }

    // Calculates the average of two numbers
    public double printAverage(double a, double b) {
        double average = a + b;
        return average / 2;
    }

    public double printPower(int a, int b) {
        double power = Math.pow(a, b);
        return power;
    }

    //check if a number is prime
    public boolean printIsPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator48 calculator48 = new Calculator48();
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        for (int i = 2; i <= number; i++) {
            if (calculator48.printIsPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(calculator48.printDivide(18f, 3f));

    }


}
