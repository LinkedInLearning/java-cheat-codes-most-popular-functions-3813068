package com.example.indexofmethod;

public class Answer {

    // Stores the main string for analysis
    private String mainString;

    // Constructor to initialize the main string
    public Answer(String mainString) {
        this.mainString = mainString;
    }

    // Method to find the first occurrence of a substring
    public int findSubstringIndex(String substring) {
        // Explain that indexOf() searches for the substring and returns its first index
        return mainString.indexOf(substring);
    }

    // Method to find the first occurrence of a substring starting from a specified index
    public int findSubstringIndexFrom(String substring, int fromIndex) {
        // Explain that indexOf(substring, fromIndex) starts searching at a specific index
        return mainString.indexOf(substring, fromIndex);
    }
}

