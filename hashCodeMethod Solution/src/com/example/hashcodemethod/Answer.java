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

    @Override
    public int hashCode() {
        return Objects.hash(title.toLowerCase(), publicationYear);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Answer other = (Answer) obj;
        // Adjust equality check based on specific requirements (title, author, year)
        return title.equalsIgnoreCase(other.title) &&
                publicationYear == other.publicationYear;
    }

    @Override
    public String toString() {
        return "Answer{title='" + title + "', author='" + author + "', publicationYear=" + publicationYear + "}";
    }
}
