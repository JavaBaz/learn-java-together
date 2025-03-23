package com.github.javabaz;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                           Hello, world!
                           Welcome to week 1 :D
                           """);

        Calculator32 calc=new Calculator32();

        System.out.println(calc.divide(10,0));

    }
}