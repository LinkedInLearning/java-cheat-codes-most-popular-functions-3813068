package com.example.mathmaxmethod;


public class Tester {

    public static void main(String[] args) {
        // Compare ages of two friends
        double mariaAge = 10.5; // Maria is 10.5 years old
        double davidAge = 11.2; // David is 11.2 years old

        Answer ageComparison = new Answer(mariaAge, davidAge);

        System.out.println("Maria is " + ageComparison.getFirstNumber() + " years old.");
        System.out.println("David is " + ageComparison.getSecondNumber() + " years old.");

        if (ageComparison.getBiggerNumber() == mariaAge) {
            System.out.println("Maria is older than David."); // This will NOT be printed
        } else {
            System.out.println("David is older than David."); // This will be printed
        }

        // Compare movie ratings
        double firstMovieRating = 4.6;
        double secondMovieRating = 4.1;

        Answer ratingComparison = new Answer(firstMovieRating, secondMovieRating);

        System.out.println("The first movie has a rating of " + ratingComparison.getFirstNumber() + ".");
        System.out.println("The second movie has a rating of " + ratingComparison.getSecondNumber() + ".");

        if (ratingComparison.getBiggerNumber() == firstMovieRating) {
            System.out.println("The first movie has a higher rating."); // This will be printed
        } else {
            System.out.println("The second movie has a higher rating."); // This will NOT be printed
        }
    }
}
