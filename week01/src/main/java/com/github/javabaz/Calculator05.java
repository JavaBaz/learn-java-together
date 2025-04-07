package com.github.javabaz;

public class Calculator05 {

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

    public double pow(int a, int b) {
        //double pow = Math.pow(a, b);
        //step three 0^0
        if (a == 0 && b == 0) {
            throw new ArithmeticException("Undefined");
        }
        //step five 1/0
        if (a == 0 && b < 0) {
            throw new ArithmeticException("Undefined: divide by zero");
        }

        double pow = 1;

        // step one
        for (int i = 1; i <= Math.abs(b); i++) { // ghadre motlagh = Math.abs(b)
            pow = a * pow;
        }

        // step two
        // اگر توان منفی باشه باید پایه رو ببریم زیر خط کسری
        // اول مثبت میشه بعد میره توانش خساب میشه بعد میره زیر یک
        // اگر توان منفی بود، معکوس را برگردان
        if (b < 0) {
            return 1 / pow;
        }

        return pow;
    }

}

