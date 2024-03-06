package com.example.arraylistremovemethod;

import java.util.ArrayList;

public class Tester {

    public static void main(String[] args) {
        // Create an ArrayList of Answer objects
        ArrayList<Answer> answers = new ArrayList<>();
        answers.add(new Answer("Alice", 30));
        answers.add(new Answer("Bob", 25));
        answers.add(new Answer("Charlie", 35));

        // Removing elements by index
        answers.remove(1); // Removes "Bob"

        // Removing multiple elements (example)
        for (int i = answers.size() - 1; i >= 0; i--) {
            if (answers.get(i).getAge() > 30) {
                answers.remove(i);
            }
        }

        // Printing the ArrayList (demonstrating removals)
        System.out.println("ArrayList contents:");
        for (Answer answer : answers) {
            System.out.println(answer);
        }
    }
}
