package com.example.valueofchardatamethod;

public class Validator {

    public static boolean isNullOrEmpty(char[] data) {
        return data == null || data.length == 0;
    }

    public static boolean containsInvalidCharacters(char[] data) {
        for (char c : data) {
            if (!Character.isLetterOrDigit(c) && !Character.isSpaceChar(c)) {
                return true;
            }
        }
        return false;
    }
}
