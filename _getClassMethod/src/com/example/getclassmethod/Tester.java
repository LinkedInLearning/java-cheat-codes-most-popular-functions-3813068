package com.example.getclassmethod;

public class Tester {

    public static void main(String[] args) {
        Answer answer = new Answer("The answer is 42!");

        // Test the learner's usage of getClass().getName()
        System.out.println("Class name provided by Answer object: " + answer.getClassName());

        // Other reflective exploration tasks...
    }
}