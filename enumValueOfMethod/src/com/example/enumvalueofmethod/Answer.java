package com.example.enumvalueofmethod;

public class Answer {

    // Defines the available music genres as an enum within the "Answer" class
    public enum Genre {
        ROCK, POP, COUNTRY, CLASSICAL, JAZZ, BLUES, ELECTRONIC, FOLK, RNB, LATIN;
    }

    private String chosenGenreString; // Stores the string representing the chosen genre
    private Genre chosenGenreEnum; // Stores the enum equivalent of the chosen genre (if valid)

    public Answer(String chosenGenreString) {
        this.chosenGenreString = chosenGenreString;
        try {
            // Attempt to convert the string to an enum constant, ignoring case
            this.chosenGenreEnum = Genre.valueOf(chosenGenreString.toUpperCase());
        } catch (IllegalArgumentException e) {
            // If the string is not a valid genre, handle the error and set the enum to null
            System.out.println("Invalid genre: " + chosenGenreString);
            this.chosenGenreEnum = null;
        }
    }

    public Genre getChosenGenreEnum() {
        // Returns the chosen genre as an enum (or null if invalid)
        return chosenGenreEnum;
    }

    public String getChosenGenreString() {
        // Returns the chosen genre as a string
        return chosenGenreString;
    }

    // Optional method to check if the chosen genre is valid
    public boolean isValidGenre() {
        return chosenGenreEnum != null; // True if the enum is not null (valid genre)
    }

    // Optional method to provide a description for a given genre (example implementation)
    public String getGenreDescription(Genre genre) {
        switch (genre) {
            case ROCK:
                return "High-energy music with electric guitars and drums.";
            case POP:
                return "Catchy and popular music with diverse styles.";
            // ... add descriptions for other genres
            default:
                return "No description available.";
        }
    }
}
