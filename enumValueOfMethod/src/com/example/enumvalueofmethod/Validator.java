package com.example.enumvalueofmethod;

public class Validator {

    // Validates whether a given string represents a valid Genre enum constant
    public static boolean isValidGenre(String genreString) {
        try {
            // Attempt conversion to uppercase enum constant, ignoring case
            Answer.Genre.valueOf(genreString.toUpperCase());
            return true; // Valid if conversion succeeds
        } catch (IllegalArgumentException e) {
            return false; // Invalid if conversion fails
        }
    }


    // Checks if the genre string length is within a certain limit
    public static boolean isValidLength(String genreString) {
        return genreString.length() <= 30; // Example: Limit to 30 characters
    }

    // Checks if the genre string contains only alphanumeric characters
    public static boolean hasSpecialCharacters(String genreString) {
        return genreString.matches("[a-zA-Z]+"); // Example: Allow only letters
    }
}
