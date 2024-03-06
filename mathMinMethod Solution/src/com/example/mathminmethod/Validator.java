package com.example.mathminmethod;

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

    // No additional validation needed for Math.min() in this context
}

