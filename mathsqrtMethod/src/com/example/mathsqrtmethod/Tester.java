package com.example.mathsqrtmethod;

public class Tester {

    public static void main(String[] args) {
        // Test with positive inputs
        double positiveNumber1 = 25.0;
        Answer answer1 = new Answer(positiveNumber1);
        double squareRoot1 = answer1.calculateSquareRoot();
        System.out.println("Square root of " + positiveNumber1 + ": " + squareRoot1); // Output: 5.0

        double positiveNumber2 = 144.0;
        Answer answer2 = new Answer(positiveNumber2);
        double squareRoot2 = answer2.calculateSquareRoot();
        System.out.println("Square root of " + positiveNumber2 + ": " + squareRoot2); // Output: 12.0

        // Test with negative inputs (explain limitations)
        double negativeNumber = -9.0;
        try {
            Answer answer3 = new Answer(negativeNumber);
            double invalidRoot = answer3.calculateSquareRoot();
            System.out.println("Square root of " + negativeNumber + ": " + invalidRoot); // This line won't be reached
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Square root of negative numbers is undefined.");
        }

        // Example calculation using square root: area of a square
        double sideLength = 5.0;
        double area = sideLength * sideLength;
        double diagonal = Math.sqrt(2 * area);
        System.out.println("Diagonal of square with side " + sideLength + ": " + diagonal); // Output depends on sideLength

        // (Optional) More calculations or explanations involving square root
    }
}

