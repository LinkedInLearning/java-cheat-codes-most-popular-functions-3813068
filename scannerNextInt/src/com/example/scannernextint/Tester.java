package com.example.scannernextint;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Tester {

    public static void main(String[] args) {
        // Scanner object (not used in this hardcoded example)
        Scanner scanner = new Scanner(System.in);

        // Hardcoded integer input (replace with desired input)
        int userInputInt = 42;

        try {
            // Create an Answer object with the hardcoded input
            Answer answer = new Answer(userInputInt);

            // Print the stored integer
            System.out.println("You entered: " + answer.getUserInputInt());
        } catch (InputMismatchException e) {
            // This block won't execute because we're using a hardcoded integer
            System.out.println("Invalid input! Please enter an integer.");
        }
    }
}
