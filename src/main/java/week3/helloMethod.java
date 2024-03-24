package week3;

import static input.InputUtils.stringInput;

public class helloMethod { // this is the main method
    public static void main(String[] args) {
        String name = stringInput("Please enter your name");
        String greeting = makeGreeting(name);// this main method call a method called makegreeting and it has an argument
        System.out.println(greeting);

    }

    public static String makeGreeting(String n) { // this is the make greeting method and it has a string parameter
        String greeting = "hello " + n + "!";
        return greeting; // it return a string value to the main method.
        // when we create a method, we have to define the method type
        // if it is String or int or double
    }
}
/*
we create a method to avoid repetitive tasks and once we write the method we can call the method
whenever we need. it is also important to organize our codes. it divide large tasks in to sub tasks.
a method should have one specific tasks.  
 */