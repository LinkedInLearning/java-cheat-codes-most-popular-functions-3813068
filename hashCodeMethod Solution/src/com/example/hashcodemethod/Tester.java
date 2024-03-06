package com.example.hashcodemethod;
import java.util.Map;
import java.util.HashMap;


public class Tester {

    public static void main(String[] args) {
        Answer book1 = new Answer("Pride and Prejudice", "Jane Austen", 1813);
        Answer book2 = new Answer("To Kill a Mockingbird", "Harper Lee", 1960);
        Answer book3 = new Answer("Moby Dick", "Herman Melville", 1851);

        // Print hash codes with explanation
        System.out.println("Book 1 hash code: " + book1.hashCode() +
                           " (Note: Hash codes may vary on different systems)");
        System.out.println("Book 2 hash code: " + book2.hashCode());
        System.out.println("Book 3 hash code: " + book3.hashCode());

        // Simulate HashMap usage (assuming unique ISBN keys)
        Map<String, Answer> library = new HashMap<>();
        library.put("ISBN123", book1);
        library.put("ISBN456", book2);
        library.put("ISBN789", book3);

        System.out.println("Retrieving book with ISBN123: " + library.get("ISBN123"));
        System.out.println("Retrieving book with ISBN456: " + library.get("ISBN456"));
        System.out.println("Retrieving book with ISBN789: " + library.get("ISBN789"));

        // Optional: Call Validator methods to test expected outcomes
      
    }
    
   
}
