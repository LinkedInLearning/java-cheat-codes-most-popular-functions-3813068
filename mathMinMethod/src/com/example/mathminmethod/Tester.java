package com.example.mathminmethod;

public class Tester {

    public static void main(String[] args) {
        // Basic cases
        System.out.println("Minimum of 5.2 and 10.8: " + new Answer(5.2, 10.8).getMinimumValue()); // Output: 5.2
        System.out.println("Minimum of -3.4 and 2.1: " + new Answer(-3.4, 2.1).getMinimumValue()); // Output: -3.4

        // Equal numbers
        System.out.println("Minimum of 12.5 and 12.5: " + new Answer(12.5, 12.5).getMinimumValue()); // Output: 12.5

        // Special cases: NaN and negative zero
        System.out.println("Minimum of Double.NaN and 15.6: " + new Answer(Double.NaN, 15.6).getMinimumValue()); // Output: 15.6
        System.out.println("Minimum of -0.0 and 0.0: " + new Answer(-0.0, 0.0).getMinimumValue()); // Output: -0.0

        // (Optional) More test cases involving different double values and edge cases
    }
}
