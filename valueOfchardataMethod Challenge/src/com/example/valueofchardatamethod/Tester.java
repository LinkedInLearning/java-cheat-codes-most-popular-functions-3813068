package com.example.valueofchardatamethod;

public class Tester {

    public static void main(String[] args) {
        // Create an Answer object with a sample character array
        char[] data = { 'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!' };
        Answer answer = new Answer(data);
        // **Challenge:** Implement the Answer.valueOf(char[] data) method to convert
        // character arrays into String objects.

        // **Hints:**
        // * Consider using a loop to iterate over the characters in the array.
        // * How can you combine individual characters into a String?

        /*
         * **Expected output:**
         * Created String: Hello, world!
         * Formatted String: Hello, w*rld!
         * Null data handling: null pointer
         * String with newline: Hello
         * world!
         */

    }
}
