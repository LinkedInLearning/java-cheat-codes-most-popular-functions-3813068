package com.example.mathmaxmethod;

public class Answer {

    private double number1;
    private double number2;
    private double maximumValue;

    public Answer(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;

        // Use Math.max to find the bigger number and store it
        this.maximumValue = Math.max(number1, number2);
    }

    // Access the original numbers
    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    // Access the maximum value
    public double getMaximumValue() {
        return maximumValue;
    }
}
