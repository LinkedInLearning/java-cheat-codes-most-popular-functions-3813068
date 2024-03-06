package com.example.hashcodemethod;
import java.util.Objects;


public class Validator {

    public static void validateHashCodes(Answer book1, Answer book2, Answer book3) {
        // Test book1
        int expectedHashCode1 = Objects.hash(book1.getTitle(), book1.getPublicationYear()); // Assuming you have getters for title and year
        testHashCode(book1, expectedHashCode1);

        // Test book2
        int expectedHashCode2 = Objects.hash(book2.getTitle(), book2.getPublicationYear());
        testHashCode(book2, expectedHashCode2);

        // Test book3
        int expectedHashCode3 = Objects.hash(book3.getTitle(), book3.getPublicationYear());
        testHashCode(book3, expectedHashCode3);
    }

    // ... other test methods (testNullFields(), testCustomHashCode(), testCollisions())

}
