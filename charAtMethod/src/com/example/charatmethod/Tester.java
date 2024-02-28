package com.example.charatmethod;

public class Tester {

    public static void main(String[] args) {
        // Create an Answer object with a sample string
        Answer answer = new Answer("Hello, world!");

        // Extract specific characters
        char firstChar = answer.getCharacterAtIndex(0);
        char lastChar = answer.getCharacterAtIndex(answer.getOriginalString().length() - 1);
        System.out.println("First character: " + firstChar); // Prints 'H'
        System.out.println("Last character: " + lastChar); // Prints '!'

        // Handle potential out-of-bounds errors
        try {
            answer.getCharacterAtIndex(-1);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Extract a substring
        String substring = answer.getSubString(7, 12);
        System.out.println("Substring (world): " + substring);

        // Combine charAt() with other methods
        String modifiedString = answer.convertFirstAndLastToUpperCase();
        System.out.println("Modified string: " + modifiedString); // Prints "Hello, WorLD!"
    }
}

