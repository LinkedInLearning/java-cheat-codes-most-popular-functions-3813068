package com.example.trimmethod;

public class Answer {

    // Stores the original string
    private String originalString;

    public Answer(String originalString) {
        this.originalString = originalString;
    }

    // Removes leading and trailing whitespace from the original string
    public String trimWhitespace() {
        return originalString.trim();
    }

    // Removes specified characters from the original string
    public String removeCustomWhitespace(String charactersToRemove) {
        return originalString.replaceAll("[" + charactersToRemove + "]", "");
    }

    // Access the original string (optional)
    public String getOriginalString() {
        return originalString;
    }
}



