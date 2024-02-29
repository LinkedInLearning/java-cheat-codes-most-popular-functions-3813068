package com.example.indexofmethod;

public class Validator {

    public static boolean validateSubstringFound(String mainString, String substring, int foundIndex) {
        // Ensure the found index is within the string's bounds and matches the substring
        return foundIndex >= 0 && foundIndex < mainString.length() && mainString.substring(foundIndex).startsWith(substring);
    }
}
