package week1;

import static input.InputUtils.*;

public class java_string_library {
    public static void main(String[] args) {
        String name = stringInput("enter your name?");
        // the length() library counts the number of characters in the string
        // the if statement check the condition and if it is true, it will print out the statements
        if (name.length() > 5) {
            System.out.println("your name is longer than 5 letters");
            // the else statement will be executed if the if statement is false
        }else {
            System.out.println("your name is 5 letter or less");
        }

        boolean hasTakenITConcept =yesNoInput("have you taken ITEC 1110 Info tech concept");
        boolean hasTakenITSkills = yesNoInput("have you taken ITEC 1110 Info  tech skills");
        boolean hasTakenWindows = yesNoInput("have you taken ITEC 1250 windows operating system");

        // checking more than one condition using &&
        if (hasTakenITConcept && hasTakenITSkills && hasTakenWindows) {
            System.out.println("you meet the pre-requisites, you may take ITEC 1310 Microcomputer system maintenance");
        }else {
            System.out.println("you don't meet the pre-requisites, you need to take all the pre-requisites");
        }
        System.out.println("Are you eligible to be the president of the united state?");
        System.out.println("please answer this three questions");

        boolean naturalBornCitizen = yesNoInput("were you born in the united state?");
        int age = positiveIntInput("what is your age in year?");
        int yearsLivedInUSA = positiveIntInput("how many years have you lived in USA?");

        if (naturalBornCitizen && age >= 35 && yearsLivedInUSA >= 14) {
            System.out.println("you meet the eligibility requirements to be the president of the united state, GOOD LUCK");
        }else {
            System.out.println("you're not eligible to be the president of the united state");
        }
        // use the or || to check either conditions are true

        System.out.println("Are you eligible to take the android app development?");
        System.out.println("answer this two questions");

        boolean hasTakenCsharp = yesNoInput("Have you taken ITEC 2505 C# programming?");
        boolean hasTakenJava = yesNoInput("Have you taken ITEC 2545 Java programming?");
        // checking either one of the two conditions are true and decide what statement to print
        if (hasTakenCsharp || hasTakenJava) {
            System.out.println("you're eligible to take android app development");
        }else {
            System.out.println("you are not eligible!");
        }


    }
}
