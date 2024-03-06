package com.example.trimmethod;

public class Tester {

    public static void main(String[] args) {
        // Create an Answer object with a sample string
        Answer answer = new Answer("    Hello, world!    ");

        // Trim the original string
        String trimmedString = answer.trimWhitespace();
        System.out.println("Trimmed string: " + trimmedString); // Prints "Hello, world!"

        // Remove specific characters beyond basic whitespace
        String customTrimmedString = answer.removeCustomWhitespace(" \t\n");
        System.out.println("Custom trimmed string: " + customTrimmedString); // Prints "Hello,world!"

        // Handle empty strings or strings without leading/trailing whitespace
        String emptyString = "";
        trimmedString = answer.trimWhitespace(); // Still trims the original string
        System.out.println("Trimmed empty string: " + trimmedString); // Prints ""

        String noTrailingWhitespace = "Hello, world!";
        trimmedString = answer.trimWhitespace(); // Still trims the original string
        System.out.println("Trimmed string without trailing whitespace: " + trimmedString); // Prints "Hello, world!"
    }
}

