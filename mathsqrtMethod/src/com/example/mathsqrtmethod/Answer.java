package com.example.mathsqrtmethod;

public class Answer {

    private double number;

    public Answer(double number) {
        this.number = number;
    }

    // Calculates the square root of the stored number
    public double calculateSquareRoot() {
        return Math.sqrt(number);
    }

    // (Optional) Access the original number
    public double getOriginalNumber() {
        return number;
    }
}

