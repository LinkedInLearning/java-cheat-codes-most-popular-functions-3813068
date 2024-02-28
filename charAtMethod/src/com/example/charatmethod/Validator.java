package com.example.charatmethod;

public class Validator {

    public static boolean isIndexValid(String str, int index) {
        return index >= 0 && index < str.length();
    }

    public static boolean isSubstringValid(String str, int startIndex, int endIndex) {
        return startIndex >= 0 && endIndex >= 0 && startIndex <= endIndex && endIndex < str.length();
    }
}
