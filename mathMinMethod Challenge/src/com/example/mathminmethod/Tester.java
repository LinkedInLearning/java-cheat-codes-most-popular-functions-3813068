package com.example.mathminmethod;

public class Tester {

    public static void main(String[] args) {
        // Test cases for finding minimum value

        double num1 = 10.5;
        double num2 = 5.2;
        Answer answer1 = new Answer(num1, num2);
        System.out.println("Minimum value of " + num1 + " and " + num2 + ": " + answer1.getMinimumValue());

        // Add more test cases with different values

        /*
         * Expected output:
         * Minimum of 5.2 and 10.8: 5.2
         * Minimum of -3.4 and 2.1: -3.4
         * Minimum of 12.5 and 12.5: 12.5
         */
    }
}