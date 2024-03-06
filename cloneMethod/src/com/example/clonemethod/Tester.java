package com.example.clonemethod;

public class Tester {

    public static void main(String[] args) throws CloneNotSupportedException {
        Answer answer1 = new Answer("Alice");

        // Try cloning using default clone()
        Answer answer2 = (Answer) answer1.clone();

        // Set name in cloned object
        answer2.setName("Bob");

        // Check original name
        System.out.println("Original name: " + answer1.getName()); // Should print "Alice"
    }
}


