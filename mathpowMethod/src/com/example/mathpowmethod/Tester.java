package com.example.mathpowmethod;

public class Tester {

    public static void main(String[] args) {
        // Simple power calculations
        double base1 = 2.0;
        double exponent1 = 3.0;
        Answer answer1 = new Answer(base1, exponent1);
        double power1 = answer1.calculatePower();
        System.out.println(base1 + " raised to the power of " + exponent1 + ": " + power1); // Output: 8.0

        double base2 = 10.0;
        double exponent2 = -2.0;
        Answer answer2 = new Answer(base2, exponent2);
        double power2 = answer2.calculatePower();
        System.out.println(base2 + " raised to the power of " + exponent2 + ": " + power2); // Output: 0.1

        // Explain fractional and negative exponents
        double base3 = 2.0;
        double exponent3 = 0.5;
        Answer answer3 = new Answer(base3, exponent3);
        double power3 = answer3.calculatePower();
        System.out.println(base3 + " raised to the power of " + exponent3 + ": " + power3); // Output: 1.4142135623730951

        // Example calculation: compound interest
        double principal = 1000.0;
        double interestRate = 0.05; // 5%
        int years = 5;
        double amount = principal * Math.pow(1 + interestRate, years);
        System.out.println("Amount after " + years + " years with " + interestRate * 100 + "% interest: " + amount); // Output depends on values

        // (Optional) More calculations or explanations involving Math.pow()
    }
}
