package com.example.mathpowmethod;

public class Answer {

    private double base;
    private double exponent;

    public Answer(double base, double exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    // Calculates the power using Math.pow()
    public double calculatePower() {
        return Math.pow(base, exponent);
    }

    // (Optional) Access the original base and exponent
    public double getBase() {
        return base;
    }

    public double getExponent() {
        return exponent;
    }
}

