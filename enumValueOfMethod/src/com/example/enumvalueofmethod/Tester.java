package com.example.enumvalueofmethod;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        // Define some example input strings
        String validGenre1 = "Rock";
        String validGenre2 = "pop"; // Case-insensitive
        String invalidGenre = "HipHop";

        // Create "Answer" objects using the input strings
        Answer answer1 = new Answer(validGenre1);
        Answer answer2 = new Answer(validGenre2);
        Answer answer3 = new Answer(invalidGenre);

        // Print the chosen genres as enums (or null if invalid)
        System.out.println("Valid genre 1: " + answer1.getChosenGenreEnum());
        System.out.println("Valid genre 2: " + answer2.getChosenGenreEnum());
        System.out.println("Invalid genre: " + answer3.getChosenGenreEnum()); // Output: null

        // Optional: Use the "isValidGenre" method
        if (answer1.isValidGenre()) {
            System.out.println(answer1.getGenreDescription(answer1.getChosenGenreEnum()));
        }

        // Example of user input:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a genre (or 'list' to see options): ");
        String userChoice = scanner.nextLine();

        if (userChoice.equalsIgnoreCase("list")) {
            System.out.println("Available genres:");
            for (Answer.Genre genre : Answer.Genre.values()) {
                System.out.println(genre);
            }
        } else {
            Answer userInputAnswer = new Answer(userChoice);
            if (userInputAnswer.isValidGenre()) {
                System.out.println("You chose: " + userInputAnswer.getChosenGenreEnum());
            } else {
                System.out.println("Invalid genre entered.");
            }
        }
    }
}
