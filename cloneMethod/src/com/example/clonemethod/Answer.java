package com.example.clonemethod;

public class Answer implements Cloneable {

    private String name;

    public Answer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Override clone() method
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
