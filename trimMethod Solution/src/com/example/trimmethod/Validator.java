package com.example.trimmethod;

public class Validator {

    public static boolean isWhitespaceCharacter(char c) {
        // Check if the character is a space, tab, newline, or other designated whitespace
        return Character.isWhitespace(c);
    }

    public static boolean isAllWhitespace(String str) {
        // Check if all characters in the string are whitespace
        for (char c : str.toCharArray()) {
            if (!isWhitespaceCharacter(c)) {
                return false;
            }
        }
        return true;
    }
}

