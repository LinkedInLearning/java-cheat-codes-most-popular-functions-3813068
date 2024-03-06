package com.example.mathpowmethod;

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

    // (Optional) Check if the base is positive (for advanced validation)
    public static boolean isPositive(double number) {
        return number > 0.0;
    }
}

