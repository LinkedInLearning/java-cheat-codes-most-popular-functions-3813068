package com.example.arraylistremovemethod;
import java.util.ArrayList;

public class Validator {

    /**
     * Ensures that the provided index is within the valid range of the ArrayList.
     * 
     * @param list The ArrayList to validate.
     * @param index The index to check.
     * @throws IndexOutOfBoundsException If the index is out of bounds.
     */
    public static void validateIndex(ArrayList<?> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Invalid index!");
        }
    }

    // Additional validation methods (e.g., for empty lists)
}
