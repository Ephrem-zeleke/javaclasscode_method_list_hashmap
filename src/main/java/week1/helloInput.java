package week1;

import static input.InputUtils.*;

public class helloInput {
    public static void main(String[] args) {
        String name = stringInput("enter your name");
        System.out.println("hello " + name);

        // get some number input
        // to get the user input, we have to import the input.InputUtils.intInput
        //int numberOfClass = intInput("how many classes are you taking this semester?");
        //System.out.println("you are taking " + numberOfClass + " class(es)");
        // if the user write a negative number, the program will print out the negative number
        // but that doesn't make sense so we have to adjust our program to accept only positive number
        int numberOfClasses = positiveIntInput("how many classes are you taking this semester?");
        //System.out.println("you are taking " + numberOfClasses + " class(es)");
        String units = "classes";
        /*
        the word classes and class looks messy when it prints out but we can fix it using the if
        conditional statement class for one class and classes for more than one class.
         */
        if (numberOfClasses == 1) {
            units = "class";
        }
        System.out.println("you are taking " + numberOfClasses + " " + units + " this semester");
    }


}
