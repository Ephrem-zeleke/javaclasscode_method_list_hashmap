package org.example;

import static input.InputUtils.stringInput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String name = stringInput("enter your name?");
        System.out.println("hello " + name);
    }


}