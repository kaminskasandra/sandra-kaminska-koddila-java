package com.kodilla.testing.calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(18,5);

        if (result == 23) {
            System.out.println("OK");
        }else {
            System.out.println("Error");
        }

        int result2 = calculator.subtract(18,5);

        if (result2 == 13) {
            System.out.println("OK");
        }else {
            System.out.println("Error");
        }
    }
}
