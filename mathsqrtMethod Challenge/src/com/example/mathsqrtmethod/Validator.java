package com.example.mathsqrtmethod;

public class Validator {

    // Check if the input is a valid double
    public static boolean isDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Check if the input is positive
    public static boolean isPositive(double number) {
        return number > 0.0;
    }
}

