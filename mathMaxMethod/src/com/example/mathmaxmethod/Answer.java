package com.example.mathmaxmethod;

public class Answer {

    private double firstNumber;
    private double secondNumber;
    private double biggerNumber;

    public Answer(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.biggerNumber = findBiggerNumber();
    }

    private double findBiggerNumber() {
        // Use Math.max() to find the bigger number
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    // (Optional) Access the original numbers
    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    // Access the bigger number
    public double getBiggerNumber() {
        return biggerNumber;
    }
}
