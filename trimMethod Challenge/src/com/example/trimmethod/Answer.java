package com.example.trimmethod;

public class Answer {

    // Stores the original string
    private String originalString;

    public Answer(String originalString) {
        this.originalString = originalString;
    }

    // **Challenge:** Implement a method named `trimWhitespace()` that removes
    // leading and trailing whitespace characters (spaces, tabs, newlines) from
    // the original string. You can utilize the built-in String methods to
    // achieve this functionality.

    // **Hint:** Explore the String class documentation or search online for
    // information on built-in methods that can help you remove whitespace
    // from strings.

    /*
     * // This commented section is the solution, remove the comments
     * // and complete the method yourself to understand the concept.
     * public String trimWhitespace() {
     * return originalString.trim(); // Replace with your implementation
     * }
     */

    // Removes specified characters from the original string
    public String removeCustomWhitespace(String charactersToRemove) {
        return originalString.replaceAll("[" + charactersToRemove + "]", "");
    }

    // Access the original string
    public String getOriginalString() {
        return originalString;
    }
}
