package com.example.mathroundmethod;

public class Tester {

    public static void main(String[] args) {
        // Rounding positive numbers
        double positiveNumber1 = 5.2;
        Answer answer1 = new Answer(positiveNumber1);
        long roundedNumber1 = answer1.roundNumber();
        System.out.println("Rounded value of " + positiveNumber1 + ": " + roundedNumber1); // Output: 5

        double positiveNumber2 = 12.85;
        Answer answer2 = new Answer(positiveNumber2);
        long roundedNumber2 = answer2.roundNumber();
        System.out.println("Rounded value of " + positiveNumber2 + ": " + roundedNumber2); // Output: 13

        // Rounding negative numbers
        double negativeNumber = -3.6;
        Answer answer3 = new Answer(negativeNumber);
        long roundedNumber3 = answer3.roundNumber();
        System.out.println("Rounded value of " + negativeNumber + ": " + roundedNumber3); // Output: -4

        // Rounding fractional numbers
        double fractionalNumber = 2.5;
        Answer answer4 = new Answer(fractionalNumber);
        long roundedNumber4 = answer4.roundNumber();
        System.out.println("Rounded value of " + fractionalNumber + ": " + roundedNumber4); // Output: 3

        // Using rounding for currency calculations (example)
        double price = 19.99;
        long roundedPrice = Math.round(price * 100) / 100; // Round to two decimal places for cents
        System.out.println("Rounded price: $" + roundedPrice); // Output: $20.00

        // (Optional) More calculations or explanations involving Math.round()
    }
}
