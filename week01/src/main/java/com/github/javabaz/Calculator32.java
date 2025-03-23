package com.github.javabaz;

public class Calculator32 {


    public int add(int a, int b) {
        return  a + b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return  a * b;
    }

    public int divide(int a, int b)  {
        if(b !=0){
        return a / b;
        }else {
            throw  new ArithmeticException("Cannot divide by zero");
        }

    }

    public double power(int a , int b){
        return Math.pow(a,b);
    }

    public double mod (int a , int b){
        return a%b;
    }

    public double sqrt (int a){
        return Math.sqrt(a);
    }
}

