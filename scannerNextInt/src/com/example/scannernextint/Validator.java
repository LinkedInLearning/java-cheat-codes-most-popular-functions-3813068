package com.example.scannernextint;

public class Validator {

    public static boolean isValidInteger(int input) {
        // Add any desired validation logic here, e.g.:
        return input > 0; // Example: Check if the input is a positive integer
    }

    public static boolean isInputInteger(String input) {
        try {
            Integer.parseInt(input);
            return true; // Valid integer if parsing succeeds
        } catch (NumberFormatException e) {
            return false; // Not an integer if parsing fails
        }
    }
}
