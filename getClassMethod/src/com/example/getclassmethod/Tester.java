package com.example.getclassmethod;

import java.lang.reflect.Method;

public class Tester {

    public static void main(String[] args) {
        Answer answer = new Answer("The answer is 42!");

        // Get the class object
        Class<?> answerClass = answer.getClass();

        // Explore class information
        System.out.println("Class name: " + answerClass.getName());
        System.out.println("Superclass name: " + answerClass.getSuperclass().getName());
        System.out.println("Interfaces: " + answerClass.getInterfaces());

        // Dynamically invoke methods
        try {
            Method shoutMethod = answerClass.getMethod("shoutAnswer");
            shoutMethod.invoke(answer); // Output: THE ANSWER IS 42!

            // Try invoking a private method using reflection
            Method privateMethod = answerClass.getDeclaredMethod("privateMethod");
            privateMethod.setAccessible(true); // Allow access to private method
            privateMethod.invoke(answer);
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }

        // Dynamic type checks
        if (answerClass.isAssignableFrom(Answer.class)) {
            System.out.println("The object is an instance of the Answer class.");
        } else {
            System.out.println("The object is not an instance of the Answer class.");
        }
    }
}
