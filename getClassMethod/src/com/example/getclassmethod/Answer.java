package com.example.getclassmethod;
import java.util.Arrays;


public class Answer {

    private String text;

    public Answer(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void shoutAnswer() {
        System.out.println(text.toUpperCase());
    }
    
    //added to avoid errors
    
    
    //private method to be accessible by Answer.java
    private void privateMethod() {
        System.out.println("This is a private method in Answer class.");
        
    }
    
    //override to make the output more readable than how java outputs class names
    @Override
    public String toString() {
        return "Answer{" +
               "text='" + text + '\'' +
               ", className='" + getClass().getSimpleName() + '\'' +
               ", superclass='" + getClass().getSuperclass().getSimpleName() + '\'' +
               ", interfaces=" + Arrays.toString(getClass().getInterfaces()) +
               '}';
    }

    // Add more methods with different visibility (private, protected) for reflective exploration
}

