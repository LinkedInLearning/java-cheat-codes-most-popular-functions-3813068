package com.example.getclassmethod;


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

    // **Challenge:** Implement a method named `getClassName()` that retrieves and 
    // returns the name of the current Answer class using the `getClass()` method 
    // and its appropriate methods. 
 
    // **Hint:** The `getClass()` method is inherited from the `Object` class 
    // and returns a `Class` object representing the current object's class. 
    // You can then call methods on the returned `Class` object to get information 
    // about the class, such as its name.

    /* 
    // This commented section is the solution, remove the comments 
    // and complete the method yourself to understand the concept.
    public String getClassName() {
        // Your code to retrieve and return the class name using getClass()
        return ""; // Replace with your implementation
    }
    */
}