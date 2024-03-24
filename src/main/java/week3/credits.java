package week3;

import static input.InputUtils.intInput;

public class credits {
    public static void main(String[] args) {
        // this is the main method
        // this method interact with the user and asks some question
        // the user input their answer
        // the main method will call the creditreqiredtograduate method to calculate the remaining credits to graduate
        int required = intInput("How many credit does your program required?");
        int earned = intInput("How many credit do you earned?");
        int creditNeededToGraduate = creditRequiredToGraduate(required,earned);
        System.out.println("you need " + creditNeededToGraduate + " credits to graduate");

    }// this method will do the maths and return the value to the main method
    public static int creditRequiredToGraduate(int creditRequired, int creditEarned){
        int creditToGraduate = creditRequired - creditEarned;
        return creditToGraduate;
    }
}
