package com.example.charatmethod;

public class Answer {

    // Stores the original string
    private String originalString;

    // Constructor to initialize the Answer object
    public Answer(String originalString) {
        this.originalString = originalString;
    }

    // Accesses a character at a specific index
    public char getCharacterAtIndex(int index) {
        // Explain potential out-of-bounds errors and string length check
        if (index < 0 || index >= originalString.length()) {
            throw new StringIndexOutOfBoundsException("Index out of bounds");
        }
        return originalString.charAt(index);
    }

    // Extracts a substring based on starting and ending indices
    public String getSubString(int startIndex, int endIndex) {
        // Explain correct index handling for substrings
        if (startIndex < 0 || endIndex < 0 || startIndex > endIndex || endIndex >= originalString.length()) {
            throw new StringIndexOutOfBoundsException("Invalid substring indices");
        }
        return originalString.substring(startIndex, endIndex);
    }

    // Combines charAt() with other methods for manipulation
    public String convertFirstAndLastToUpperCase() {
        char firstChar = getCharacterAtIndex(0);
        char lastChar = getCharacterAtIndex(originalString.length() - 1);
        String remainingChars = getSubString(1, originalString.length() - 1);
        return Character.toUpperCase(firstChar) + remainingChars + Character.toUpperCase(lastChar);
    }

    // Getter method to access the original string (public for access)
    public String getOriginalString() {
        return originalString;
    }
}


