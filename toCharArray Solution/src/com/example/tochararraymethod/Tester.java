package com.example.tochararraymethod;

public class Tester {

    public static void main(String[] args) {
        // Create an Answer object with a sample string
        Answer answer = new Answer("Hello, world!");

        // Convert to character array and print individual characters
        char[] charArray = answer.toCharArray();
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println(); // Prints "H e l l o , w o r l d ! "

        // Access and modify a character (optional)
        // Modifies your character at index 7 to be "X"
        char modifiedChar = 'X';
        answer.modifyCharacterAtIndex(7, modifiedChar);
        System.out.println(
                "Modified string (original not affected): " + answer.toStringFromCharArray(answer.toCharArray())); // Prints
                                                                                                                   // "Hello,
                                                                                                                   // Xorld!"

        // Convert the modified array back to a string
        String modifiedString = answer.toStringFromCharArray(charArray);
        System.out.println("String from modified array: " + modifiedString); // Prints "Hello, Xorld!"
    }
}
