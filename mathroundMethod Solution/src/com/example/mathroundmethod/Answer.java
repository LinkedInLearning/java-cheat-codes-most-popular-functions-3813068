package com.example.mathroundmethod;

public class Answer {

    private double number;

    public Answer(double number) {
        this.number = number;
    }

    // Rounds the number to the nearest integer using Math.round()
    public long roundNumber() {
        return Math.round(number);
    }

    // (Optional) Access the original number
    public double getOriginalNumber() {
        return number;
    }
}
