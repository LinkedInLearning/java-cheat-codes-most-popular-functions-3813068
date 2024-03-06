package com.example.tochararraymethod;

public class Answer {

    // Stores the original string
    private String originalString;

    public Answer(String originalString) {
        this.originalString = originalString;
    }

    // Converts the string to a character array
    public char[] toCharArray() {
        // Explain that toCharArray() creates a new array with each character
        return originalString.toCharArray();
    }

    // Accesses and modifies individual characters in the array
    public char getCharacterAtIndex(int index) {
        // Explain that charAt() accesses specific characters from the array
        return toCharArray()[index];
    }

    public void modifyCharacterAtIndex(int index, char newChar) {
        // Explain that modifying the array doesn't affect the original string
        char[] charArray = toCharArray();
        charArray[index] = newChar;
        // Alternatively, explain creating a new String from the modified array
    }

    // Converts the character array back to a string (optional)
    public String toStringFromCharArray(char[] charArray) {
        // Explain that String.valueOf() transforms the array back to a string
        return String.valueOf(charArray);
    }
}

