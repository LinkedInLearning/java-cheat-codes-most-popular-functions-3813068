package com.example.getclassmethod;

import java.lang.reflect.Method;

public class Validator {

    public static void validateAnswerClass(Object answer) {
        Class<?> answerClass = answer.getClass();

        // Check for required methods
        try {
            Method getTextMethod = answerClass.getMethod("getText");
            Method shoutAnswerMethod = answerClass.getMethod("shoutAnswer");
            System.out.println("The Answer class has the required methods.");
        } catch (NoSuchMethodException e) {
            System.out.println("The Answer class is missing required methods!");
        }

        // Implement more validation checks based on class properties and methods
    }
}
