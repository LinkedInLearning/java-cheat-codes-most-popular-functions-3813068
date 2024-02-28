package com.example.mathminmethod;
public class Answer {

    private double number1;
    private double number2;
    private double minimumValue;

    public Answer(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
        this.minimumValue = Math.min(number1, number2);
    }

    // Access the original numbers
    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    // Access the minimum value
    public double getMinimumValue() {
        return minimumValue;
    }
}

