package com.example.getclassmethod;


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

    // Learner task: Use getClass().getName() in a meaningful way within this class
    public String getClassName() {
        return getClass().getName();  // Example usage of getClass().getName()
    }

    /* Second way:
     * Class myClass = getClass();
     * return myClass.getName();
     */
}