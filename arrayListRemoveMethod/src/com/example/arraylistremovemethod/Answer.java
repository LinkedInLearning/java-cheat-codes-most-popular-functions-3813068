package com.example.arraylistremovemethod;

public class Answer {

    // Example object with properties to add to ArrayList (can be customized)
    private String name;
    private int age;

    public Answer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age; // Or other properties as needed
    }


    // Getters and toString() method as before
}

