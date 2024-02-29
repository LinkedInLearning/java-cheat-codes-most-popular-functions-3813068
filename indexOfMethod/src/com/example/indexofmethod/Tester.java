package com.example.indexofmethod;

public class Tester {

    public static void main(String[] args) {
        // Create an Answer object with a sample string
        Answer answer = new Answer("Hello, world!");

        // Search for a substring
        int index = answer.findSubstringIndex("world");
        System.out.println("Index of 'world': " + index); // Prints 7

        // Search for a character
        index = answer.findSubstringIndex("o");
        System.out.println("Index of first 'o': " + index); // Prints 4

        // Search from a specific index
        index = answer.findSubstringIndexFrom("world", 5);
        System.out.println("Index of 'world' starting from index 5: " + index); // Prints 7

        // Handle cases where the substring is not found
        index = answer.findSubstringIndex("Java");
        if (index == -1) {
            System.out.println("Substring 'Java' not found in the string.");
        }
    }
}

