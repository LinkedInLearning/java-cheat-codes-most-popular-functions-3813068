package com.example.hashcodemethod;

import java.util.Objects;

public class Answer {

    private String title;
    private String author;
    private int publicationYear;

    public Answer(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // **Challenge:** Implement this method to generate a hash code representing the
    // object's state.
    //
    // **Hint:** Consider the significant fields for determining "equality" between
    // Answer objects.
    @Override
    public int hashCode() {
        // TODO: Implement the logic to generate a hash code based on relevant fields
    }
}
