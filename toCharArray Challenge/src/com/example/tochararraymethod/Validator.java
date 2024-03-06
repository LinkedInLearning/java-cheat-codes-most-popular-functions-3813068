package com.example.tochararraymethod;

public class Validator {

    public static boolean compareStringAndCharArray(String originalString, char[] charArray) {
        // Ensure the string and array have the same length and characters match
        if (originalString.length() != charArray.length) {
            return false;
        }
        for (int i = 0; i < originalString.length(); i++) {
            if (originalString.charAt(i) != charArray[i]) {
                return false;
            }
        }
        return true;
    }
}

