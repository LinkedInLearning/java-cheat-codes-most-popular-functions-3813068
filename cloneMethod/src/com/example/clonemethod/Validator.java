package com.example.clonemethod;

public class Validator {

    public static boolean validateClone(Object original, Object clone) {
        return !original.equals(clone) && original.getClass().equals(clone.getClass());
    }

    // can add other methods for testing other aspects of cloning
}

