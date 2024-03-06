package com.example.hashcodemethod;

import java.util.Map;
import java.util.HashMap;

public class Tester {

    public static void main(String[] args) {
        // Create book objects
        Answer book1 = new Answer("Pride and Prejudice", "Jane Austen", 1813);
        Answer book2 = new Answer("To Kill a Mockingbird", "Harper Lee", 1960);
        Answer book3 = new Answer("Moby Dick", "Herman Melville", 1851);

        // **Challenge:** Once you have implemented hashCode(), uncomment these lines to
        // test:
        // System.out.println("Book 1 hash code: " + book1.hashCode());
        // System.out.println("Book 2 hash code: " + book2.hashCode());
        // System.out.println("Book 3 hash code: " + book3.hashCode());

        // ... (other test cases)

        /*
         * Expected Output:
         * Book 1 hash code: -1891083966 (Note: Hash codes may vary on different
         * systems)
         * Book 2 hash code: 430816244
         * Book 3 hash code: 1313080200
         * Retrieving book with ISBN123: Answer{title='Pride and Prejudice',
         * author='Jane Austen', publicationYear=1813}
         * Retrieving book with ISBN456: Answer{title='To Kill a Mockingbird',
         * author='Harper Lee', publicationYear=1960}
         * Retrieving book with ISBN789: Answer{title='Moby Dick', author='Herman
         * Melville', publicationYear=1851}
         */
    }
}