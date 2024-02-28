package com.example.mathmaxmethod;

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

    // No additional validation needed for Math.max() in this context
}
