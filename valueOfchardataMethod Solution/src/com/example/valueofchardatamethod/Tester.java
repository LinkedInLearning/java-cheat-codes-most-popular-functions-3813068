package com.example.valueofchardatamethod;

public class Tester {

    public static void main(String[] args) {
        // Create an Answer object with a sample character array
        char[] data = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        Answer answer = new Answer(data);

        // Create a String from the data
        String string = answer.createString();
        System.out.println("Created String: " + string); // Prints "Hello, world!"

        // Create a formatted String with replaced characters
        String formattedString = answer.createFormattedString('*', 7, 10);
        System.out.println("Formatted String: " + formattedString); // Prints "Hello, w*rld!"

        // Handle null data or unexpected characters
        char[] nullData = null;
        try {
            answer = new Answer(nullData);
            System.out.println("Null data String: " + answer.createString()); // Throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null data handling: " + e.getMessage());
        }

        //inputting new line
        char[] invalidData = {'H', 'e', 'l', 'l', '\n', 'w', 'o', 'r', 'l', 'd', '!'};
        answer = new Answer(invalidData);
        string = answer.createString();
        System.out.println("String with newline: " + string); // Prints "Hello\nworld!" with unexpected newline
    }
}
