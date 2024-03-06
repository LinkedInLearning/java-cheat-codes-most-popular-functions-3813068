package com.example.mathmaxmethod;

public class Answer {

    private double number1;
    private double number2;
    private double maximumValue;

    public Answer(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    // **Challenge:** Implement this method to find the maximum value of the two numbers. 
        // **Hint:** Explore logic or conditional statements to compare 
        //and identify the larger value.
        // Use Math.max to find the bigger number and store it
        this.maximumValue = /* Implement your logic here */
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
