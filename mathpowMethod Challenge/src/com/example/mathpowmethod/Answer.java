package com.example.mathpowmethod;

public class Answer {

    private double base;
    private double exponent;

    public Answer(double base, double exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    // **Challenge:** Implement this method to calculate the power of the base
    // raised to the exponent.
    //
    // **Hint:** Explore the Java Math class to find a method that can help you with
    // this calculation.
    public double calculatePower() {
        // TODO: Implement the logic to calculate the power using the stored base and
        // exponent.
    }

    // (Optional) Access the original base and exponent
    public double getBase() {
        return base;
    }

    public double getExponent() {
        return exponent;
    }
}
